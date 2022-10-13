package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Dao.noticDao;

/**
 * Servlet implementation class deletebox
 */
@WebServlet("/member/deletebox")
public class deletebox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deletebox() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nNum = request.getParameter("nNum");
		String nPassword = request.getParameter("nPassword2");

		boolean result = noticDao.getInstance().deletebox(nNum, nPassword);
		
		response.getWriter().print(result);
		
		System.out.println("자바"+result);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
