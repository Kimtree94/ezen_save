package 백준;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);  
		   SHA256 scan = new SHA256();
		   try {
			   String T = scan.encrypt(sc.next());
			   System.out.println(T);
		   } catch (NoSuchAlgorithmException e) {
		      e.printStackTrace();
		   }
}
}
