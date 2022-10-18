package model.dao;

import java.util.ArrayList;

import model.dto.BoardDto;

public class BoardDao extends Dao {

	private static BoardDao bdao = new BoardDao();
	
	public static BoardDao getInstance() {return bdao;}
	
	
	
	//1. 글등록 
	public boolean write (String btitle , String bcontent,int mno , String bfile) {
		String sql = "insert into board(btitle , bcontent, mno ,bfile) values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, btitle);ps.setString(2, bcontent);
			ps.setInt(3, mno);	ps.setString(4, bfile);
			ps.executeUpdate();return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}//글쓰기 E
	
	//2. 글출력 [ JSP용]
	
	public ArrayList<BoardDto> getlist(int startrow , int listsize) {
		ArrayList<BoardDto> list = new ArrayList<>();
		
		String sql = "select b.* , m.mid from member m , board b "
				+ "where m.mno = b.mno "
				+ "order by b.bdate desc limit "+startrow+","+listsize;
		try {
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				BoardDto dto = new BoardDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getInt(8),
						rs.getString(9)
						);
				list.add(dto); // 리스트에 담기
			}
			return list;
		} catch (Exception e) {System.out.println(e);}
		return list;
	}
	
	//3. 글 조회 
	
	public BoardDto getboard(int bno) {
		String sql = "select b.* , m.mid from member m, board b where m.mno=b.mno and bno= "+bno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				BoardDto dto= new BoardDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), 
						rs.getInt(7), rs.getInt(8),
						rs.getString(9)
						);
						return dto;
			}
		} catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	//4 글삭제 
	public boolean delete(int bno) {
		String sql = "delete from board where bno="+bno;
		try {
			ps=con.prepareStatement(sql);
			int count= ps.executeUpdate();
			if(count==1) {return true;}
		} catch (Exception e) {System.out.println(e);}
			return false;
	}
	
	//5. 첨부파일만 삭제 [ 업데이트 ]
	public boolean bfiledelete (int bno) {
		String sql = "update board set bfile = null where bno ="+bno;
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
		
	}
	
	
	//6 게시물 수정 
	public boolean bupdate(int bno , String btitle , String bcontent , String bfile) {
		
		String sql="update board set btitle=? , bcontent = ? ,"
				+ ",bfile=? where bno = ?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bfile);
			ps.setInt(4, bno);
			ps.executeUpdate();return true;
		} catch (Exception e) {System.out.println(e);}return false;
		
	}
	
	//7 조회수증가 
	public void bviewupdate(int bno) {
		String sql = "update board set bview = bview+1 where bno = "+bno;
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		
	}
	
	//8. 전체 게시물 수 
	public int gettotalsize() {
		String sql="select count(*) from board";
		try {
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {return rs.getInt(1);}
		
		} catch (Exception e) {System.out.println(e);}return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
