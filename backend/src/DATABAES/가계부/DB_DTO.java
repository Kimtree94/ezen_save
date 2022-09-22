package DATABAES.가계부;

import java.sql.Date;

public class DB_DTO {

	private int list_num;
	private String date;
	private int money;
	private String content;
	
	// 빈 생성자 

	public DB_DTO() {}
	
	// 한번에 담은 생성자 
	public DB_DTO(int list_num, String date, int money, String content) {
		super();
		this.list_num = list_num;
		this.date = date;
		this.money = money;
		this.content = content;
	}

	//priavte 일때 접근방법 
	public int getList_num() {
		return list_num;
	}

	public void setList_num(int list_num) {
		this.list_num = list_num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	
	
}
