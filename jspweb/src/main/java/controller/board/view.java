package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;


@WebServlet("/board/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청
		//int bno =Integer.parseInt(request.getParameter("bno"));
		//System.out.println(bno);
		
		//1.세션요청 [ 세션(object)--->String--->int
			// 다형성 : 무보가 자식에게 강제 형변환 가능
		int bno = (Integer)request.getSession().getAttribute("bno");
		
		
		
		//DAO처리
		BoardDto dto = 
		BoardDao.getInstance().getboard(bno);
		//JSON변환
		JSONObject object = new JSONObject();
		object.put("bno", dto.getBno());
		object.put("btitle", dto.getBtitle());
		object.put("bcontent", dto.getBcontent());
		object.put("mid", dto.getMno());
		object.put("bfile", dto.getBfile());
		
			//* 삭제 , 수정 버튼 활성화를 위한 식별변수 선언 [ 본인글인지 판단 ]
		//1. 로그인한 세션 정보 호출
		String mid = (String)request.getSession().getAttribute("mid");
		//2. 로그인한 세션과 현재 게시물의 작성자와 일치하면 
		if(mid!=null&&mid.equals(dto.getMid())) {
			//현재 로그인된아이디와 현재게시물의 작성자 아이디가 같으면 
			object.put("btnaction", true);
		}
		
		//응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(object);
		
		System.out.println(object);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
