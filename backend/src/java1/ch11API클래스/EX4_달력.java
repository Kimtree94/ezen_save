package java1.ch11API클래스;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class EX4_달력 {
		//1. 필드
		Scanner scanner = new Scanner(System.in); 	// 입력객체
		 Calendar cal = Calendar.getInstance();		// 달력객체
		 int year	= cal.get(Calendar.YEAR);
		 int month	= cal.get(Calendar.MONTH)+1;
		 int day	= cal.get(Calendar.DAY_OF_MONTH);
		//2. 생성자
		
		//3. 메소드
	 void run() {
		while(true) {
		 ///////////////////////////////////////////////////////////////////////////////////
		 //*** 현재날짜를 이용한 1일 요일 찾기 [ ]
		 cal.set(year, month-1, 1);//현재 월의 1일 날짜 
		 int sweek = cal.get(Calendar.DAY_OF_WEEK);//현재 월의 1일의 요일 
		 // *** 현재날자의 마지막 일 수 찾기 
		 int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		 	// 출력 코드 //
		 
		 System.out.println(sweek);
		 System.out.printf("============= %d 년 %d 월 의 달력=================\n",year,month);
		 
		 System.out.println("일\t월\t화\t수\t목\t금\t토");
		 //1. 1일의 전까지 공백을 찍어주는 반복문
		 for( int i=1 ; i<sweek ;i++) { System.out.print("공백\t");}
		 
		 //2. 1일부터~마지막 일수 까지 일수를 출력하는 반복문
		 for(int i=1;i<=eday;i++) {
			 System.out.printf("%2d \t",i);
			 //토요일 이후[ sweek 7의 배수이면 ]에 줄바꿈처리 
			if(sweek%7==0) {System.out.println();}
			 sweek++; // 일수를 출력할때마다 요일도 증가처리 
		 }
		 일정출력();
		 System.out.println("\n=================================================");
		 //////////////////////////////////////////////////////////////////////////////
		 System.out.println("◀이전[1]   ▶다음달[2]   검색[3]   일정추가[4] :");
		 int btn =scanner.nextInt();
		 	// 이전달 : 월에서 차감 [ 만일 월이 0 이면 월 =12 설정 연도 1 차감 ]
		 if(btn==1) {month--;if(month==0) {month=12;year--;}}
		 	// 다음달 : 월에서 1 증가 [ 만일 월이 13 이면 월 =1 설정 연도 1 증가 ] 
		 else if(btn==2) {month++;if(month==13) {month=1;year++;}}
		 else if(btn==3) {
			 System.out.print("원하는 년도 :"); int year=scanner.nextInt();
			 System.out.print("원하는 월 :");	int mon=scanner.nextInt();
				if(year<1990||year>9999||mon<1||mon>12) {System.out.println("입력할수 없는 날자입니다");}
				else {
				 this.year=year; month=mon;
				}
				
		 }
		 else if(btn==4) { 일정추가();}
		// 출력 코드 // 
		 
		}//while E
	 }//run E
	 
	 void 일정추가() { // 일정,날짜,메모
		 System.out.println("날짜 : "); String cdate = scanner.next();
		 System.out.println("메모 : "); String ccomment = scanner.next();
		 boolean result = 달력Dao.getInstance().일정추가(cdate,ccomment);
		 if(result) {System.out.println("일정등록성공");}
		 else {System.out.println("일정등록실패");}
	 } // e end
	 
	 
	 
	 void 일정출력() {
		 System.out.println("\n----일정확인----");
		 System.out.println("번호\t날짜 \t\t메모");
		
		 String strmonth="";
		if(month<10) {strmonth="0"+month;}
		else {strmonth=month+"";}
		
		 HashMap<Integer, ArrayList<String>> map
		 = 달력Dao.getInstance().일정출력(String.valueOf(year),strmonth);
		 
		 for(Integer key : map.keySet()) {
			 	//ketSet( ) : 모든키 호출
			 System.out.print(key+"\t");
			 for(String s : map.get(key)) {
				 System.out.print(s+"\t");
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
}//class E
