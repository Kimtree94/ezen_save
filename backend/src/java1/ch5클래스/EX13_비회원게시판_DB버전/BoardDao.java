package java1.ch5클래스.EX13_비회원게시판_DB버전;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDao {
	
	//1. 필드
	//JDBC 자주 사용 하는 클래스/인터페이스
	Connection con;			//DB와 접속할수 있는 인터페이스 
		//con = DriverManager.getConnection("db주소","db계정명",db비밀번호")
		// -- 오류발생 [예외 발생] : 만약에 접속실패 했을때에 대한 대처방안 [예외 처리 try-catch]
	PreparedStatement ps;	//접속된 DB에 SQL 연결 조작하는 인터페이스 
	ResultSet rs;			//SQL 결과를 조작하는 인터페이스 
	
	//2. 생성자
	public BoardDao() {
		// 빈생성자에 DB 접속 코드 (객체 생성시 자동으로 DB 접속)
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boardtest", 
					"root", 
					"1234");
		} catch (Exception e) {
			System.out.println("경고_DB접속실패"+ e);
		}//catch E
	}
	//3.메소드
		//1.등록 메소드
	boolean regist(BoardDto boardDto) {
			//1.sql 작성
		String sql="insert"
					+ "	into"
					+ "		board(b_title , b_content , b_writer , b_password,b_view)"
					+ "    values(  ?, ?, ? ,?, ? )";
				//? : 변수 들어갈 자리 [ 와일드카드 ]
			//2.sql 연결 조작
		try {
		
		ps=con.prepareStatement(sql); // 위에서 작성된 sql를 ps인터페이스 연결
			//** : ? 에 변수 넣기 
			ps.setString(1, boardDto.b_title);		//1 : 첫번째 ? , 데이터 
			ps.setString(2, boardDto.b_content);	//2 : 두번째 ? , 내용
			ps.setString(3, boardDto.b_writer);		//3 : 세번째 ? , 작성자
			ps.setString(4, boardDto.b_password);	//4 : 네번째 ? , 패스워드
			ps.setInt(5, 0);						//5 : 다섯번째 ? , 0 게시물등록시 조회수 0 시작 
		
		ps.executeUpdate();			  // ps 인터페이스 sql 실행 
		return true; //등록 성공시 true
		//3.sql 결과
		}catch (Exception e) {System.out.println("경고)DB오류 :"+ e);}
		return false; //등록 실패시 false
	}
	
	// * 전체 게시물 수 메소드 
	int getrows() {
		
		//1. SQL 작성
		String sql="select count(*)from board";
		//2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next()) {return rs.getInt(1);}//레코드 [행/게시물] 수 반환 
			
		}catch (Exception e) {System.out.println("경고)DB오류 :"+ e);}
		//3. SQL 결과
		return 0; //없으면 0
	}
	
	
		//2.모든 게시물 출력 메소드
	BoardDto[] getBoardlist( ) {
		int rowcount=getrows(); //전게 게시물 수 함수 호출 -> 반환 rowcount 저장 //게시물수를 알려주는 함수 호출해서 반환값 저장 
		BoardDto[] boardlist =new BoardDto[rowcount]; // 배열 선언 [ 배열의길이 = 게시물수 ]
		//1. SQL 작성
		String sql ="select * from board";
		//2. SQL 연결/조작
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
			//ResultSet re : 쿼리[sql결과]에 조작
			int row= 0;//배열에 인덱스를 대체할 변수 선언
			while(rs.next() ) {//rs -> nill --.next() --> 검색된 레코드 [행] --> 다음레코드[행]
				//레코드 한개당 6개의 필드 -> 6개의 변수 -> 객체 -> 배열
				//1. 해당 레코드의 필드를 호출해서 객체화 1
				int b_no = rs.getInt(1);//해당 레코드의 첫번째 필드의 데이터 호출 
				String b_title= rs.getString(2);
				String b_content=rs.getString(3);
				String b_writer=rs.getString(4);
				String b_password=rs.getString(5);
				int b_view=rs.getInt(6);
				BoardDto board = new BoardDto(b_no, b_title, b_content, b_writer, b_password, b_view);
				//1.해당 레코드의 필드를 호출해서 객체화2
					//BoardDto board2 = new BoardDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
				//2.객체를 배열에 저장 
				boardlist[row]=board;
						row++;//인덱스 증가 
				//3.인덱스 증가 
			}//while E
			
		}catch (Exception e) {
			System.out.println("경고_DB오류 :"+e);
		}
		//3. SQL 결과
		
		return boardlist;
	}
		//3.개별 게시물 출력 메소드
	BoardDto getBoard(int b_no) {
		BoardDto board =null;
		
		//1. SQL 작성
		String sql="select * from board where b_no= ?";// ? : 변수가 들어갈 자리 뜻함 
		//2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_no);
			rs = ps.executeQuery();//ResultSet : rs
			if(rs.next()) {
				// 검색된 레코드의 필드를 객체화 
				board = new BoardDto(rs.getInt(1),
						 rs.getString(2),  rs.getString(3), 
						 rs.getString(4),  rs.getString(5), 
						rs.getInt(6));
			}
			
		} catch (Exception e) {System.out.println("경고_DB오류 :"+e);}
		//3. SQL 결과
		
		
		
		
		return board;
	}
	
		//4.수정 처리 메소드
	boolean update(int b_no , String b_password ,String b_title , String b_content) {
		//sql코드 들어갈 예정
		return false;
	}
		//5.삭제 처리 메소드 
	boolean delete(int b_no ,String b_password) {
	
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
