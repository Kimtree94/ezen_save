package controller.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/board/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 x
		//2. DB
		ArrayList<BoardDto> list = BoardDao.getInstance().getlist();
			//** arraylist --> jsonarray 변환 [js에서 쓸려고]
			JSONArray array = new JSONArray();
			for(int i=0 ; i<list.size();i++) {
				JSONObject object = new JSONObject();
				object.put("bno", list.get(i).getBno());
				object.put("btitle", list.get(i).getBtitle());
				object.put("bdate", list.get(i).getBcontent());
				object.put("bview", list.get(i).getBcontent());
				object.put("mid", list.get(i).getBcontent());
				array.add(object);
			}
		//3. 응답 
	response.setCharacterEncoding("UTF-8");
	response.getWriter().print(array);
	System.out.println(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}