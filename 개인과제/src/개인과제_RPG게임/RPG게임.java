package 개인과제_RPG게임;

import java.util.Scanner;

public class RPG게임 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			 int hp=10;   int mp=20;	// 캐릭터 HP/캐릭터 MP 
			int exp=0;  int gold=0; // 캐릭터 골드/캐릭터 경험치
			  
				int M2hp=40;   int M3hp=60;
			 
			 
		System.out.println(" ⚔️⚔️⚔️⚔️⚔️자바죽이기⚔️⚔️⚔️⚔️⚔️⚔️⚔️");	
		System.out.println("⚔️〇\t\t\t\t ⚔️\r\n"
				+ "⚔️\t　　ｏ\t\t\t ⚔️\r\n"
				+ "⚔️\t　　°\t\t\t ⚔️\r\n"
				+ "⚔️\t　┳┳ ∩∩\t\t\t ⚔️\r\n"
				+ "⚔️\t　┃┃(･∀･)　☆　　★\t\t ⚔️\r\n"
				+ "⚔️\t┏┻┻┷━Ｏ ┏┷┓┏┷┓\t\t ⚔️\r\n"
				+ "⚔️\t┃Welcome┠┨★┠┨☆┃\t ⚔️\r\n"
				+ "⚔️\t┗©━━©┛ ┗©┛┗©┛\t\t ⚔️");
		System.out.println(" ⚔️⚔️RPG게임에 오신것을 환영합니다⚔️⚔️");
		System.out.println("   1. 캐릭터 생성 2. 로그인 3. 회원가입 "); int input = scanner.nextInt();
		
