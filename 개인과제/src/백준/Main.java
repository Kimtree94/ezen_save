package 백준;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coffe = 5500;
		int money=scanner.nextInt();
		
		int sale = money/coffe;
		int chr = money%coffe;
		int[] answer = {sale,chr};
		System.out.println(sale);
		System.out.println(chr);
		//int B=Math.floorDiv(money, coffe);
		//int C= Math.floorMod(money, coffe);
	
	}

}