package java1.ch11API클래스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class 달력Dao {
	
	//1. 필드
	private Connection con;
	private	PreparedStatement ps;
	private ResultSet rs;
	private static 달력Dao dao = new 달력Dao();//싱글톤 
			// 싱글톤을 외부로 호출시키는 메소드
		public static 달력Dao getInstance() {return dao;}
	
	//2. 생성자 [ 싱글톤용 생성자 ]
	private 달력Dao() {
		//private : 접근 제한자 : 외부 클래스에서 사용 불가능 [ 캡슐화 ]
		
		try {
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Calendar"	, 
					"root", 
					"1234");
			
		} catch (Exception e) {System.out.println("DB연동 오류"+e);};	
	
	}
	
	//3.sql 메소드
	boolean 일정추가(String cdate, String ccomment ) {
		String sql ="  insert into Calendar values(null,?,?)";
		try {
			
			ps=con.prepareStatement(sql);
			ps.setString(1, cdate);
			ps.setString(2, ccomment);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	//2.일정 출력 함수 
	HashMap<Integer, ArrayList<String>> 일정출력(String year,String month) {
		
		 String sql=" select * "
		 		+ " from Calendar "
		 		+ " where substring(cdate,1,4)=? and substring(cdate,6,2) = ? ";
		 HashMap<Integer,ArrayList<String> > map = new HashMap<>();
		 try {
			ps=con.prepareStatement(sql);
			
			ps.setString(1, year);
			ps.setString(1, month);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				//레코드 -> 필드2와 필드3 -> 리스트 담기
				ArrayList<String> values = new ArrayList<>();
				values.add(rs.getString(2));
				values.add(rs.getString(3));
				// pk 와 리스트를 map 담기 
				map.put(rs.getInt(1), values);
			}
			return map;
		} catch (Exception e) {}
		 return map;
	}
	
	
	
	
	
}
