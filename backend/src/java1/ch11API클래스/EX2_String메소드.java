package java1.ch11API클래스;

import java.util.Scanner;

public class EX2_String메소드 {
	public static void main(String[] args) {
		
		//1. 문자열.CharAt(인덱스) : 해당 인덱스의 문자 추출
		String ssn="010123-1234123"; //문자열 
		char sex = ssn.charAt(7);	// 7번 인덱스의 문자 추출
			System.out.println(sex);
			
		switch(sex) {
		case '1' :
		case '3' :
				System.out.println("남자 입니다.");break;
		case '2' : 
		case '4' :
				System.out.println("여자 입니다.");break;
		}
	
	
		//2. 문자열1.equals(문자열2) : 두 문자열 비교
		String strVar1 = new String("신문철");
		String strVar2 = "신문철";	//String 객체인데 왜 new 안쓰나요?  / " " : String을 뜻함 
			
		if(strVar1==strVar2) {
			System.out.println("(스택 값이 같다)같은 String 객체를 참조");
		}else { System.out.println("(스택 값 다르다)다른 String 개체를 참조");}
	
		if(strVar1.equals(strVar2)) {
			System.out.println("(힙 값이 같다)같은 문자열을 가짐");
		}else {System.out.println("(힙 값이 다르다)다른 문자열 가짐");}
	
		
		//3. getBytes(인코딩타입) : 
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();// 인코딩타입 생략시 : 1. java[JVM]버전 2. 프로젝트 설정 
			System.out.println(" 문자열 -> 바이트길이 :"+bytes1.length);
		String str1 = new String(bytes1);
			System.out.println("바이트열 -> 문자열 :" + str1);
		
		try {
			//EUC-KR	: 한글/영문 지원  영문1바이트 한글2바이트
			byte[]bytes2 = str.getBytes("EUC-KR");
				System.out.println("문자열->바이트열(EUC-KR) :" +bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
				System.out.println("바이트열->문자열 : "+str2);
		
			//UTF-8		: 전세계언어 지원 영문1바이트 한글3바이트 
		byte[]bytes3 = str.getBytes("UTF-8");
			System.out.println("문자열->바이트열(UTF-8) :" +bytes3.length);
		String str3 = new String(bytes3,"UTF-8)");
			System.out.println("바이트열->문자열 : "+str3);
		
		
		} catch (Exception e) {}
	
		// 4. indexOf( "문자열" ) : 해당 인덱스의 문자 인덱스번호 찾기 
		String subject="자바 프로그래밍";
		
		System.out.println(subject.indexOf("프로그래밍"));
		
		int location = subject.indexOf("프로그래밍");
		
		if(location!= -1) {System.out.println("찾았다");}
		else {System.out.println("못찾았다");}
		
		//5. length() : 문자열 길이 
			
		String ssn2="7406241230123";
		int length = ssn2.length();
		
		if(length==13) {System.out.println("주민번호 자리수가 맞습니다.");}
		else {System.out.println("주민번호 자리수가 틀립니다.");}
	
		//6. replace("기존문자","새로운문자") : 치환 / 교체 
		String oldStr="자바는 객체 지향 언어입니다 . 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바","java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	
		
		//7.toLowerCase() : 소문자 변환/  toUpperCase() : 대문자변환
		String str2="Java Programming";
		
		System.out.println("소문자 변환 :"+str2.toLowerCase());
		System.out.println("대문자 변환 :"+str2.toUpperCase());

		//8. trim() : 앞뒤 공백 제거 
		String tel1="      02";
		String tel2="            1 2 3            ";
		String tel3="           1 23";
		
		System.out.println(tel1.trim());
		System.out.println(tel2.trim());
		System.out.println(tel3.trim());
		
		//9. valueOf() : 다른자료형 --> 문자열(String) 변환 
		System.out.println(    10+"");// 문자열 10 출력 /스트링 + 인트= 스트링
		System.out.println(String.valueOf(10));//정수형10 ->문자열 10 출력
		System.out.println(String.valueOf(10.5));//실수형10.5->문자열 10.5 출력
		System.out.println(String.valueOf(true));//논리형true->문자열 true 반환
		
		//10. subString(  [시작인덱스(포함)] , [끝인덱스(제외)] ) : 문자열 자르기 
		String ssn3="567890-1234567 ";
		String firstNum = ssn3.substring(0,6);
				// 0번 : 8	6번: -  		567890
		System.out.println( firstNum );
		
		String secondNum =ssn3.substring(7);
				//7번 : 1	생략 : 끝까지 1234567
		System.out.println(secondNum);
		//11. split("기준문자") 
		String[]result = ssn3.split("-"); 
			// '-' 기준으로 잘랐기 때문에 String 2개 -> 배열 
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		
		"ASD".contains("A");
		
		

		
	}//main E
}//clss E
