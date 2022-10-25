package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dto.ProductDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 첨부파일이 있을경우에 [ 업로드용 ]*/
		MultipartRequest mulit = new MultipartRequest(
				request,
				request.getSession().getServletContext().getRealPath("/admin/pimg"),
				1024*1024*10, 
				"UTF-8",
				new DefaultFileRenamePolicy()); 
		
		String pname = mulit.getParameter("pname"); 							System.out.println(pname);
		String pcomment = mulit.getParameter("pcomment");						System.out.println(pcomment);
		int pprice = Integer.parseInt( mulit.getParameter("pprice"));			System.out.println(pprice);
		float pdiscount = Float.parseFloat( mulit.getParameter("pdiscount"));	System.out.println(pdiscount);
		String pimg = mulit.getFilesystemName("pimg");		System.out.println(pimg);
		
		
		ProductDto dto = new ProductDto(0, pname, pcomment, pprice, pdiscount, (byte)0, pimg, null, 0);
		
		System.out.println(dto.toString()); //dto 확인용 
	}
	
	
	
	private static final long serialVersionUID = 1L;
       
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
 
}
