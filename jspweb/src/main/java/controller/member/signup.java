package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;

//@WebServlet ("URL정의 ") : 해당 클래스를 호출하는 URL 정의
@WebServlet("/member/signup") // 해당 클래스로 매핑 (연결) URL 설정
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public signup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//0.변수 요청시 한글인코딩 [ UTF-8 ]
		 request.setCharacterEncoding("UTF-8");
		
		//1. JSP(HTML) form 입력받은 데이터 요청!!!
		String mid= request.getParameter("mid");
		String mpassword= request.getParameter("mpassword");
		String mpasswordconfirm= request.getParameter("mpasswordconfirm");
		String mname= request.getParameter("mname");
		String mphone= request.getParameter("mphone");
		String memail= request.getParameter("memail");
		
		
		//주소 4개 요청 
		String maddress1 = request.getParameter("maddress1");
		String maddress2 = request.getParameter("maddress2");
		String maddress3 = request.getParameter("maddress3");
		String maddress4 = request.getParameter("maddress4");
		//주소 4개 ==> 하나의 변수
		
		String maddress= maddress1+","+maddress2+","+maddress3+","+maddress4;
		//2. 변수 6개 --> DTO 객체화
		MemberDto dto = new MemberDto(0, mid,
				mpassword,mname,
				mphone, memail,
				 maddress,null, 0);
		//3. 통신 확인 [ HTML -->JAVA ]		
		System.out.println(dto.toString());

		//메소드 호출용 객체 선언
		boolean result = MemberDao.getInstance().singup(dto);
		
		//결과제어 
		if(result) {response.sendRedirect("/jspweb/member/login.jsp");}
		else { }
	
	
	 
		
		//if(result) {System.out.println("회원가입 성공");}
		//else {System.out.println("회원가입 실패 ");}
		doGet(request, response);
	}

}
