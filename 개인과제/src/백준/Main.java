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
		Scanner sc = new Scanner(System.in);
		
		String my_String = "bus";
		String S=" a, e, i, o, u ";
		String answer ="";
		
		int B= my_String.indexOf(S);
		//모든 약수의 수는 순서쌍의 수와 같다??
	}// main E
}// class E
/* b
 * if(s2[i].length()==s1[i].length()&&s2[i].charAt(i)==s1[i].charAt(i)) { s2=new
 * String[A]; answer++;
 * 
 * answer=s1[].charAt(i); String index out of range 배열길이를 벗어남
 * 
 * 
 * 0,1,4,5,6,9 가 있다 == 제곱수이다??
 * 
 * for(int i=0;i<=n;i++) {
				for(int j=0;j<=n;j++) {
					if(n==(i*j))
						answer++;
				}
			}
			
				while(A) {
				int i=0; int j=0;
				i++;j++;
				if(n==(i*j)) {answer++;}
				else if(n!=(i*j)){continue;}
				else if(n==i) {
					A=false;
				}
			}
			
				int answer=0;
		 for(int i = 1 ; i <= n ; i ++) {
		        if(n%i == 0) {answer++;}
		    }
	System.out.println(answer);
	
	////////////////////////////////////////////
	 * 		int [] array= {1, 2, 7, 10, 11};
		int answer=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]>=array[j]) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		answer=array[array.length/2];
		//모든 약수의 수는 순서쌍의 수와 같다??
	 * 
	 */
