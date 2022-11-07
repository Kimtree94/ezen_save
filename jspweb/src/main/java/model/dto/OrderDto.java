package model.dto;

public class OrderDto {
	private int ono;
	private String oname;
	private String ophone;
	private String oaddress;
	private String orequest;
	private String odate;
	private int mno;
	private int odno;
	private int odamaount;
	private int odprice;
	private int odactive;
	private int pstno;

	public OrderDto() {
		super();
	}

	public OrderDto(int ono, String oname, String ophone, String oaddress, String orequest, String odate, int mno,
			int odno, int odamaount, int odprice, int odactive, int pstno) {
		super();
		this.ono = ono;
		this.oname = oname;
		this.ophone = ophone;
		this.oaddress = oaddress;
		this.orequest = orequest;
		this.odate = odate;
		this.mno = mno;
		this.odno = odno;
		this.odamaount = odamaount;
		this.odprice = odprice;
		this.odactive = odactive;
		this.pstno = pstno;
	}

	public int getOno() {
		return ono;
	}

	public void setOno(int ono) {
		this.ono = ono;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOphone() {
		return ophone;
	}

	public void setOphone(String ophone) {
		this.ophone = ophone;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	public String getOrequest() {
		return orequest;
	}

	public void setOrequest(String orequest) {
		this.orequest = orequest;
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getOdno() {
		return odno;
	}

	public void setOdno(int odno) {
		this.odno = odno;
	}

	public int getOdamaount() {
		return odamaount;
	}

	public void setOdamaount(int odamaount) {
		this.odamaount = odamaount;
	}

	public int getOdprice() {
		return odprice;
	}

	public void setOdprice(int odprice) {
		this.odprice = odprice;
	}

	public int getOdactive() {
		return odactive;
	}

	public void setOdactive(int odactive) {
		this.odactive = odactive;
	}

	public int getPstno() {
		return pstno;
	}

	public void setPstno(int pstno) {
		this.pstno = pstno;
	}

	@Override
	public String toString() {
		return "OrderDto [ono=" + ono + ", oname=" + oname + ", ophone=" + ophone + ", oaddress=" + oaddress
				+ ", orequest=" + orequest + ", odate=" + odate + ", mno=" + mno + ", odno=" + odno + ", odamaount="
				+ odamaount + ", odprice=" + odprice + ", odactive=" + odactive + ", pstno=" + pstno + "]";
	}

}
