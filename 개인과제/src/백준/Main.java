package 백준;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int C=0;
		
		C = A/B*1000;
		System.out.println(C);
		
	}
}
