package java1.c조건문반복문;

import java.util.Scanner;

public class EE1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//구구
		for(int 곱=2;곱<=9;곱++) {
			for(int 단=1;단<=9;단++) {
			System.out.println(곱+"X"+단+"="+단*곱);
			}
			}
		
		
		
		///
		
		System.out.println("a = ");int a=scanner.nextInt();
		System.out.println("b = ");int b=scanner.nextInt();
		System.out.println("c = ");int c=scanner.nextInt();
		
	if(a>b) {int temp=a;a=b;b=temp;}
	if(a>c)	{int temp=a;a=c;c=temp;}
	if(b>c) {int temp=b;b=c;c=temp;}
	System.out.println("오름차순 :"+a+b+c);
	}
		
	}
