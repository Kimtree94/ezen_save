package 개인과제_RPG게임;

import java.util.Scanner;

public class RPG게임 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			 int hp=0; int mp=0; int exp=0; int gold=0;
			
		System.out.println("\t=========RPG=========");
		System.out.println("\tRPG게임에 오신것을 환영합니다");
		System.out.println("     1. 캐릭터 생성 2. 로그인 3. 회원가입 "); int input = scanner.nextInt();
		
////////////////////////////////////////////////////////////////////////////////////////////////////
	if(input==1) {
		String 캐릭터정보 ="null,null,10,20,0,0,전직미완료";
		
		System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
		System.out.println("\t        캐릭터생성");
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
			else if(answer==1&&x.equals("여자")){
				System.out.print("　∧ ,, ∧\r\n"
						+ " （´･ω･）　ヽヽ\r\n"
						+ "　/つ　〇━⊂二二フ\r\n"
						+ "                   ⊂(  ‘ д’)つ\n");
				System.out.println("====환영합니다!!");
				System.out.println("당신의 캐릭터의 성별은"+x+"\n이름은"+name+"입니다");
				
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
			}//여자 캐릭터 if E
			
			if(x.equals("남자")||x.equals("여자")&&answer==1) {
					System.out.println("\t╯▅╰╱▔▔▔▔▔▔▔╲╯╯☼\r\n"
							+ "\t▕▕╱╱╱╱╱╱╱╱╱╲╲╭╭\r\n"
							+ "\t▕▕╱╱╱╱╱╱╱╱┛▂╲╲╭\r\n"
							+ "\t╱▂▂▂▂▂▂╱╱┏▕╋▏╲╲\r\n"
							+ "\t▔▏▂┗┓▂▕▔┛▂┏▔▂▕▔\r\n"
							+ "\t▕▕╋▏▕╋▏▏▕┏▏▕╋▏▏\r\n"
							+ "\t▕┓▔┗┓▔┏▏▕┗▏┓▔┏▏");
					System.out.println();
					System.out.println("=>마을에 오신걸 환영합니다🤚🤚");
					
					while(true) {
					System.out.println("\t⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞태초마을⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞");
					System.out.println("\t👉👉원하는 행동을 선택해주세요👈👈");
					System.out.println("\t1.던전입장  2.상점방문  3.휴식"); int home=scanner.nextInt();
					if(home==1) {}
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
			else  {continue;}
	
	
	
	}//1번 선택시 if E
//	if(answer==1) {}	
	//else if(answer==2) {}
	
	else if(input==2) {}
	else if(input==3) {}
		else {
			System.out.println("리스트에서 골라주세요");
		
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	

	
	
	
		}//while E
	}//main E
}//class E
