package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.BoardDao;

/**
 * Servlet implementation class viewload
 */
@WebServlet("/board/viewload")
public class viewload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 요청 [ 클릭한 게시물의 번호를 저장 = backend ]

		int bno = Integer.parseInt(request.getParameter("bno"));
		// *세션 : 웹서버에 저장할수 있는 메모리 공간
		// 브라우저마다 할당 [ 유저 마다 메모리 웹서버 할당 ]
		// 서버 종료되거나 시간타이머 브라우저 종료되었을때

		// 2. 세션 객체 만들기
		HttpSession session = request.getSession();
		
		// 3. 클릭한 게시물 번호를 세션에 저장
		session.setAttribute("bno", bno);
		// 4. 로그인한 회원아이디
		String mid = (String)session.getAttribute("mid");
		// 해당 유저가 24시간내 한번도 클릭한 적이 없으면 [ 세션이 없으면 ]
		if (request.getSession().getAttribute(bno + mid) == null) {
			// 3. DAO 조회수 증가
			BoardDao.getInstance().bviewupdate(bno);
			// 3. 현재 유저가 조회를 한 조회수 기록을 남기기 [ 해당 유저가 조회수를 올린적이 있는지 없는지 ]
			request.getSession().setAttribute(bno + mid, true);
			request.getSession().setMaxInactiveInterval(60 * 60 * 24);
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public viewload() {
		super();
		// TODO Auto-generated constructor stub
	}
}
