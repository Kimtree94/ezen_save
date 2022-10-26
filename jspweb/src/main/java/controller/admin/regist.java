package controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.ProductDao;
import model.dto.ProductDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet {
	//1.제품 등록 메소드 [post]
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
		
		int pcno = Integer.parseInt(mulit.getParameter("pcno"));
		System.out.println("pc/////"+pcno);
		ProductDto dto = new ProductDto(0, pname, pcomment, pprice, pdiscount, (byte)0, pimg, null, pcno);
		
		System.out.println(dto.toString()); //dto 확인용 
		
		boolean result = new ProductDao().setProduct(dto);
		
		response.getWriter().print(result);
	}
	
	
	//2.제품출력메소드 [ get]
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//DAO처리
    	ArrayList<ProductDto> list = new ProductDao().getProductlist();
    	//형변환 LIST -> JSON
    	JSONArray array = new JSONArray();
    	for(int i =0 ; i<list.size();i++) {
    		JSONObject object = new JSONObject();
    		object.put("pno", list.get(i).getPno());
    		object.put("pname", list.get(i).getPname());
    		object.put("pcomment", list.get(i).getPcomment());
    		object.put("pprice", list.get(i).getPprice());
    		object.put("pdiscount", list.get(i).getPdiscount());
    		object.put("pactive", list.get(i).getPactive());
    		object.put("pimg", list.get(i).getPimg());
    		object.put("pdate", list.get(i).getPdate());
    		object.put("pcno", list.get(i).getPcno());
    		array.add(object);
    	}
    	response.setCharacterEncoding("UTF-8");
    	response.getWriter().print(array);
    }   
    
    
 //////////////////////////////////////////////////////////////////////////////////////////////  
    private static final long serialVersionUID = 1L;
 
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	
 
}
