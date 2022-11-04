package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dao.ProductDao;
import model.dto.CartDto;

/**
 * Servlet implementation class cart
 */
@WebServlet("/product/cart")
public class cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cart() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1. 요청 
		int mno=MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid")	) ;
		//2. db처리
		System.out.println("카트서블릿"+mno);
		
		ArrayList<CartDto> list = new ProductDao().getCart(mno);
		
		System.out.println("카트서블릿list"+list);
		//*형변환
		JSONArray array = new JSONArray();
		for(CartDto dto :list) {
			JSONObject object = new JSONObject();
			object.put("cartno", dto.getCartno());
			object.put("pstno", dto.getPstno());
			object.put("pname", dto.getPname());
			object.put("pimg", dto.getPimg());
			object.put("pprice", dto.getPprice());
			object.put("pdiscount", dto.getPdiscount());
			object.put("pcolor", dto.getPcolor());
			object.put("psize", dto.getPsize());
			object.put("amount", dto.getAmount());
			array.add(object);
		}
		System.out.println("카트서블릿array"+array);
		//3. 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1.요청
		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("data");
		int pno = Integer.parseInt(request.getParameter("pno"));
		int mno = MemberDao.getInstance().getMno((String) request.getSession().getAttribute("mid"));
		// 문자열 ----> JSON 형 변환
		// 1. String -> Json
		try {
			JSONParser parser = new JSONParser(); // 1.JSONParser parse객체 생성
			JSONArray array = (JSONArray) parser.parse(data); // 2. parser.parse(문자열)

			for (int i = 0; i < array.size(); i++) {
				JSONObject object = (JSONObject) array.get(i);// 순서대로 객체 꺼내기
				// System.out.println("변환후'''''"+object.toString()); 확인용
				
				System.out.println(object);
				// 2.db처리//json객체.get("키") =>값 호출 //!! :재고번호
				String psize = (String)object.get("psize"); System.out.println( "카트자바 psize//"+psize );		
				int amount =Integer.parseInt(String.valueOf(object.get("amount"))); 	 System.out.println( "카트자바 amount//"+amount );	
				String pcolor = (String)object.get("pcolor");			System.out.println( "카트자바 pcolor//"+pcolor );	
				boolean result = new ProductDao().setcart(pno,psize,amount,pcolor, mno);System.out.println( "카트자바 result//"+result );	

				if (result == false) {response.getWriter().print(result);return;}
			}

		} catch (Exception e) {System.out.println("json변환실패" + e);
		
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("true"); // 옵션들을 모두 저장했을 경우 
	}
	
	/*
	   JSON 					강제형변환 [ 부모가 자식한테 ]
	   		" " : 문자열 String	(String)----> O	[부모가 같다 즉 클래스가 동일해서 가능  ]
	   		숫자 : Long			(String)----> X	[메소드를 이용 [String.valueOf( )] 
	 */
	
	
	
	
	
	
	
	
	
}
