package DATABAES.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyBook_view {

	Scanner scanner = new Scanner(System.in);
	MoneyBook_Controller control = new MoneyBook_Controller();
	
	public static void main(String[] args) {
		
		MoneyBook_view view = new MoneyBook_view();
		view.menu();
	}
	
	void menu() {
	
	 while(true) {
		 read();
		System.out.println("1.추가 2.삭제 3.수정 4.검색 5.통계");
		
		try {
			int ch=scanner.nextInt();
			if(ch==1) {create();}
			else if(ch==2){delete();}
			else if(ch==3){update();}
			else if(ch==4){}
			else if(ch==5){}
			else {System.out.println("입력할수 없는 번호입니다.");}
		} catch (Exception e) {
		System.out.println("안내)선택할수 없는 작동입니다");
		scanner = new Scanner(System.in);
		}//catch E
	 }// While E
	}//void E
	//1. 내용 추가 화면 메소드
	void create() {
		System.out.print("날짜 :"); String edate = scanner.next();
		System.out.print("금액 :"); int emoney = scanner.nextInt();
		System.out.println("내용 :");scanner.nextLine();String ecomment = scanner.nextLine();
		boolean result = control.create(edate,emoney,ecomment);
		if(result) {System.out.println("등록성공");}
		else {System.out.println("등록실패 ");}
	}
	//2. 내용 출력 화면 메소드
	void read() {
		ArrayList<DB_DTO> list = control.read();
		System.out.println("번호\t날짜\t\t금액\t내용");
		for(DB_DTO dto:list) {
			System.out.print(dto.getList_num()+"\t");
			System.out.print(dto.getDate()+"\t");
			System.out.print(dto.getMoney()+"\t");
			System.out.print(dto.getContent()+"\n");
		}
			//for(타입파라미터 임시변수명 :  리스트/배열){}
	}
	//3. 내용 수정 화면 메소드
	void update() {
		System.out.println("수정할 번호 : ");
		int getList_num = scanner.nextInt();
		System.out.println("수정할 날짜 : ");
		String getDate=scanner.next();
		System.out.println("수정할 금액 : ");
		int getMoney=scanner.nextInt();
		System.out.println("수정할 내용 :");
		scanner.nextLine() ; String getContent=scanner.nextLine();
		boolean result
		= control.update(getList_num,getDate,getMoney,getContent);
		if(result) {System.out.println("수정성공");}
		else {System.out.println("수정실패");}
	}
	//4. 내용 삭체 화면 메소드
	void delete() {
		System.out.println("삭제할 번호 : ");
		int getList_num = scanner.nextInt();
		boolean result = control.delete(getList_num);
		if(result){System.out.println("삭제성공");}
		else {System.out.println("삭제실패 [ 삭제할 번호 없음 or DB오류]");}
		
		
	}
}//class E
