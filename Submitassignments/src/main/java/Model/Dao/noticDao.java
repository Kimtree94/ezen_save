package Model.Dao;

import Model.Dto.noticeDto;

public class noticDao extends DAO{
	private static noticDao ndao = new noticDao();
	
	public static noticDao getInstance() {return ndao;}
	
	public boolean board(noticeDto dto) {
		String sql ="insert into notice(ntitle,ncontent,nwriter,nPassword)values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.getNtitle());
			ps.setString(2, dto.getNcontent());
			ps.setString(3, dto.getNwriter());
			ps.setString(4, dto.getnPassword());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
		
	}
	
	
	
	
	
	
}
