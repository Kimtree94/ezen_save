package 백준;

import java.util.Scanner;
/*
 만약에 15라면 15이하의 홀수를 배열에 추가
 변수 a는 1부터 n까지 증가하는데 n을  a로 나누었을때  나머지값으로 판단 

n을 a로 나누었는데 값이 홀수이면 
15를 1로 나누면 15 2로 나누면 13?
15부터 1사이의 숫자중에 2로나눈 값이 1인 숫자만 추가 
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int a = 0; int b=0;
		int [] c = {};
			for(int i=n,j=1;i<0;i--,j++) {
			if(n%2==1) {
				c = new int[j++];
			}
			System.out.println(j);
		}
		
		/*
		for(int i=n ;i<=0;i--) {	//n이 15라면 15가 0 일될때까지 하나씩 감소 	//n을 홀수값
			int orr = i-1;
			System.out.println(orr);
			if(i%2==1) {
			int [] A = new int [i%2];	
			System.out.println(A[i]);
			}
		}
		*/
	}// main E
}// class E
/*

 */