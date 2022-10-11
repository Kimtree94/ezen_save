package Controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Dao.noticDao;
import Model.Dto.noticeDto;

/**
 * Servlet implementation class notice
 */
@WebServlet("/member/notice")
public class notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public notice() {super();}
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// =======ajax======//
		// 1. js ajax에게 변수 요청
		String ntitle = request.getParameter("ntitle");
		String ncontent = request.getParameter("ncontent");
		String nwriter = request.getParameter("nwriter");
		String nPassword = request.getParameter("nPassword");
		
		noticeDto dto = new noticeDto(ntitle, ncontent, nwriter,  nPassword);
		// 2. DAO DB메소드 호출
		boolean result = noticDao.getInstance().board(dto);
		System.out.println(result);
		//******* 만약에 로그인을 성공하면 세션 할당 
		response.getWriter().print(result);
	}
	
}
