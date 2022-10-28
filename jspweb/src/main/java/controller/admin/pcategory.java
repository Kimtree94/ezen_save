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

import model.dao.ProductDao;
import model.dto.PcategoryDto;

/**
 * Servlet implementation class pcategory
 */
@WebServlet("/board/pcategory")
public class pcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    			//1. 요청
    			request.setCharacterEncoding("UTF-8");
    			String pcname = request.getParameter("pcname");
    			
    			//2. dao 처리
    			
    			boolean result =  new ProductDao().setPcategory(pcname); // 싱글톤객체를 사용하지않는 경우 메소드 호출 방식
    			
    			//3. 응답
    			response.getWriter().print(result);
    	
    	}
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		
   		ArrayList<PcategoryDto> list= new ProductDao().getPcategory();
   		
   		JSONArray array = new JSONArray();
		for(PcategoryDto dto:list) {
   		JSONObject object = new JSONObject();
   		object.put("pcno", dto.getPcno());
   		object.put("pcname", dto.getPcname());
   		array.add(object);
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
   	}
    public pcategory() {
        super();
    }
   



}
