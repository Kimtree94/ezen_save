package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
import model.dao.MemberDao;

@WebServlet("/reply/rwrite")
public class rwrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String type = request.getParameter("type"); // 댓글 
			String rcontent = request.getParameter("rcontent");
			int mno = MemberDao.getInstance().getMno(
					(String)request.getSession().getAttribute("mid")
					);
			if(mno==0) {response.getWriter().print("0"); return;}//비로그인일 경우 반환 
			int bno = (Integer)request.getSession().getAttribute("bno");
			boolean result = false;
			//db처리 
			if(type.equals("reply")) {//댓글일 경우
				result = BoardDao.getInstance().rwrite(rcontent,mno,bno);
			}else if(type.equals("rereply")){//대댓글일 경우
				int rindex =Integer.parseInt(request.getParameter("rno"));
				result = BoardDao.getInstance().rrwrite(rcontent , mno, bno , rindex);
			}
			//3.결과 
			if(result) {response.getWriter().print("1");}//성공
			else {response.getWriter().print("2");}
			
   
   
   
		}
		
	
	public rwrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
}
