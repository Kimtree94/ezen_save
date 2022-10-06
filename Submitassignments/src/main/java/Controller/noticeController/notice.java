package Controller.noticeController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dao.noticDao;
import Model.Dto.noticeDto;

/**
 * Servlet implementation class notice
 */
@WebServlet("/View/notice")
public class notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public notice() {super();}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기");
		String ntitle = request.getParameter("ntitle");
		String ncontent = request.getParameter("ncontent");
		String nwriter = request.getParameter("nwriter");
		String nPassword = request.getParameter("nPassword");
		noticeDto dto = new noticeDto(0, ntitle, ncontent, nwriter, nPassword, null, 0);
		System.out.println(dto.toString());
		//메소드 호출용 객체 선언
		boolean result = noticDao.getInstance().board(dto);
		// 결과제어
		if(result) {System.out.println("게시물등록성공!");}
		else {System.out.println("게시물등록실패!");} 
		doGet(request, response);
	}
	
}
