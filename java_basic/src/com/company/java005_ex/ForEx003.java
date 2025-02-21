package com.company.java005_ex;

import java.util.Scanner;

public class ForEx003 {
	
  public static void main(String [] args) {
	  // 변수
	  int sum=0; 
	  String result="";
	  // 입력
	  // 처리 
	  // ver-1
	  // 현재 합을 구하는 곳에 1을 더하고   //sum곳에 1누적 / "" 1 출력
	  // 현재 합을 구하는 곳에 2을 더하고   //sum곳에 2누적 /"+" 2 출력
	  
		//  sum=sum+1;    // 2) sum[1] = 1)0+1
	    //  sum=sum+2;    // 2) sum[3] = 1)1+2 
	    //  sum=sum+3;
	  
	  // ver-2
	   //sum+=1; System.out.print("" +1);
	   //sum+=2; System.out.print("" +2);
	   //sum+=3; System.out.print("" +3);
	  // ver-3 {} {변수} for(시작; 종료; 변화)
	  for(int i=1; i <=10; i++){sum=sum+i; System.out.print((i==1?"":"+")+i);}
	  // 출력
	  {System.out.print("1~10까지의 합: " + sum);}
	  
  }
  
}




//1~10까지의 합을 구하시오.