package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deletenum =request.getParameter("deletenum");
		String deletepassword = request.getParameter("deletepassword");
		boolean result = noticDao.getInstance().deletebox(deletenum,deletepassword);
		response.getWriter().print(result);
		System.out.println(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
