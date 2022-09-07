package java1.ch4배열;

import java.text.NumberFormat;
import java.util.Scanner;

public class EX6_회원 {//class S

	public static void main(String[] args) {//main S
		//0.메모리
		String [][] memberlist = new String[100][4];	//문자열 400개를 저장할수 있는 배열 선언
		Scanner scanner=new Scanner(System.in);			//입력객체
		
		//1.무한루프[프로그램 실행]
		while(true) {//while s
			System.out.println("===============회원제 페이지==============");
			System.out.println("메뉴 : 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기");
			System.out.println("======================================");
			System.out.print("선택 :");int btn=scanner.nextInt();
			if(btn==1)//1 입력했을때
			{	
				//1.아이디 / 비밀번호 입력 받는다.
				System.out.print("아이디 :"); String id=scanner.next();
				System.out.print("비밀번호 :"); String password=scanner.next();
				
				//2.배열내 모든 인덱스와 비교해서 입력한 아이디와 비밀번호가 있는지 확인
				int login = 0 ;//로그인 처리에 대한 상태를 저장하는 변수
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0]!=null) {
						//해당 인덱스가 null이 아니면서
						if(memberlist[i][0].equals(id)) {
							//해당 인덱스의 아이디가 입력받은 id와 같으면서
							login = 2; //아이디는 맞으나 비밀번호가 틀렸을때
							if(memberlist[i][1].equals(password)) {
								//해당 인덱스의 비밀번호가 입력받은 password 와 같으면
								System.out.println("안내) 로그인 성공!!");
								login = 1; //로그인 성공 [ 아이디와 비밀번호가 모두 맞았을때]
								
								//(추후코드)로그인 메뉴
								while(true) {
									System.out.println("메뉴 :1.회원탈퇴 2.로그아웃");
									int btn2=scanner.nextInt();
									if(btn2==1) {
										//------------------------------------------------//
										// i = 로그인 성공한 인덱스 = 로그인한 회원의 인덱스
										memberlist[i][0]=null;		memberlist[i][1]=null;	
										memberlist[i][2]=null;		memberlist[i][3]=null;
											//삭제된 회원 뒤로 (null) 뒤로 한칸씩 당기기 
											for(int j=i;j<memberlist.length;j++) {
												memberlist[j][0] = memberlist[j+1][0];
												memberlist[j][1] = memberlist[j+1][1];
												memberlist[j][2] = memberlist[j+1][2];
												memberlist[j][3] = memberlist[j+1][3];
												//다음 인덱스가 null이면 [회원이 없다는 뜻으로]
												if(memberlist[j+1][0]==null)break;
											}//for end
										//-------------------------------------------------//
										System.out.println("안내) 회원탈퇴가 되었습니다.");
										break;
									}
									else if(btn2==2) {break;}
								}//while end
								break;
							}//if4 e
						}//if3 e
					}//if 2e
				}//입력1 for end
				if(login==0) {System.out.println("안내)동일한 아이디가 없습니다.");}
				else if(login==2) {System.out.println("안내) 비밀번호가 일치 하지 않습니다.");}
				else if(login==1) {System.out.println("안내) 로그아웃 되었습니다.");}
				//3.있으면 로그인 성공 없으면 로그인 실해	
				
			
			}//1입력 if end	
			else if(btn==2)//2 입력했을때
			{	
				System.out.println("======================회원가입 페이지=======================");
				//1.회원정보를 4개의 변수로 입력받기 [바로 배열에 대입X]
				System.out.print("아이디 :"); String id=scanner.next();
				boolean idcheck=true;//아이디 중복여부
					for(int row =0;row<memberlist.length;row++) {
						if(memberlist[row][0]!=null &&//*** 해당 인덱스의 id가 null 이 아니면서 입력받은 id 같다!![중복찾음]
								memberlist[row][0].equals(id)) {
							//null 은 equals메소드 사용 불가 [==null,!=null]
							System.out.println("안내) 이미 사용중인 아이디 입니다.");
							idcheck=false;break;//아이디중복체크 여부 변수 수정후 반복문 탈
						}//if end
					}//for end
				
				//3.아이디 중복 흐름 제어
					if(idcheck) {
						
				
						
					
				System.out.print("비밀번호 :"); String pw=scanner.next();
				
				System.out.print("이름 :"); String name=scanner.next();
				
				System.out.print("전화번호 :"); String phone=scanner.next();
				
				//2.아이디 입력체크 : 입력받은 id가 배열내 존재하면 회원가입실패
				
				//2.입력받은 변수들을 배열에 저장한다.[배열호출 :배열명[행인덱스][열인덱스]
					//1. 배열내 빈 행 찾는다.
					for(int row=0; row<memberlist.length;row++) {
						if(memberlist[row][0]==null) {
							//row번째 아이디가 null이면 = ㅇ회원이 없다
							//2-2 :null 행 위치에 입력받은 데이터를 하나씩 대입
								memberlist[row][0]=id; 		memberlist[row][1]=pw;
								memberlist[row][2]=name; 	memberlist[row][3]=phone; 
								System.out.println("안내) 회원가입 성공");
							//2-3:저장했으면 반복문 종료[끝내기}
							break;
						}//if end
						if(row==99) {System.err.println("안내) 최대 회원수가 찼습니다.[회원가입불가능:관리자에게문의]");}
					}//for end
				}//if 3 end
				
			}//else if end
			else if(btn==3) //3 입력했을때
			{
				System.out.println("======================아이디찾기 페이지=======================");
				System.out.println("이름을 입력하세요 :");String name=scanner.next();
				System.out.println("전화번호를 입력하세요 :");String phone=scanner.next();
				//1. 이름 , 전화번호 입력받기 
				//2. 배열내 모든 항목 비교해서 동일한 이름 , 전화번호
				for(int i=0;i<memberlist.length;i++) {	//모든 항목 출력
					if(memberlist[i][0]!=null&&		//null이 아니면서
							memberlist[i][2].equals(name)&&	//이름이 같고
								memberlist[i][3].equals(phone)) {	//전화번호가 같으면 \
						System.err.println("안내)회원님의 아이디 :"+memberlist[i][0]);
						break;
					}//if end
					if(i==memberlist.length-1) {
						System.err.println("안내 )동일한 정보가 없습니다.");
					}
				}//for end
				//3.존재하면 해당 아이디 출력 아니면 비밀번호 출력
				
			}
			else if(btn==4)//4 입력했을때
			{				System.out.println("======================비밀번호찾기 페이지=======================");

				//1.아이디 , 전화번호 입력받기
				System.out.println("아이디를 입력하세요");String id=scanner.next();
				System.out.println("전화번호를 입력하세요");String phone=scanner.next();
				//2. 배열내 모든 항목 비교해서 동일한 아이디, 전화번호 
				for(int i=0;i<memberlist.length;i++) {
					if(memberlist[i][0]!=null&&
							memberlist[i][0].equals(id)&&
								memberlist[i][3].equals(phone)) {
						System.err.println("안내)회원님의 비밀번호 : "+memberlist[i][1]);
						break;
					}
					if(i==memberlist.length-1) {
						System.err.println("안내) 동일한 정보가 없습니다.");
					}
				}
				//3. 존재하면 해당 비밀번호 출력 아니면 미출력
				
			}
			else// 그외
			{System.err.println("입력할수 없는 번호입니다");}
		}//while end
	}//main E
}//class E
/*
	회원제 프로그램 구현
		[조건]
			1. 2차원 배열
		[기능]
			1. 회원가입 기능
				1. 아이디 비밀번호 이름 전화번호
				2. 배열내 빈 공간[null]의 인덱스를 찾아서 해당 인덱스에 회원정보 넣기
					String =null 
					int = 0  double=0.0  boolean=false
				3. 아이디 중복체크
				4. 최대 회원 100명
					*1명 4개 변수 ->400변수 ->2차원배열 ->[100][4]
					*행 당 1명
					*0열 :아이디 1열:비밀번호 2열:이름 3열:전화번호
			2. 로그인 기능
				아이디 비밀번호가 동일하면 로그인 성고
			3. 아이디찾기 기능
				이름 전화번호 가 동일하면 아이디 알려주기
			4. 비밀번호찾기 기능
				아이디 전화번호 가 동일하면 비밀번호 알려주기
		[출력]
			1.메뉴 : 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기
	//3
		System.out.println("이름을 입력하세요 :");String name=scanner.next();
				System.out.println("전화번호를 입력하세요 :");String num=scanner.next();
			for(int i=0;i<memberlist.length;i++) {
				if(memberlist[i][2]!=null&&memberlist[i][2].equals(name)&&memberlist[i][3]!=null&&memberlist[i][3].equals(num)) {
					System.out.println("회원님의 아이디는 :");
				}
			}

*/