////////////////////////////////////////////////////////////////////////////////////////////////////
	if(input==1) {
		String 캐릭터정보 ="null,null,10,20,0,0,전직미완료";
		
		System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
		System.out.println("\t      캐릭터생성");
		System.out.println("\t성별을 직접 입력하세요[남자/여자]");String x=scanner.next();
		System.out.println("\t캐릭터 아이디 입력해주세요!!");String name=scanner.next();
		System.out.println("\t선택하신 캐릭터의 성별은"+x+"\n\t이름은"+name+"로 생성하시겠습니까?\n"+"\t      1.Y 2.N");int answer=scanner.nextInt();
		System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
			if(answer==1&&x.equals("남자")) {
				
				System.out.print("\t　∧ ,, ∧\r\n"
						+ "\t （´･ω･）　ヽヽ\r\n"
						+ "\t　/つ　〇━⊂二二フ\r\n"
						+ " \t                  ⊂(  ‘ д’)つ\n");
				System.out.println("\t환영합니다!!");
				System.out.println("\t당신의 캐릭터의 성별은"+x+"\n\t이름은"+name+"입니다");
			
				if(캐릭터정보.split(",")[0].equals("null") ) { 캐릭터정보 = "👉성별:"+x 
						+"\n👉아이디:"+name  + 
						"\n👉HP :"+캐릭터정보.split(",")[2] +
						"\n👉MP :"+캐릭터정보.split(",")[3] +
						"\n👉경험치 :"+캐릭터정보.split(",")[4] + 
						"\n👉골드 :"+캐릭터정보.split(",")[5]+ 
						"\n👉직업 :"+캐릭터정보.split(",")[6]; }
				System.out.println("\t╭◜◝ ͡ ◜◝╮\r\n"
						+ "\t( ＊•◡•＊ )\r\n"
						+ "\t╰◟◞ ͜ ◟◞╯\n"
						+"\t👉👉확인정보👈👈");
				System.out.println("\t人◕ ‿‿ ◕人");
				System.out.println(캐릭터정보);
				
			}//남자 캐릭터 if E
			if(answer==2) {System.out.println(" ____                         \r\n"
					+ "/\\  _`\\                       \r\n"
					+ "\\ \\ \\L\\ \\   __  __       __   \r\n"
					+ " \\ \\  _ <' /\\ \\/\\ \\    /'__`\\ \r\n"
					+ "  \\ \\ \\L\\ \\\\ \\ \\_\\ \\  /\\  __/ \r\n"
					+ "   \\ \\____/ \\/`____ \\ \\ \\____\\\r\n"
					+ "    \\/___/   `/___/> \\ \\/____/\r\n"
					+ "                /\\___/        \r\n"
					+ "                \\/__/         "); continue;}
			else if(answer==1&&x.equals("여자")){
				System.out.print("　∧ ,, ∧\r\n"
						+ " （´･ω･）　ヽヽ\r\n"
						+ "　/つ　〇━⊂二二フ\r\n"
						+ "                   ⊂(  ‘ д’)つ\n");
				System.out.println("====환영합니다!!");
				System.out.println("당신의 캐릭터의 성별은"+x+"\n이름은"+name+"입니다");
				
				if(캐릭터정보.split(",")[0].equals("null") ) { 캐릭터정보 = "👉성별:"+x 
						+"\n\t👉아이디:"+name  + 
						"\n\t👉HP :"+캐릭터정보.split(",")[2] +
						"\n\t👉MP :"+캐릭터정보.split(",")[3] +
						"\n\t👉경험치 :"+캐릭터정보.split(",")[4] + 
						"\n\t👉골드 :"+캐릭터정보.split(",")[5]+ 
						"\n\t👉직업 :"+캐릭터정보.split(",")[6]; }
				System.out.println("\t╭◜◝ ͡ ◜◝╮\r\n"
						+ "\t( ＊•◡•＊ )\r\n"
						+ "\t╰◟◞ ͜ ◟◞╯\n"
						+"\t👉👉확인정보👈👈");
				System.out.println("\t人◕ ‿‿ ◕人");
				System.out.println(캐릭터정보);
			}//여자 캐릭터 if E
			
			if(x.equals("남자")||x.equals("여자")&&answer==1) {
					
					
					while(true) {
						System.out.println("\t╯▅╰╱▔▔▔▔▔▔▔╲╯╯☼\r\n"
							+ "\t▕▕╱╱╱╱╱╱╱╱╱╲╲╭╭\r\n"
							+ "\t▕▕╱╱╱╱╱╱╱╱┛▂╲╲╭\r\n"
							+ "\t╱▂▂▂▂▂▂╱╱┏▕╋▏╲╲\r\n"
							+ "\t▔▏▂┗┓▂▕▔┛▂┏▔▂▕▔\r\n"
							+ "\t▕▕╋▏▕╋▏▏▕┏▏▕╋▏▏\r\n"
							+ "\t▕┓▔┗┓▔┏▏▕┗▏┓▔┏▏");
					System.out.println();
					System.out.println("\t=>마을에 오신걸 환영합니다🤚🤚");
					System.out.println("\t⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞태초마을⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞");
					System.out.println("\t👉👉원하는 행동을 선택해주세요👈👈");
					System.out.println("\t1.던전입장  2.상점방문  3.휴식"); int home=scanner.nextInt();
					if(home==1) {
						while(true) {

						System.out.println("\t　　　　∧_∧\r\n"
								+ "\t　　　 (･ω･ )\r\n"
								+ "\t　　　ｏ┳o　）\r\n"
								+ "\t　　　◎┻し'◎ ≡");
						System.out.println("\t원하는 행동을 선택해주세요");
						System.out.println("\t1.A던전 입장 \n\t2.B던전 \n\t3.C던전\n\t4.마을로 돌아가기 ");int hunt=scanner.nextInt();
								if(hunt==1) {
									      
									String 몬스터_A ="몬스터A,HP:20,획득가능 경험치 5";
									System.out.println("\t  ∧ ∧\r\n"
											+ "\t (´･ω･)  =3\r\n"
											+ "\t /　 ⌒ヽ\r\n"
											+ "\t(人＿＿つ_つ");
									System.out.println("\t"+몬스터_A);
									System.out.println("\t✋날잡으러 왔나");
									System.out.println("\t사냥하시겠습니까?\n\t1.싸우자(주먹으로싸우기)\n\t2.숨어있기\n\t3.마을로 돌아가기");int fight=scanner.nextInt();
								
									if(fight==1) {
										System.out.println("3.");int sc=scanner.nextInt();
										if(sc==1) {
											
										}
										if(sc==3) {break;}
									}
									else if(fight==2) {}
									else if(fight==3) {
										break;
									}
								}//A던전 if E
								
						
						}// 던전 if While E
						
						
						
					}// 던전 선태 if E 
		/////////////////////////////////////////////////////////////마을선택/////////////////////////////////////////////////////////
					else if(home==2) {
					System.out.println("상점에 입장하셨습니다");
					System.out.println("　　　　　　　　　| \r\n"
							+ "　　　　　　　　　| \r\n"
							+ "　　　　　 　　　 ﾉ,,∧ \r\n"
							+ "　　　　　　　 ／/･ω･`) \r\n"
							+ "　　　　　　／　/⊂ノ \r\n"
							+ " 　　　　　　＼ /ーJ \r\n"
							+ " ￣￣￣￣￣￣￣");
						System.out.println("어서오세옹 무엇을 원하는냐옹\n 1.물약구입");int buy=scanner.nextInt();
				
					if(buy==1) {
						System.out.println("\t👉보유골드는:"+gold--+"💪(■_■💪)\r\n"
								+ "      \t🤞맛나게 드시게나🤞");
						}//물약구입 if E
					
					}//상점 구매 else if E
					System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
					System.out.println("\t\t마을로 돌아왔습니다");
					continue;
					}//마을 While E
			
			}//마을 if E
			else  {
				System.out.println("🛸　　　 　🌎　°　　🌓　•　　.°•　　　🚀 ✯\r\n"
						+ "　　　★　*　　　　　°　　　　🛰 　°·　　                           🪐\r\n"
						+ ".　　　•　° ★　•  ☄\r\n"
						+ "\t▁▂▃▄▅▆▇▇▆▅▄▃▁▂");
				System.out.println("   입력한 정보를 확인하고 다시 입력해주세요");continue;
				
			
			}//선택오류시 출력 화면 E
	
	
	
	}//1번 선택시 if E
//	if(answer==1) {}	
	//else if(answer==2) {}
	
	else if(input==2) {
		
	}//로그인 else if E
	
	
	else if(input==3) {
		System.out.println("\t회원가입 페이지에 오신걸 환영합니다");
	}//회원가입 else if E
		else {
			System.out.println("\t🙏리스트에서 골라주세요🙏");
		
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	

	
	
	
		}//while E
	}//main E
}//class E
