package java1.ch4배열;

import java.util.Scanner;

public class EX7_비회원제게시판과제 {//class S
	 public static void main(String[] args) {//main S
	      String[][]textlist=new String[100][4];
	      Scanner scanner=new Scanner(System.in);

	      while(true) {
	         System.out.println("---------커뮤니티-------------");
	         System.out.println("번호\t 작성자\t \t제목");
		       
	         	for(int i=0;i<textlist.length;i++) {
		        	 	if(textlist[i][0]!=null) {
		        	 		System.out.print(i+"\t");
		        	 		System.out.print(textlist[i][2]+"\t\t");
		        	 		System.out.print(textlist[i][0]+"\n");
		        	 	}
		         }
	         
	         System.out.println("1.글쓰기\t 2.글보기\t \t선택 ");int num=scanner.nextInt();
	         
	       
	         
	         if(num==1)//1을 선택했을떄
	         {
	        	 
	            System.out.println("================글쓰기=============");
	            System.out.print("title :");String title=scanner.next();
	            System.out.print("content :");String content=scanner.next();
	            System.out.print("writer :");String writer=scanner.next();
	            System.out.print("password :");String password=scanner.next();
	            for(int i=0;i<textlist.length;i++) {
	            if(textlist[i][0]==null) {
	            textlist[i][0]=title;	textlist[i][2]=writer;
	            textlist[i][1]=content;	textlist[i][3]=password;
	            System.out.println("글써짐");  break;
	            }
	            
	            } 
	         }
	         else if(num==2)//2를 선택했을때 
	         {	
	        	 System.out.println("게시글을 선택하세요 ");int numT=scanner.nextInt();
	        	for(int i=0;i<textlist.length;i++) {
	        		if(numT==i) {
	        			
	        		System.out.println("=============상세페이지=============");
	        		System.out.println("1.목록보기 2.글삭제 3.글수정 \n선택");int input=scanner.nextInt();
	        		if(input==1) //1.목록보기 선택시
	        		{break;}
	        		else if(input==2) //2글삭제 선택시
	        		{	
		        	
		        		
		        	
	        		textlist[i][0]=null;	textlist[i][1]=null;
	        		textlist[i][2]=null;	textlist[i][3]=null;
	        		for(int j=i;j<textlist.length;j++) {
	        			textlist[j][0]=textlist[j+1][0];
	        			textlist[j][1]=textlist[j+1][1];
	        			textlist[j][2]=textlist[j+1][2];
	        			textlist[j][3]=textlist[j+1][3];
	        			if(textlist[i+1][0]==null)break;
	        		}//for E
	        		}//else if E
	        		else if(input==3)//3글수정 선택시
	        		{
	        			
	        		}//else if E
	        			
	        		}//if E
	        	}//for E
	         }//else if E
	         else {System.out.println("입력할수 없는 번호입니다."); }
	          
	      }//whlie E
	   }//main E

}//class E
