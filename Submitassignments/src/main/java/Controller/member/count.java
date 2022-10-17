package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dao.noticDao;

@WebServlet("/member/count")
public class count extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public count() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String nNUm = request.getParameter("nNum");
		boolean result = noticDao.getInstance().count(nNUm);
		
		System.out.println("SERVLet :"+result);
		response.getWriter().print(result);
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
