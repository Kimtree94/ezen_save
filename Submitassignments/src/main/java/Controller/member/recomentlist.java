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
import Model.Dto.recomentDto;

@WebServlet("/member/recomentlist")
public class recomentlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public recomentlist() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<recomentDto> list = noticDao.getInstance().recomentlist();

		JSONArray array = new JSONArray();
		for (recomentDto dto : list) {
			JSONObject object = new JSONObject();
			object.put("rNum", dto.getrNum());
			object.put("rcontent", dto.getRcontent());
			object.put("rwriter", dto.getRwriter());
			object.put("rdate", dto.getRdate());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
