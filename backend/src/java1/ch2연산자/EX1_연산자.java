package java1.ch2연산자;

public class EX1_연산자 {//class s
	public static void main(String[] args) {//main s
			//1.산술연산자
			int 정수1=10;int 정수2=20;
			System.out.println("1.더하기 :"+ 정수1+정수2);
			System.out.println("2.더하기 :"+(정수1+정수2));
			System.out.println("3.빼기"+(정수1-정수2));
			System.out.println("4.곱하기"+(정수1*정수2));
			System.out.println("5.나누기:"+(정수1/정수2));
			System.out.println("6.나머지 :"+(정수1%정수2));
			
			//2.비교연산자
			System.out.println("이상"+(정수1>=정수2));
			System.out.println("이하"+(정수1<=정수2));
			System.out.println("초과"+(정수1>정수2));
			System.out.println("미만"+(정수1<정수2));
			System.out.println("같다"+(정수1==정수2));
			System.out.println("같지않다"+(정수1!=정수2));
			
			//3.논리
			int 정수3 =30; int 정수4= 40;
			System.out.println("&&[AND] "+(정수1>=정수2&&정수3>=정수4));
			System.out.println("14.||[OR]"+(정수1>=정수2||정수4>=정수3));//한개라도 true이면 true
					
			//4.증감
			
			int 정수5=10; 
			System.out.println("후위증가"+(정수5++)); //증가보다 출력이 우선이라서 출려후에 1증가
			System.out.println("확인: "+정수5);
			System.out.println("선위증가:"+(++정수5));//출력보다 증가가 우선이라서 출려전에 1증가
			System.out.println("후위감소:"+(정수5--));
			System.out.println("확인"+정수5);
			System.out.println("선위감소"+(--정수5));
 
			//5.대입 연산자
			int 정수6 =10;  //= :대입
			정수6 += 3; 	   // += :오른쪽 데이터를 왼쪽에 더한 후에 대입
				//1. 정수6+3 -> 13   2.정수6=13
			System.out.println("대입 결과:" + 정수6);
			
			정수6 -= 5; //1.정수6-5 ->8 2.정수6=8
			System.out.println("대입 결과:"+정수6);
			
			//6.삼항연산자
			int 점수=85;
			char 등급 = 점수>90 ? 'A' : 'B';		//조건식 ? 참 : 거짓
					//만약에 점수가 90점 초과이면 'A'대입 아니면 'B'대입
			System.out.println("등급 결과:"+등급);
			
			char 등급2 =점수>90 ? 'A' : 점수 > 80 ? 'B' :'C';
			System.out.println("등급 결과:"+등급2);
	}//main e
}//class e









/*
		연산자 : 계산시 사용되는 특수문자
			1.산술연산자
				+더하기 -뺴기 *곱하기 /나누기 %나머지
				+ 연결연산자
			2.비교연산자 --> 결과 : true 혹은 false
				>=이상[크거나같다] >초과[크다]		==[같다]
				<=이하[작거나같다] <미만[작다]		!=[같지않다/다르다]
			3.논리연산자 : 비교연산자를 2개 이상 작성
				5 <= a <= 10 [X]이딴거 없음 --->and/or 사용---> a>=5 && a<=10
				
				&& : and[이면서 면서 이고 그리고 모두]
				|| : or[이거나 거나 또는 하나라도]
				! :not[부정(반대값으로 돌려주는 역할) => true ->false  or  false -> true
			4.대입연산자
				= :오른쪽에 데이터를 왼쪽에 저장하는것을 대입이라고 함
				+= :오른쪽에 데이터를 왼쪽 데이터와 더한 후 왼쪽에 대입
				*=  /=  %=  -=
			5.증감연산자
				변수++ [1증가]
				변수-- [1감소]
				
			6.삼항연산자
				조건식 ? 참 : 거짓
				조건식 ? 조건식2 ? 참2 : 거짓2 : 거짓1  --->삼항연산자가 복잡해지면 if사용하는게 편리함:조건식이 많으면 가동성이 떨어짐 
*/