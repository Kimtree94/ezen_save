package DATABAES.가계부;

import java.util.ArrayList;

public class MoneyBook_Controller {

	//1. 내용추가 컨트롤러
	
	boolean create(String edate, int emoney , String ecomment) {
		
		//매개변수 3 개 --> 1개 dto 선언
		DB_DTO dto = new DB_DTO(0,edate,emoney,ecomment);

		System.out.println(dto);
		//dto객체
		return MoneyBook_DAO.getinstance().create(dto);
		
		
	}
	
	//2. 내용호출 컨트롤러 
	 
	ArrayList<DB_DTO> read(){
		 return MoneyBook_DAO.getinstance().read();
	
	}
	
	
	//3. 내용삭제 컨트롤러 
	boolean delete(int getList_num) {
		return MoneyBook_DAO.getinstance().delete(getList_num);
	}

	//4.
	boolean update(int a , String b , int c , String d) {
		return MoneyBook_DAO.getinstance().update(new DB_DTO(a,b,c,d));
		
	}
}
