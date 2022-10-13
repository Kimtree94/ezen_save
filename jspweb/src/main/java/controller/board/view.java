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
		object.put("mno", dto.getMno());
		//응답
		response.getWriter().print(object);
		System.out.println(object);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
