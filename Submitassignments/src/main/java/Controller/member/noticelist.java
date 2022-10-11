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

import com.mysql.cj.xdevapi.JsonArray;

import Model.Dao.noticDao;
import Model.Dto.noticeDto;

@WebServlet("/member/noticelist")
public class noticelist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<noticeDto>list = noticDao.getInstance().getnoticelist();
		
		JSONArray array = new JSONArray();
		for(noticeDto dto :list ) {
			JSONObject object = new JSONObject();
			object.put("nNum", dto.getnNum());
			object.put("ntitle", dto.getNtitle());
			object.put("ncontent", dto.getNcontent());
			object.put("nwriter", dto.getNwriter());
			object.put("nPassword", dto.getnPassword());
			object.put("ndate", dto.getNdate());
			object.put("nview", dto.getNview());
			array.add(object);
			}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
