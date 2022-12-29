package 백준;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;
// 회원가입시 DB저장용 암호화
public class BankPW {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String A = sc.next();
         System.out.println(A); // long 타입 큰 의미는 없음 int여도 지장 없음 숫자를 받아온다. 
         String num = "";
         
         int pwtest=System.identityHashCode(A);
         System.out.println(A);
////         num = Long.toHexString(A+7);
         Random random = new Random();
//         System.out.println("num");         
//         System.out.println(num);               
//         System.out.println("num");         
         
           System.out.println("random : " + random);
           int length = 100;
           System.out.println("length : " + length);
           int newWord1 = 0;
           int newWord2 = 0;
           System.out.println("처음에 빈문자생성 newWord1 : "+newWord1);
           // newWord1 로직
           for (int i = 0; i < length; i++) {
               int choice = random.nextInt(3);
               switch(choice) {
                   case 0: // choice가 0일때 //97 ~ 122까지 영문 소문자
                      newWord1+=random.nextInt(12)+13;
                       break;
                   case 1: // choice가 1일때 //58~64 특수문자 
                        newWord1+=random.nextInt(23)+44;
                       break;
                   case 2: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
                        newWord1+=random.nextInt(44)+11;
                       break;
                   case 3: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
                        newWord1+=random.nextInt(2)+55;
                       break;
                  }
           }
           // newWord1 로직
           for (int i = 0; i < length; i++) {
              System.out.println("i : "+i);
               int choice = random.nextInt(5);
               System.out.println("choice : "+choice);
               switch(choice) {
               case 0: // choice가 0일때 //97 ~ 122까지 영문 소문자
                    newWord2+=(int)random.nextInt(12)+13;
                    break;
                case 1: // choice가 1일때 //58~64 특수문자 
                   newWord2+=(int)random.nextInt(12)+13;
                    break;
                case 2: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
                   newWord2+=(int)random.nextInt(12)+13;
                    break;
                case 3: // choice가 1일때 //65 ~ 90 까지 영문 대문자 
                   newWord2+=(int)random.nextInt(12)+13;
                    break;
                  }
           }
           
           
//           D5A96614fQMvxTn95VJ7abOb32a3b9a5b3
           System.out.println("4번 //");
           System.out.println("4-1번 newWord1 : "+newWord1);
           System.out.println("4-2번 newWord2 : "+newWord2);
           System.out.println("4-3번 : test "+pwtest);
           System.out.println("최종값 : newWord2+newWord1+num");
           System.out.println(newWord1+pwtest+newWord2);
           int B = newWord1+pwtest+newWord2;
           
           if(B==pwtest+newWord1+newWord2) {
              System.out.println("비밀번호 일치"); 
           }else {
              System.out.println("비밀번호 불일치");
           }
   }
}