package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dao.ProductDao;
import model.dto.OrderDto;

/**
 * Servlet implementation class order
 */
@WebServlet("/product/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public order() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("data");// 결제할 제품 리스트 문자열
		String oinfo = request.getParameter("oinfo");// 받는사람 정보 문자열
		int mno = MemberDao.getInstance().getMno((String) request.getSession().getAttribute("mid"));// 회원번호[주문한사람]
		// 문자열타입 JSON형식 ---> JSON타입 형변환
		JSONParser parser = new JSONParser();
		
		try {
			// 1. 객체 [ 회원정보 문자열 -->jsonobject ]
			JSONObject jsonObject = (JSONObject) parser.parse(oinfo);

			// 2. 리스트 [ 결제할 제품 리스트 문자열 -->jsonarray ]
			JSONArray jsonArray = (JSONArray) parser.parse(data);
			
			ArrayList<OrderDto> list = new ArrayList<>();//주문 dto 담을 리스트 
			// 3. 반복문 [ orderDto객체 -> Dao 처리 ]
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject object = (JSONObject) jsonArray.get(i);
				// 받는사람 정보
				String oname = String.valueOf(jsonObject.get("oname"));
				String ophone = String.valueOf(jsonObject.get("ophone"));
				String oaddress = String.valueOf(jsonObject.get("oaddress"));
				String orequest = String.valueOf(jsonObject.get("orequest"));
				// 주문상세정보
				int odamount = Integer.parseInt(String.valueOf(object.get("amount")));
				int pprice = Integer.parseInt(String.valueOf(object.get("pprice")));
				float pdiscount = Float.parseFloat(String.valueOf(object.get("pdiscount")));
				int odprice = Math.round(pprice - (pprice * pdiscount));
				int pstno = Integer.parseInt(String.valueOf(object.get("pstno")));

				// 주문 dto 생성
				OrderDto dto = new OrderDto(0, oname, ophone, oaddress, orequest, null, mno, 0, odamount, odprice, 0,
						pstno);
				list.add(dto);
				System.out.println("오더 서블릿::"+dto.toString()); // 확인
  
			} // for end
			//4. DB처리
				boolean result = new ProductDao().setOrder(list);
			System.out.println("오더 서블릿 결과::"+result);
			response.getWriter().print(result);// 성공했을때 true

		} catch (Exception e) {
			System.out.println(e);
		}
		response.getWriter().print(false);// 성공했을때 false
	}
}
