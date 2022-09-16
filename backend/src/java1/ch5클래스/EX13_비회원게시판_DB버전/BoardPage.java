package java1.ch5클래스.EX13_비회원게시판_DB버전;

import java.util.Scanner;

public class BoardPage {
		//1. 필드
		// 입력객체 [ 함수 밖에 만든 이유??? 다른곳에서도 계속 사용해야하기에?]
		Scanner scanner =new Scanner(System.in); 
		BoardControl control = new BoardControl();
		//2. 생성자
		
		//3. 메소드 
		public static void main(String[] args) {
			//메소드 호출 방식 : 1. statin 2.new
			BoardPage page=new BoardPage();
			page.view();
		}//main E
		
		// 0. 메인화면 
		void view() {
				BoardPage page = new BoardPage();//메소드 호출용 객체 
			while(true) {	//무한루프
				page.getBoardlist(); // 모든 게시물 출력 함수 호출 
				
				System.out.println("1.글쓰기 2.글제목 선택:");//안내[출력-print]-->입력[scanner]--.
				int btn = scanner.nextInt();
				
				//경우의수 2개 +1(그외)
				if(btn==1) {page.regist();}					//1번 입력하면 등록함수 호출
				else if(btn==2) { page.getBoard();}			//2번 입력하면 개별게시물 출력화면 함수 호출 
				else {System.out.println("경고) 알수 없는 번호 입니다.");}//else E
				
			}//while E
		}//view E
		
		
		//1. 등록화면
		void regist() {
			//1. 출력 -> 입력 -> 저장
			System.out.println("===>>> 등록 페이지");
			System.out.print(">>제목 :");	 			String b_title =scanner.nextLine();
			System.out.print(">>내용 :");		 		String b_content =scanner.nextLine();
			System.out.print(">>작성자 :");			String b_writer =scanner.next();
			System.out.print(">>패스워드 :");	 		String b_password =scanner.next();
			scanner.nextLine(); //nextLine() 겹치는 문제 해결 방안 
			
			//2. 입력받은 데이터를 control 이동 [다른 클래스의 메소드 호출]
			boolean result = control.regist(b_title, b_content, b_writer, b_password);
			//3. control 처리된 결과를 result 에 저장한 다음 제어 [ control 실행후 결과의 경우의수 ] 
			if(result) {System.out.println("->게시물 등록 완료<-");}
			else {System.err.println("##게시물 등록 실패##");}
			
			
		}//1 void E	
		
		//2. 모든게시물 출력 화면 
		void getBoardlist() {
			System.out.println("===>>> 게시판");
			System.out.println("번호\t작성자\t제목\t조회수");
			
			BoardDto[] boardlist = control.getBoardlist();//control에 모든 게시물호출 메소드 호출 -> 모든 게시물의 배열을 반환 
			
			//for(int i= 0 ;i<boardlist.length;i++) {}
			for(BoardDto dto : boardlist) { //모든 게시물의 배열을 반복문 돌린다 [ 향상된 for 문 ]
			//for(배열의자료형 반복변수명:배열)
				System.out.print(dto.b_no+"\t");	System.out.print(dto.b_writer+"\t");
				System.out.print(dto.b_title+"\t");	System.out.print(dto.b_view+"\n");
			}//for E
			
		}//2 void E
		
		//3. 개별게시물 출력 화면 
		void getBoard() {
			System.out.println(">>게시물 번호 : ");int b_no=scanner.nextInt();		//1. 보고 싶은 게시물 번호를 입력받는다 
			BoardDto board=control.getBoard(b_no);								//2. 입력받은 번호를 getBoard 매소드에 전달하면 해당 게시물을 가져온다.[없으면 함수종료]
				if(board==null) {System.out.println("선택한 게시물은 없는 번호입니다.");return;}
			
			System.out.println("===>>> 등록 페이지");
			System.out.print("제목 :"+board.b_title+"\t");
			System.out.print("작성자 :"+board.b_writer+"\t");
			System.out.println("조회수 :"+board.b_view);
			System.out.println("내용 :"+board.b_content);
			//출력
			System.out.println("1.뒤로가기 2.수정 3.삭제 :");
			int btn=scanner.nextInt();
			BoardPage page=new BoardPage();
			if(btn==1) {return;}
			else if(btn==2) {page.update();}	//2번 선택시 업데이트 함수 호출
			else if(btn==3) {page.delete();}	//3번 선택시 삭제 함수 호출 
			else  {System.out.println("알수 없는 번호 입니다.");}
			
		}//3. void E
		
		//4. 수정처리 출력 화면 
		void update() {
			System.out.println("===>>> 수정처리 페이지");
		}//4. void E
		
		//5. 삭제처리 출력 화면 
		void delete() {
			System.out.println("===>>> 삭제처리 페이지");
		}//5. void E
}
