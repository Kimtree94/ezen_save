package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dao.ProductDao;


@WebServlet("/product/plike")
public class plike extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public plike() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청
		int pno = Integer.parseInt(request.getParameter("pno")); 
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid"));
		//2. db처리
		System.out.println("서블릿넘버.."+pno);System.out.println("서블릿넘버.."+mno);
		int result =new ProductDao().setplike(mno,pno);
		//3. 응답
		response.getWriter().print(result); // 1 : 취소 2 : 등록 3: db오류
		System.out.println("결과//"+result);
	
	
	
	
	
	
	
	
	}

}
