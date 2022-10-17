package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dao.noticDao;

/**
 * Servlet implementation class recoment
 */
@WebServlet("/member/recoment")
public class recoment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public recoment() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String recoment = request.getParameter("recoment");
		String rewriter = request.getParameter("rewriter");
		boolean result = noticDao.getInstance().recoment(recoment, rewriter);
		
		response.getWriter().print(result);
	
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
