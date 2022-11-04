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
	int price = scanner.nextInt();
	int answer= 0;
	if(price>=100000&&price<300000) {
		answer=(int) (price-(price*0.05));
	}
	else if(price>=300000&&price<500000){
		answer=(int)(price- (price*0.1));
	}
	else if(price>=500000&&price<=1000000) {
		answer=(int)(price-(price*0.2));
	}
	else if(price<=100000){
		answer=price;
	}
	System.out.println(answer);
		
	}// main E
}// class E
/*

 */