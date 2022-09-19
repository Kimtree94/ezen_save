package DATABAES.ch3기본문법;

public class BuyDTO {
	String mem_id;
	String prod_name;
	String  group_name;
	int price;
	int amount;
	
	public BuyDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public BuyDTO(String mem_id, String prod_name, String group_name, int price, int amount) {
		super();
		this.mem_id = mem_id;
		this.prod_name = prod_name;
		this.group_name = group_name;
		this.price = price;
		this.amount = amount;
	}
	
 
}
