package 백준;

import java.awt.Window.Type;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

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
		String my_string = "1a2b3c4d123";
//		int [] test = {0,1,2,3,4,5,6,7,8,9};
		int answer = 0;
		/*
		 * String[] A = new String[my_string.length()]; String replace = "";
		 * 
		 * replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]",
		 * ""); String[] arry = replace.split("");
		 * 
		 * for (int i = 0; i < arry.length; i++) { answer += Integer.parseInt(arry[i]);
		 * }
		 */
		
		String [ ] A = new String[my_string.length()]; 
		String re = "";
		re = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstubwxyz]", "");
		A=re.split("");
		for(int i = 0; i<A.length;i++) {
			System.out.println(Integer.parseInt(A[i]));
			answer+=Integer.parseInt(A[i]);
		}
			
		System.out.println("sdsd");
		System.out.println(answer);
		
		String G = "AASSSDD123";

	}// main E
}// class E
/*
 * b if(s2[i].length()==s1[i].length()&&s2[i].charAt(i)==s1[i].charAt(i)) {
 * s2=new String[A]; answer++;
 * 
 * answer=s1[].charAt(i); String index out of range 배열길이를 벗어남
 * 
 * 
 * 0,1,4,5,6,9 가 있다 == 제곱수이다??
 * 
 * for(int i=0;i<=n;i++) { for(int j=0;j<=n;j++) { if(n==(i*j)) answer++; } }
 * 
 * while(A) { int i=0; int j=0; i++;j++; if(n==(i*j)) {answer++;} else
 * if(n!=(i*j)){continue;} else if(n==i) { A=false; } }
 * 
 * int answer=0; for(int i = 1 ; i <= n ; i ++) { if(n%i == 0) {answer++;} }
 * System.out.println(answer);
 * 
 * //////////////////////////////////////////// int [] array= {1, 2, 7, 10, 11};
 * int answer=0; for(int i=0;i<array.length;i++) { for(int
 * j=0;j<array.length;j++) { if(array[i]>=array[j]) { int temp=array[i];
 * array[i]=array[j]; array[j]=temp; } } } answer=array[array.length/2]; //모든
 * 약수의 수는 순서쌍의 수와 같다??
 *
 * ============================================================== String
 * my_String = "nice to meet you"; String Ssss = "a,e,i,o,u"; String answer =
 * ""; for(char A : Ssss.toCharArray()) {
 * my_String=my_String.replace(String.valueOf(A),""); } answer=my_String;
 * System.out.println(answer);
 * 
 * 
 * 
 * ===================================================================== for(int
 * i=0;i<my_string.length();i++) { A = my_string.toCharArray(); for(int
 * j=0;j<A.length;j++) { for(int k=0;k<S.length;k++) { if(A[i]==S[k]) { count++;
 * } } } }
 * 
 * =============================================================================
 * ===== int answer = 0; int hp=999; answer +=(hp/5); hp%=5;
 * 
 * answer+=(hp/3); hp%=3;
 * 
 * answer+=(hp/1);
 * 
 * System.out.println(answer);
 */
