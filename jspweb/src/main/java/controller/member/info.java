package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.MemberDao;
import model.dto.MemberDto;

/**
 * Servlet implementation class info
 */
@WebServlet("/member/info")
public class info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public info() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청 [ 세션에 로그인 정보 호출 ]
		String mid = (String)request.getSession().getAttribute("mid");
			
		//2.DB
		MemberDto dto=MemberDao.getInstance().getinfo(mid);
		
		//** JS는 DTO 사용이 안됨 [ 아예 다른 언어라서 ]
			//1. JS가 이해할수있는 형식 변경 [ JSON 형식 ] 
			//2. DTO -> JSON 형식 [  JAVA 제공 X =>외부라이브러리 json.simple 필요 ]
			//3. 
		JSONObject object = new JSONObject();
			object.put("mno", dto.getMno());
			object.put("mid", dto.getMid());
			object.put("mname", dto.getMname());
			object.put("mphone", dto.getMphone());
			object.put("memail", dto.getMemail()); 
			object.put("maddress", dto.getAdrress());
			object.put("mdate", dto.getMdate());
			object.put("mpoint", dto.getMpoin());
			
		
		//3. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(object);
		
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
