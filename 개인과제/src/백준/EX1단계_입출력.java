package 백준;

import java.util.Scanner;

public class EX1단계_입출력 {

	
	public static void main(String[] args) {
		EX1단계_입출력 ex1단계_입출력 = new EX1단계_입출력();
		int[] values = {1,2,3};
		int result1=ex1단계_입출력.sum1(values);
		
		int res2=ex1단계_입출력.sum1(new int[] {1,2,3,4,5,});
		System.out.println(res2);
		
		System.out.println(result1);
		
	}
	
	
	
	
	
		int sum1(int[]values) {
			int sum = 0;
			for(int i=0;i<values.length;i++) {
				sum+=values[i];
			}
			return sum;
		}
		
		
	
}
