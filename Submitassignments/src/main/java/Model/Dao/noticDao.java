package Model.Dao;

import java.util.ArrayList;

import Model.Dto.noticeDto;
import Model.Dto.recomentDto;

public class noticDao extends DAO {
	private static noticDao ndao = new noticDao();

	public static noticDao getInstance() {
		return ndao;
	}

	// 글쓰기
	public boolean board(noticeDto dto) {
		if(dto==null) {return false;}
		String sql = "insert into notice(ntitle,ncontent,nwriter,nPassword)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNtitle());
			ps.setString(2, dto.getNcontent());
			ps.setString(3, dto.getNwriter());
			ps.setString(4, dto.getnPassword());
			ps.executeUpdate();
			return true;
		}

		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// 글목록
	public ArrayList<noticeDto> getnoticelist() {
		ArrayList<noticeDto> list = new ArrayList<>();
		String sql = "select*from notice";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				noticeDto dto = new noticeDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	// 글삭제
	public boolean deletebox(String nNum, String nPassword) {
		System.out.println("자바 :"+nNum+"/2 :"+nPassword);
		String sql = "delete from notice where nNum= ? and nPassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, nNum);
			ps.setString(2, nPassword);
			int count =ps.executeUpdate();
				if(count==1) {return true;}
		} catch (Exception e) {
			System.out.println(e);
		}return false;

	}
	
	//선택시 글출력 
	
	public ArrayList<noticeDto> detaile(String nNum) {
		System.out.println("다오::"+nNum);
		
		ArrayList<noticeDto> list = new ArrayList<>();
		String sql = "select * from notice where nNum=? ";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, nNum);
			rs=ps.executeQuery();
			if(rs.next()) {
				noticeDto dto = new noticeDto(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getInt(7));
				System.out.println(dto);
				list.add(dto);
			}
		} catch (Exception e) {System.out.println(e); }
		return list;
	}
	
	//선택시 조회수 증가 
	public boolean count(String nNum) {
		System.out.println("DAO :"+nNum);
	String sql = "UPDATE notice SET nview = IFNULL(nview, 0) + 1 WHERE nNum=?";	
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, nNum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e);}return false;
	}

	//댓글 등록 
	public boolean recoment(String recoment ,String rewriter) {
		String sql = "INSERT INTO recoment( rcontent , rwriter ) VALUES( ?, ?) ";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, recoment);
			ps.setString(2, rewriter);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("오류:"+e);}return false;
	}
	//댓글 출력
	public ArrayList<recomentDto> recomentlist(){
		ArrayList<recomentDto> list = new  ArrayList<>();
		String sql = "select * from recoment";
		try {
			ps= con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				recomentDto dto = new recomentDto(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
				System.out.println("댓글리스트/"+dto);
				list.add(dto);
				return list;
			}
		} catch (Exception e) {System.out.println("sql오류 : "+e);}
		return list;
	}
	
	
	
	
	
	
}
