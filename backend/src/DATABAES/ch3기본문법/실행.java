package DATABAES.ch3기본문법;

import java.util.ArrayList;
import java.util.Scanner;import javax.swing.text.html.parser.DTD;

public class 실행 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		while(true) {
			
				System.out.println("1~12번 selelct 예제 번호 선택 :");
			int ch=scanner.nextInt();
			
			//메소드 호출 방법
				//1. static(정적) 선언된 함수 : 클래스명.함수명()
				//2. 일반함수 : 객체명.함수명()
			
			DAO dao= new DAO();
			
			//1. 
			if(ch==1) {
				ArrayList<MemberDTO> list =dao.예제1결과();
				// 향상된 for문 
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id		+"\t" );
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.mem_number 	+"\t");
					System.out.print( dto.addr 			+"\t");
					System.out.print( dto.phone1 		+"\t" );
					System.out.print( dto.phone2 		+"\t" );
					System.out.print( dto.height 		+"\t" );
					System.out.print( dto.debut_date 	+"\n" );
					
				}
			}//if E
			//2. 
			if(ch==2) {
				ArrayList<String> list = dao.예제2결과();
				for(String s :list) {
					System.out.println(s);
				}//2 for E
			}//2if E
			
			//3.
			if(ch==3) {
				ArrayList<MemberDTO> list =dao.예제3결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id		+"\t" );
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.mem_number 	+"\t");
					System.out.print( dto.addr 			+"\t");
					System.out.print( dto.phone1 		+"\t" );
					System.out.print( dto.phone2 		+"\t" );
					System.out.print( dto.height 		+"\t" );
					System.out.print( dto.debut_date 	+"\n" );
					
				}//3 for E
			}//3if E
			
			//4.
			if(ch==4) {
				 ArrayList<MemberDTO> list = dao.예제4결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id		+"\t" );
					System.out.println( dto.mem_name 		+"\t");
				}//4 for E
			}//4if E
			
			//5.
			if(ch==5) {
				 ArrayList<MemberDTO> list = dao.예제5결과();
					for(MemberDTO dto:list) {
						System.out.print( dto.mem_name 		+"\t");
						System.out.print( dto.height 		+"\t" );
						System.out.println( dto.mem_number 	+"\t");
					}//5 for E
			}//5if E
			
			//6.
			if(ch==6) {
				ArrayList<MemberDTO> list = dao.예제6결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.height 		+"\t" );
					System.out.println( dto.mem_number 	+"\t");
				}//6 for E
			}//6if E
			
			//7.
			if(ch==7) {
				ArrayList<MemberDTO> list =dao.예제7결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id		+"\t" );
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.mem_number 	+"\t");
					System.out.print( dto.addr 			+"\t");
					System.out.print( dto.phone1 		+"\t" );
					System.out.print( dto.phone2 		+"\t" );
					System.out.print( dto.height 		+"\t" );
					System.out.print( dto.debut_date 	+"\n" );
					
				}//7 for E
			}//7if E
			
			//8.
			if(ch==8) {
				ArrayList<MemberDTO> list =dao.예제8결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id		+"\t" );
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.mem_number 	+"\t");
					System.out.print( dto.addr 			+"\t");
					System.out.print( dto.phone1 		+"\t" );
					System.out.print( dto.phone2 		+"\t" );
					System.out.print( dto.height 		+"\t" );
					System.out.print( dto.debut_date 	+"\n" );
					
				}//7 for E
			}//7if E
			
			//9.
			if(ch==9) {
				ArrayList<MemberDTO> list = dao.예제9결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.print( dto.mem_name 		+"\t" );
					System.out.println(dto.debut_date 	+"\t");
				}//9 for E
			}//9if E
			
			//10.
			if(ch==10) {
				ArrayList<MemberDTO> list = dao.예제10결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.print( dto.mem_name 		+"\t" );
					System.out.print(dto.debut_date 	+"\t");
					System.out.println(dto.height 	+"\t");
				}//10 for E
			}//10if E
			
			//11.
			if(ch==11) {
				ArrayList<MemberDTO> list = dao.예제11결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.print( dto.mem_name 		+"\t" );
					System.out.print(dto.debut_date 	+"\t");
					System.out.println(dto.height 	+"\t");
				}//11 for E
			}//11 if E
			
			
			//12.
			if(ch==12) {
				ArrayList<MemberDTO> list = dao.예제12결과();
				for(MemberDTO dto:list) {
					System.out.print( dto.mem_name 		+"\t");
					System.out.println(dto.height 	+"\t");
				}//12 for E
			}//12 if E
			
			//13.
			if(ch==13) {
				ArrayList<MemberDTO> list = dao.예제13결과();
				for(MemberDTO dto:list) {
					System.out.println( dto.addr 		+"\t");
				}//13 for E
			}//13 if E
			
			//14.
			if(ch==14 ) {
				ArrayList<BuyDTO> list = dao.예제14결과();
				for(BuyDTO buyDTO:list) {
					System.out.print(buyDTO.mem_id +"\t");
					System.out.println(buyDTO.amount +"\t");
				}//13 for E
			}//14 if E
			
			//15.
			if(ch==15) {
				ArrayList<BuyDTO> list=dao.예제15결과();
				for(BuyDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.println( dto.price 		+"\t");
				}
			}
			
			//16.
			if(ch==16) {
				ArrayList<ResultDto> list=dao.예제16결과();
				for(ResultDto dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.println( dto.value 		+"\t");
				}
			}
			
			//17.
			if(ch==17) {
				ArrayList<BuyDTO> list=dao.예제17결과();
				for(BuyDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.println( dto.amount 		+"\t");
				}
			}
			
			//18.
			if(ch==18) {
				ArrayList<BuyDTO> list=dao.예제18결과();
				for(BuyDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.println( dto.amount 		+"\t");
				}
			}
			//19.
			if(ch==19) {
				ArrayList<BuyDTO> list=dao.예제19결과();
				for(BuyDTO dto:list) {
					System.out.print( dto.mem_id 		+"\t");
					System.out.println( dto.amount 		+"\t");
				}
			}
		}//while E
	}//main E
}//class E
