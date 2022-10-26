package 백준;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num_list= {1,2,3,4,5};
        int J = 0; int H=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                J++;
            }else if(num_list[i]%2==1){
                H++;
            }
          int[] answer = {J,H};
            System.out.println(answer[0]);
        }


	}// main E
}// class E
/*
 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
  n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 
  하는지를 return 하도록 solution 함수를 완성해보세요.
  한사람당 한조각씩 
  
  사람의 수를 피자 조각 수로 나눈 값 + 사람의 수를 피자 조각 수로 나눈 값의 나머지가 0이면 0 더해주고 아니면 1 더해준다.
 */