package DATABAES.ch3기본문법;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.mysql.cj.xdevapi.Result;

public class DAO {

	
	
	//1. 필드 
	
	Connection con;			//db연결 인터페이스
	PreparedStatement ps;	//sql연결/조작 인터페이스
	ResultSet rs;				//sql 결과[쿼리] 조작 인터페이스 
	
	//2. 생성자
	public DAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/market_db",
					"root",
					"1234");
		} catch (Exception e) {	System.out.println("오류"+e);	}//catch E
	}
	//3. 메소드
	//1. 예제1 : 레코드 10줄 -> memberDto8개 ->배열/리스트

	public ArrayList<MemberDTO> 예제1결과() {
		
		//배열 대신에 배열을 편하게 사용할수 있는 미리 만들어진 클래스 [ 컬렉션 (수집) 프레임워크 ]
			//리스트[선언] : ArrayList< 리스트에 들어갈 클래스 > 리스트명 = new ArrayList<>();
			//리스트에 객체 담기 : 리스트명.add(객체명)
		ArrayList< MemberDTO > list  = new ArrayList<>();//	-MemberDto 로 생성된 객체 여러개를 담을수 있는 list 객체 선언
		//1.sql 작성
		String sql="select*from member";
		//2.sql 연결조작
		try {

			ps = con.prepareStatement(sql);
			//3.sql 결과조작
			rs = ps.executeQuery();
			while( rs.next( )) {
			MemberDTO dto=new MemberDTO(
					rs.getString(1), rs.getString(2),
					rs.getInt(3), rs.getString(4), 
					rs.getString(5), rs.getString(6), 
					rs.getShort(7), rs.getString(8) );
					
					
				//객체 -배열 /리스트 담기
				list.add(dto);
			}//while E
			return list;
		}catch (Exception e) {System.out.println("예제1 오류"+ e);}
		
		return list;
	}// 예제1 결과 메소드 end
	
	//2. 예제 2 : 레코드 10줄 1칸
	ArrayList<String> 예제2결과() {
		//1. String 객체 여러개를 저장할수 있는 list 객체 선언
		ArrayList<String> list =new ArrayList<>();
		String sql="select mem_name from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {//rs.next() : 다음 레코드 이동
				list.add(rs.getString(1));//rs.get자료형 
			}
			return list; // 반환
		} catch (Exception e) {System.out.println("예제2 오류"+ e);}
		return list; //반환
	}
	//3. 예제3 : 레코드1줄 : DTO 1개 
	 ArrayList<MemberDTO> 예제3결과(){
		ArrayList<MemberDTO> list = new ArrayList<>();
		 String sql="select * from member where mem_name = '블랙핑크'";
		 try {
			 ps = con.prepareStatement(sql);
			 rs = ps.executeQuery();
			 while(rs.next()) {
				 MemberDTO dto =new MemberDTO(rs.getString(1), rs.getString(2),
					rs.getInt(3), rs.getString(4), 
					rs.getString(5), rs.getString(6), 
					rs.getShort(7), rs.getString(8) );
				 list.add(dto);
			 }
			 return list;
		} catch (Exception e) {System.out.println("예제3 오류"+ e);}
		 return list;
	 };
	//4. 예제4 : 레코드3줄 :DTO 3개
	 ArrayList<MemberDTO> 예제4결과(){
		 ArrayList<MemberDTO> list=new ArrayList<>();
		String sql="select mem_id , mem_name from member where height <= 162";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
			MemberDTO dto=new MemberDTO();
			dto.mem_id=rs.getString(1);
			dto.mem_name=rs.getString(2);
			list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제4 오류"+ e);}
		return list;
	 }
	//5. 예제5 
	 ArrayList<MemberDTO> 예제5결과(){
		 ArrayList<MemberDTO> list=new ArrayList<>();
		 String sql =" select mem_name , height , mem_number from member where height >= 165 and mem_number > 6";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			 while(rs.next()) {
				 MemberDTO dto =new MemberDTO();
				 dto.mem_name = rs.getString(1);
				 dto.height = rs.getShort(2);
				 dto.mem_number = rs.getInt(3);
				 list.add(dto);
			 }
			 return list;
		} catch (Exception e) {System.out.println("예제5 오류"+ e);}
		 return list;
	 }
	
	 //6.예제6
	 ArrayList<MemberDTO> 예제6결과(){
		 ArrayList<MemberDTO> list=new ArrayList<>();
		 String sql="select mem_name , height , mem_number from member where height >= 165 or mem_number > 6";
		 try {
		 ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				 dto.mem_name = rs.getString(1);
				 dto.height = rs.getShort(2);
				 dto.mem_number = rs.getInt(3);
				 list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제6 오류"+ e);}
		 return list;
	 }
	 
	 //7.예제7
	 ArrayList<MemberDTO> 예제7결과(){
		 ArrayList<MemberDTO> list=new ArrayList<>();
		 String sql="select * from member where mem_name like '우%'";
		 try {
			 ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				 MemberDTO dto =new MemberDTO(rs.getString(1), rs.getString(2),
							rs.getInt(3), rs.getString(4), 
							rs.getString(5), rs.getString(6), 
							rs.getShort(7), rs.getString(8) );
						 list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제7 오류"+ e);}
		 return list;
	 }
	 
	 //8.예제8
	 ArrayList<MemberDTO> 예제8결과(){
		 ArrayList<MemberDTO> list=new ArrayList<>();
		 String sql=" select * from member where mem_name like '__핑크'";
		 try {
			 ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				 MemberDTO dto =new MemberDTO(rs.getString(1), rs.getString(2),
							rs.getInt(3), rs.getString(4), 
							rs.getString(5), rs.getString(6), 
							rs.getShort(7), rs.getString(8) );
						 list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제8 오류"+ e);}
		 return list;
	 }
	 
	 //9 예제9
	 ArrayList<MemberDTO> 예제9결과(){
		 ArrayList<MemberDTO> list =new ArrayList<>();
		 String sql=" select mem_id , mem_name , debut_date from member order by debut_date desc";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				dto.mem_id = rs.getString(1);
				dto.mem_name = rs.getString(2);
				dto.debut_date = rs.getString(3);
				list.add(dto);
			}
			 return list;
		} catch (Exception e) {System.out.println("예제9 오류"+ e);}
		 return list;
	 }
	 
	 //10
	 ArrayList<MemberDTO> 예제10결과(){
		 ArrayList<MemberDTO> list =new ArrayList<>();
		 String sql="  select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				dto.mem_id = rs.getString(1);
				dto.mem_name = rs.getString(2);
				dto.debut_date = rs.getString(3);
				dto.height=rs.getShort(4);
				list.add(dto);
			}
			 return list;
		} catch (Exception e) {System.out.println("예제10 오류"+ e);}
		 return list;
	 }
	 
	 //11
	 ArrayList<MemberDTO> 예제11결과(){
		 ArrayList<MemberDTO> list =new ArrayList<>();
		 String sql=" select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc , debut_date asc";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				dto.mem_id = rs.getString(1);
				dto.mem_name = rs.getString(2);
				dto.debut_date = rs.getString(3);
				dto.height=rs.getShort(4);
				list.add(dto);
			}
			 return list;
		} catch (Exception e) {System.out.println("예제11 오류"+ e);}
		 return list;
	 }
	 
	 //12
	 ArrayList<MemberDTO> 예제12결과(){
		 ArrayList<MemberDTO> list =new ArrayList<>();
		 String sql=" select mem_name , height  from member order by height desc limit 3 , 2";
		 try {
			 ps=con.prepareStatement(sql);
			 rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				dto.mem_name=rs.getString(1);
				dto.height=rs.getShort(2);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제12 오류"+ e);}
		 return list;
	 }
	 
	 
	 //13
	 ArrayList<MemberDTO> 예제13결과(){
		 ArrayList<MemberDTO> list =new ArrayList<>();
		 String sql=" select distinct addr from member";
		 try {
			 ps=con.prepareStatement(sql);
			 rs=ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto=new MemberDTO();
				dto.addr=rs.getString(1);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제13 오류"+ e);}
		 return list;
	 }
	 
	 //14
	 ArrayList<BuyDTO> 예제14결과(){
		 ArrayList<BuyDTO> list =new ArrayList<>();
		 String sql="select mem_id , sum(amount) as 수량합계 from buy group by mem_id";
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				BuyDTO buyDTO=new BuyDTO();
				buyDTO.mem_id=rs.getString(1);
				buyDTO.amount=rs.getInt(2);
				list.add(buyDTO);
			}
			return list;
		} catch (Exception e) {System.out.println("예제14 오류"+ e);}
		 return list;
	 }
	 
	 //15.
	 ArrayList<BuyDTO> 예제15결과(){
		 ArrayList<BuyDTO> list =new ArrayList<>();
		 String sql=" select mem_id as 회원_아이디 , sum( price*amount )  as 총_구매금액 from buy group by mem_id";
		 
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			 while(rs.next()) {
				BuyDTO dto=new BuyDTO();
				dto.mem_id=rs.getString(1);
				dto.price=rs.getInt(2);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제15 오류"+ e);}
		 return list;
	 }
	 
	 //16.
	 
	 ArrayList<ResultDto> 예제16결과(){
		 ArrayList<ResultDto> list =new ArrayList<>();
		 String sql=" select mem_id , avg( amount ) as 수량평균 from buy group by mem_id";
		 
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			 while(rs.next()) {
				ResultDto dto=new ResultDto();
				dto.mem_id=rs.getString(1);
				dto.value=rs.getDouble(2);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제16 오류"+ e);}
		 return list;
	 }
	 
	 //17.
	 ArrayList<BuyDTO> 예제17결과(){
		 ArrayList<BuyDTO> list =new ArrayList<>();
		 String sql="select mem_id , count( phone1 ) as 연락처 from member group by mem_id";
		 
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			 while(rs.next()) {
				BuyDTO dto=new BuyDTO();
				dto.mem_id=rs.getString(1);
				dto.amount=rs.getInt(2);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제17 오류"+ e);}
		 return list;
	 }
	 
	 //18.
	 ArrayList<BuyDTO> 예제18결과(){
		 ArrayList<BuyDTO> list =new ArrayList<>();
		 String sql=" select mem_id , count( * ) as 회원수 from member group by mem_id";
		 
		 try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			 while(rs.next()) {
				BuyDTO dto=new BuyDTO();
				dto.mem_id=rs.getString(1);
				dto.amount=rs.getInt(2);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("예제17 오류"+ e);}
		 return list;
	 }
	 
	 //19.
	 ArrayList<BuyDTO> 예제19결과(){
		 ArrayList<BuyDTO> list = new ArrayList<>();
		 String sql="select mem_id as 회원아이디 , sum( price * amount ) as 총구매금액\r\n"
		 		+ "from buy\r\n"
		 		+ "group by mem_id\r\n"
		 		+ "having sum( price * amount ) > 1000         \r\n"
		 		+ "order by sum( price * amount ) desc";
		 try {
			 ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto=new BuyDTO();
				dto.mem_id=rs.getString(1);
				dto.amount=rs.getInt(2);
				list.add(dto);
			}
			 
			 return list;
		} catch (Exception e) {System.out.println("예제17 오류"+ e);}
		 return list;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}//class E

