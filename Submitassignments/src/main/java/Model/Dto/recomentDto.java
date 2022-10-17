package Model.Dto;

public class recomentDto {
	
	private int rNum;
	private String rcontent;
	private String rwriter;
	private String rdate;
	
	
	public recomentDto() {
		super();
	}


	public recomentDto(int rNum, String rcontent, String rwriter, String rdate) {
		super();
		this.rNum = rNum;
		this.rcontent = rcontent;
		this.rwriter = rwriter;
		this.rdate = rdate;
	}


	public int getrNum() {
		return rNum;
	}


	public void setrNum(int rNum) {
		this.rNum = rNum;
	}


	public String getRcontent() {
		return rcontent;
	}


	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}


	public String getRwriter() {
		return rwriter;
	}


	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}


	public String getRdate() {
		return rdate;
	}


	public void setRdate(String rdate) {
		this.rdate = rdate;
	}


	@Override
	public String toString() {
		return "recomentDto [rNum=" + rNum + ", rcontent=" + rcontent + ", rwriter=" + rwriter + ", rdate=" + rdate
				+ "]";
	}
	
	
	
	
	
	
}
