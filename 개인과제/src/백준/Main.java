package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A ,B ,C;
		 A =scanner.nextInt();
		 B =scanner.nextInt();
		 C =scanner.nextInt();
		
		System.out.print((A+B)%C);
		System.out.print((A%C)+(B%C)%C);
		System.out.print((A*B)%C);
		System.out.print((A%C)*(B%C)%C);
	}//main E
}//class E
