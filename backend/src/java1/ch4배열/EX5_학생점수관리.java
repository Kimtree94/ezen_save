package java1.ch4배열;

import java.util.Scanner;

public class EX5_학생점수관리 {//class S
		public static void main(String[] args) {//main E
			
			boolean run = true;		//무한 루프의 스위치 제어변수
			int studentNum= 0 ; 	//학생 수를 저장할 변수
			int[] scores = null; 	//여러개 점수를 저장할 배열 [메모리 할당 전]
			
			Scanner scanner=new Scanner(System.in); //입력객체
			
			while(run) {// 무한루프 S [종료조건 : 5 입력했을때]
				System.out.println("---------------------------------------");
				System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
				System.out.print("선택  :");int selecyNo=scanner.nextInt();
				
				if(selecyNo==1) //1입력했을때
					{
					System.out.print("학생수 :");studentNum=scanner.nextInt();
					scores =new int[studentNum];	//입력받은 학생수 만큼 배열에 메모리(길이)할당
					System.out.println("배열에 "+studentNum+"명의 점수 입력 가능");
					}	
				else if(selecyNo==2)//2입력했을때 ( 학생수 입력전 실행 불가)
				{
					for(int i=0;i<scores.length;i++) {// i는 0부터 배열의 길이까지 1씩 증가 반복
						System.out.print("scores["+i+"] :");
						scores[i]=scanner.nextInt(); //i번째 인덱스의 입력값을 대입
					}//for end
				}
				else if(selecyNo==3)//3입력했을때
					{
						
						for(int i=0;i<scores.length;i++) {
							System.out.printf("scores[%d]> %d \n",i,scores[i]);
							
						}//for end
					}
				else if(selecyNo==4)//4입력했을때
					{
						int max=0;	//최고점수
						int sum=0;	//평균 구하기 전에 합계 구하기
						for( int value:scores) {
							if(value>max){max=value;}//만약에 해당 max 보다 크면  max 대입
							 sum+=value; //해당 값을 sum 변수에 누적 더하기
						}//for end
						System.out.print("최고 점수는 :"+max);
						double avg = (double)sum/scores.length;
						System.out.println("\n평균 점수는 :"+avg );//평균 : 합계/길이
						
						//* 순위별 [ 내림차순 ] 출력
						for(int i=0;i<scores.length;i++){
							for(int j=i+1;j<scores.length;j++) {
								if(scores[i]<scores[j]) {// > :오름차순 < : 내림차순 
									int temp=scores[i];
									scores[i]=scores[j];
									scores[j]=temp;
								}//if e
							}//for e
						}//for e
						//확인
						int rank=0;
						for(int value : scores) {
							System.out.println((rank+1)+"순위 점수 :" + value);
							rank++;
						}
					}
				else if(selecyNo==5)
					{run=false;}//5입력했을때
				else 
					{System.out.print("안내 :)알수 없는 번호입니다.");}//그외 입력했을때
			}//무한루프 E
			System.out.println("프로그램 종료");
		}//main E
}//class E
