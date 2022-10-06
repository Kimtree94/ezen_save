package model.dto;

public class MemberDto {
			// DB 테이블 필드명 < --- 필드명 ---> java 필드
		 	private int mno;
		 	private String mid ;
		 	private String mpassword ;
		 	private String mname;
		 	private String mphone;	
		 	private String memail;
		 	private String adrress;
		 	private String mdate ; 
		 	private int mpoin  ;
			
		 	
		 	public MemberDto() {
				super();
			}
		 	
			public MemberDto(int mno, String mid, String mpassword, String mname, String mphone, String memail,
					String adrress, String mdate, int mpoin) {
				super();
				this.mno = mno;
				this.mid = mid;
				this.mpassword = mpassword;
				this.mname = mname;
				this.mphone = mphone;
				this.memail = memail;
				this.adrress = adrress;
				this.mdate = mdate;
				this.mpoin = mpoin;
			}
			public int getMno() {
				return mno;
			}
			public void setMno(int mno) {
				this.mno = mno;
			}
			public String getMid() {
				return mid;
			}
			public void setMid(String mid) {
				this.mid = mid;
			}
			public String getMpassword() {
				return mpassword;
			}
			public void setMpassword(String mpassword) {
				this.mpassword = mpassword;
			}
			public String getMname() {
				return mname;
			}
			public void setMname(String mname) {
				this.mname = mname;
			}
			public String getMphone() {
				return mphone;
			}
			public void setMphone(String mphone) {
				this.mphone = mphone;
			}
			public String getMemail() {
				return memail;
			}
			public void setMemail(String memail) {
				this.memail = memail;
			}
			public String getAdrress() {
				return adrress;
			}
			public void setAdrress(String adrress) {
				this.adrress = adrress;
			}
			public String getMdate() {
				return mdate;
			}
			public void setMdate(String mdate) {
				this.mdate = mdate;
			}
			public int getMpoin() {
				return mpoin;
			}
			public void setMpoin(int mpoin) {
				this.mpoin = mpoin;
			}
			@Override
			public String toString() {
				return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname
						+ ", mphone=" + mphone + ", memail=" + memail + ", adrress=" + adrress + ", mdate=" + mdate
						+ ", mpoin=" + mpoin + "]";
			}
			
		 	//생성자2개 , set/get , toString =>자동완성 
		 
}
