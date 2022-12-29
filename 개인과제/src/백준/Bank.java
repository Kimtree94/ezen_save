package 백준;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		
		
			String num = "";
			num = Long.toHexString(A);
			Random random = new Random();
				
			System.out.println("12121212///////");
			System.out.println(num);			
			
	       System.out.println("random : "+random);
	        int length = 15;
	        System.out.println("length : "+length);
	        StringBuffer newWord1 = new StringBuffer();
	        StringBuffer newWord2 = new StringBuffer();
	        System.out.println("처음에 빈문자생성 newWord1 : "+newWord1);
	        // newWord1 로직
	        for (int i = 0; i < length; i++) {
	           System.out.println("i : "+i);
	            int choice = random.nextInt(3);
	            System.out.println("choice : "+choice);
	            switch(choice) {
	                case 0: // choice가 0일때 //97 ~ 122까지 영문 소문자
	                    newWord1.append((char)((int)random.nextInt(25)+97));
	                    System.out.println("0번 : "+newWord1);
	                    break;
	                case 1: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
	                    newWord1.append((char)((int)random.nextInt(25)+65));
	                    System.out.println("1번 : "+newWord1);
	                    break;
	                case 2: // choice가 2일때 //문자형 숫자(0부터9까지)는 48 ~ 58까지 범위다. 
	                    newWord1.append((char)((int)random.nextInt(10)+48));
	                    System.out.println("============ID PW===============");
	                    System.out.println("One : "+num);
	                    System.out.println("TWo : "+num+newWord1+7+num);
	               
	            	}
	        }
//	        D5A96614fQMvxTn95VJ7abOb32a3b9a5b3
	        System.out.println("4번 //////");
	        System.out.println("4번 : "+newWord2+newWord1+num);
	        
	        
	        String total = newWord2.toString() + newWord1.toString() + num;
	        System.out.println("5번 //////");
	        System.out.println("5번 //////");
	        String ID = sc.next();
	        String plus ="";
	        System.out.println("65번 //////");
	        System.out.printf( " hash : %X" ,ID.hashCode() );
	}
	public void name() {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String num = "";
			num = Long.toHexString(A);
		Random random = new Random();
	       System.out.println("random : "+random);
	        int length = 15;
	        System.out.println("length : "+length);
	        StringBuffer newWord1 = new StringBuffer();
	        StringBuffer newWord2 = new StringBuffer();
	        System.out.println("처음에 빈문자생성 newWord1 : "+newWord1);
	        // newWord1 로직
	        for (int i = 0; i < length; i++) {
	           System.out.println("i : "+i);
	            int choice = random.nextInt(3);
	            System.out.println("choice : "+choice);
	            switch(choice) {
	                case 0: // choice가 0일때 //97 ~ 122까지 영문 소문자
	                    newWord1.append((char)((int)random.nextInt(25)+97));
	                    System.out.println("0번 : "+newWord1);
	                    break;
	                case 1: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
	                    newWord1.append((char)((int)random.nextInt(25)+65));
	                    System.out.println("1번 : "+newWord1);
	                    break;
	                case 2: // choice가 2일때 //문자형 숫자(0부터9까지)는 48 ~ 58까지 범위다. 
	                    newWord1.append((char)((int)random.nextInt(10)+48));
	                    System.out.println("ONeOne///"+num);
	                    System.out.println("2번 : "+num+newWord1+7+num);
	               
	            	}
	        }
	}
}
