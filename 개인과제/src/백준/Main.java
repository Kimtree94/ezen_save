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
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
		for (int j = 0; j < s1.length; j++) {
			for (int i = 0; i < s2.length; i++) {
				if (s1[j].equals(s2[i])) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}// main E
}// class E
/*
 * if(s2[i].length()==s1[i].length()&&s2[i].charAt(i)==s1[i].charAt(i)) { s2=new
 * String[A]; answer++;
 * 
 * answer=s1[].charAt(i); String index out of range 배열길이를 벗어남
 */