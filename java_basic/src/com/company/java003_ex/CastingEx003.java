package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
   public static void main (String [] args) {
	   // 변수
	 char big = ' ';
	 Scanner scanner= new Scanner(System.in);
	 
	  // 입력
	 System.out.print("대문자를 입력하세요");
	 big = scanner.next().charAt(0);  //  a(0)bc 
	 
	 // 처리(1)
	 // a(97) = A(65) + 32
	 //  big += 32;  1) + 더하기 (big + 32)   2) = 대입  big = (big+32)
	 
	 // 처리(2)
	 big=(char) (big+32);   //big(char:2byte) + 32(int:4byte)
	 
	 // 출력
	 System.out.println(big);
	 
	 //Q2 실수에 정수대입시 실수로
	 float f1 = 1+1.0f;
	 System.out.println(f1);
 
  }
}
