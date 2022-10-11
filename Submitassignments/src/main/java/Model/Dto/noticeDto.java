package Model.Dto;

public class noticeDto {
	private int nNum;
	private String ntitle ;
	private String ncontent;
	private String nwriter;
	private String nPassword;
	private String ndate;
	private int nview;
	
	public noticeDto() {
		super();
	}

	public noticeDto(String ntitle, String ncontent, String nwriter, String nPassword) {
		super();
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.nwriter = nwriter;
		this.nPassword = nPassword;
	}

	public noticeDto(int nNum, String ntitle, String ncontent, String nwriter, String nPassword, String ndate,
			int nview) {
		super();
		this.nNum = nNum;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.nwriter = nwriter;
		this.nPassword = nPassword;
		this.ndate = ndate;
		this.nview = nview;
	}

	public int getnNum() {
		return nNum;
	}

	public void setnNum(int nNum) {
		this.nNum = nNum;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNwriter() {
		return nwriter;
	}

	public void setNwriter(String nwriter) {
		this.nwriter = nwriter;
	}

	public String getnPassword() {
		return nPassword;
	}

	public void setnPassword(String nPassword) {
		this.nPassword = nPassword;
	}

	public String getNdate() {
		return ndate;
	}

	public void setNdate(String ndate) {
		this.ndate = ndate;
	}

	public int getNview() {
		return nview;
	}

	public void setNview(int nview) {
		this.nview = nview;
	}

	@Override
	public String toString() {
		return "noticeDto [nNum=" + nNum + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", nwriter=" + nwriter
				+ ", nPassword=" + nPassword + ", ndate=" + ndate + ", nview=" + nview + "]";
	}
	
	
	
	
	
}
