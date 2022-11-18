package 백준;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX1단계_입출력 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		String pwPattern = "^[A-Za-z[0-9$@$!%*#?&]{8,15}$";
		String phone = "\\d{3}-\\d{4}-\\d{4}";
		String regular = "^[A-Za-z0-9]]{6,15}$";
		String test = "^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]{5,10}$";
		// Pattern: 12345678910
		Pattern p = Pattern.compile("\\d{11}");
			String Num="^[0-9]{3,10}$";
			String kk = scanner.next();
			boolean regex1 = Pattern.matches(test,kk); // 검증1
			if(regex1==false) {System.out.println("입력할수없다");}
			if(regex1) {System.out.println("입력성공");}
			//비밀번호 길이10개 영어 대소문자 숫자 
			
			crolling ss=new crolling();
			ss.sdsd();
		
			}
	//"^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$"
			/*
			 * static boolean validPhoneNumber() { String Num = scanner.next(); Pattern
			 * pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}"); Matcher matcher =
			 * pattern.matcher(Num); if (matcher.matches()) { System.out.println("입력한 번호는: "
			 * + Num); return true; } else {
			 * System.out.println("유효하지않은 번호입니다 다음 형싟을 맞춰주세요. XXX-XXXX-XXX: " + Num); return
			 * false; } }
			 */
}
