package 백준;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num_list = {10,0,0,0,0};
		int[] answer = {};
		for(int i=num_list.length-1;i>=0;i--) {
			answer[i]=num_list[i];
			System.out.print(answer[i]+" ");
		}
	}

}