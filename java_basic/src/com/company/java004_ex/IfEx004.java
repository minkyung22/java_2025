package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {

	public static void main(String[] args) {
		// 변수
		char ch=' ';  //ch='\u0000'
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("문자한개를 입력 >");
		//ch ='A'; 문자한개 'A' /String str="abc" 문자열
		ch =scanner.next().charAt(0);     // scanner.next() "a(0)b(1)c(2)문자열" / .chatAt(0)
		// 처리 & 출력
		if (ch >= 'A' && ch<= 'Z') {System.out.println("대문자");}
		else {System.out.println("소문자");}
		
	}

}

       // if (ch >= 'A' && ch<= 'Z')  {System.out.println("대문자");}
  // else if (ch>='a'&& ch<='z')      {System.out.println("소문자");}
  // else                             {System.out.println("알파벳만 입력가능합니다");}

