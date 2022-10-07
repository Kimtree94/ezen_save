package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/member/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//=======ajax======//
		//1. js ajax에게 변수 요청
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		//2. DAO DB메소드 호출
		int result = MemberDao.getInstance().login(mid, mpassword);
		//3. db메소드 반환 결과를  js ajax 에게 응답 
		response.getWriter().print(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
		String mid= request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		//변수 2개라 dto 사용 안함  
		// dao 메소드 호출
		int result=
		MemberDao.getInstance().login(mid, mpassword);
		// true 이면 index.jsp false 이면 login.jsp
		if(result) {response.sendRedirect("/jspweb/index.jsp");}
		else{ response.sendRedirect("/jspweb/member/login.jsp"); }
		*/
		
		
		
		
		
		
	}

}
