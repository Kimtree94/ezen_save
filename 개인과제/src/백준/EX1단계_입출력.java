package 백준;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EX1단계_입출력 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String pwPattern = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9$@$!%*#?&]{8,15}$";
		  
			String Num="^[0-9]{3,10}$";
			String kk = scanner.next();
			boolean regex1 = Pattern.matches(pwPattern,kk); // 검증1
			if(regex1==false) {System.out.println("입력할수없다");}
			if(regex1) {System.out.println("입력성공");}
			//비밀번호 길이10개 영어 대소문자 숫자 
			
		

	}

}
