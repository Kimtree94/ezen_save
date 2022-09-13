package java1.ch5클래스.EX7_비회원제게시판;

import java.util.Scanner;

public class EX7실행 {
	public static void main(String[] args) {
		/////////////////////////1번만 실행되는 구역/////////////////////////////////
		//0. 메모리
		Scanner scanner=new Scanner(System.in);
		Board[] boardlist=new Board[100];//Board 객체 100개를 저장 할 수 있는 배열 선언 
		/////////////////////////////////////////////////////////////////////////
		
		///////////////////////무한 실행되는 구역 ///////////////////////////////////
		while(true) {
			
			///////////////////////////모든 게시물 [배열] 출력//////////////////////////
			System.out.println("---------------비회원 게시판---------------");
			System.out.println("번호\t\t작성자\t\t제목");
			/*
			 * //1. for(int index=0;index<=boardlist.length;index++) {
			 * System.out.printf("%d\t%s\t%s",index,boardlist[index].writer,boardlist[index]
			 * .content); }//for E
			 */				//2.
			int num=0;
			for( Board temp :boardlist) {
				num++;
				if(temp!=null) {System.out.printf("%d \t\t %s \t\t %s \n",num-1,temp.writer,temp.title);}
				//만일 객체가 존재하면 출력 
			}
			////////////////////////////////////////////////////////////////////////
			
			
			System.out.println("-----------------------------------------");
			System.out.println("1.글쓰기\t\t 2.글보기 \t선택 :");
			int ch=scanner.nextInt();
			//출력 -> 입력(int) -> 저장 (int) -> 제어(if)
			
			////////////////////////1번을 입력했을때 실행되는 구역/////////////////////
			if(ch==1) {
				//1.출력[안내]->입력->저장
				System.out.print("제목 :");String title=scanner.next();
				System.out.print("내용 :");String content=scanner.next();
				System.out.print("작성자 :");String writer =scanner.next();
				System.out.print("비밀번호 :");String password=scanner.next();
				//2. 저장된 변수 4개를 하나의 객체로 만들기 [4개변수를 묶음 -> 편하기 ]
				Board regist = new Board(title,content,writer,password,0);
				//객체선언 : 클래스명 변수명 = new 생성자 (매개변수 순서대로 ):
				//3.배열에 객체 저장 [ 빈 공간을 찾아서 빈 공간에 저장 ]
				for(int index=0;index<=boardlist.length;index++) {
					if(boardlist[index]==null) {//만일 해당 index
						boardlist[index]=regist; 
					System.err.println("안내 ] 글 등록이 되었습니다.");break;}//if E
				}//for E
			}//if E
		/////////////////////////////////////////////////////////////////////////
			else if(ch==2) {
				System.out.print("게시물을 선택하세요.");int num2=scanner.nextInt();
				Board board=boardlist[num2];
				
				System.out.println("====================상세페이지====================");
				System.out.print("제목 :"+ board.title );
				System.out.print("\t내용 :"+ board.content );
				System.out.println("\n작성자 :"+ board.writer );
				System.err.println("현게시물의 비밀번호 :"+ boardlist[num2].password );
				System.out.print("\n1. 목록보기 2.삭제 3.수정 선택:");int ch2=scanner.nextInt();
				System.out.println("\n===============================================");
				if(ch2==1) {}
				else if(ch2==2) {
					System.err.print("비밀번호를 입력하세요");
					String re=scanner.next();
					if(board.password.equals(re)) {
						//만일 현재게시물의 비밀번호와 입력받은 비밀번호가 같으면 [equals]
						//한칸씩 당기기[삭제된 인덱스 뒤로]
						for(int i=num2;i<boardlist.length;i++) {
							//현재 보고 있는 게시물의 인덱스 부터 마지막 인덱스까지 1씩 증가 
							boardlist[i]=boardlist[i+1]; //객체를 한칸씩 앞으로 당기기
							if(boardlist[i+1]==null){ System.out.println("안내 ]삭제되었습니다."); break;}//다음 객체가 null이면 
							
						}//for E
					}//if E
				}//else if E
				else if(ch2==3) {
					System.err.print("비밀번호를 입력하세요");
					String re2=scanner.next();
					if(board.password.equals(re2)) {
						scanner.nextLine();
						System.out.print("\n수정할 제목을 입력하세요");boardlist[num2].title=scanner.nextLine();
						System.out.print("\n수정할 내용을 입력하세요");boardlist[num2].content=scanner.nextLine();
					System.err.println("수정되었습니다");
					}//if E
				}//else if E
				else {System.out.println("안내] 패스워드가 다릅니다.");}
			}//else if E
			else {System.out.println("안내]알수 없는 번호입니다.");}
		}//whie E
		///////////////////////////////////////////////////////////////////////
		
		
	}
}
/*
	
	설계 [ 메모리 ]
		1. 제목 2. 내용 3. 작성자 4.비밀번호
		선택지 : 1. 2차원배열  2.클래스->객체->1차원배열
	클래스 설계
		클래스 멤버 : 필드  , 생성자 , 메소드
		1.필드 : 메모리 저장소
			1.문자열 제목
			2.문자열 내용
			3.문자열 작성자
			4.정수열 비밀번호
			5.정수열 조회수 
		2. 생성자 
			1. 빈[매개변수가 없는]생성자
			2. 풀[모든 매개변수가 있는]생성자
			
*/