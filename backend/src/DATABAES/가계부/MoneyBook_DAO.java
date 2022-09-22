package DATABAES.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MoneyBook_DAO {

	//1. 필드
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static MoneyBook_DAO dao = new MoneyBook_DAO();
	//2. 생성자 
	
	private MoneyBook_DAO() {

		try {
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/MoneyBook"	, 
					"root", 
					"1234");
			
		} catch (Exception e) {System.out.println("DB연동 오류"+e);};	
	
	}
	
	//3. 메소드

	public static MoneyBook_DAO getinstance() {return dao;}
	
	
	//4. 내용추가
	
	boolean create(DB_DTO dto) {
		
		String sql="insert into MoneyBook_list values( null , ? , ? , ? ) ";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.getDate());
			ps.setInt(2,dto.getMoney());
			ps.setString(3, dto.getContent());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("추가실패"+e);}
		return false;
	}
	
	//5.화면출력 
	ArrayList<DB_DTO> read(){
		ArrayList<DB_DTO> list = new ArrayList<>();
		String sql="select *from MoneyBook_list";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				//레코드 --> 객체화 [ 포장 ]
				DB_DTO dto = new DB_DTO(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4));
				// 객체 -> 리스트에 담기 
				list.add(dto);
			
			}
			return list;
		} catch (Exception e) {}
		return list;
	}
	
	
	//4. 내용삭제 sql 메소드
	boolean delete(int getList_num) {
		String sql="delete from MoneyBook_list where list_num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, getList_num);
			ps.executeUpdate();return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//3. 
	boolean update(DB_DTO dto ) {
		String sql = "update MoneyBook_list set "
				+ "list_date = ? ,"
				+ " list_money= ?, "
				+ "list_content= ?  "
				+ "where list_num=? ";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.getDate());
			ps.setInt(2, dto.getMoney());
			ps.setString(3, dto.getContent());
			ps.setInt(4, dto.getList_num());
			ps.executeUpdate(); return true;
		} catch (Exception e) {
		return false;
		}
		
	}
	
	
	
}






