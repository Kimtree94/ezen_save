package Controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Model.Dao.noticDao;
import Model.Dto.noticeDto;

/**
 * Servlet implementation class dtail
 */
@WebServlet("/member/dtail")
public class dtail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nNum=request.getParameter("nNum");
		ArrayList<noticeDto> list = noticDao.getInstance().detaile(nNum);
		
		JSONArray array = new JSONArray();
		for(noticeDto dto : list) {
			JSONObject object = new JSONObject();
			object.put("nNum", dto.getnNum());
			object.put("ntitle", dto.getNtitle());
			object.put("ncontent", dto.getNcontent());
			object.put("nwriter", dto.getNwriter());
			object.put("ndate", dto.getNdate());
			object.put("nview", dto.getNview());
			System.out.println("date :"+dto.getNdate());
			array.add(object);
			
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
	}
	public dtail() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
