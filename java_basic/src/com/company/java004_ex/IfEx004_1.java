package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_1 {

	public static void main(String[] args) {
		        // 변수
				char ch=' ';  //ch='\u0000'
				Scanner scanner=new Scanner(System.in);
				String result="알파벳만 가능합니다! ";
				// 입력
				System.out.print("문자한개를 입력 >");
				//ch ='A'; 문자한개 'A' /String str="abc" 문자열
				ch =scanner.next().charAt(0);     // scanner.next() "a(0)b(1)c(2)문자열" / .chatAt(0)
				// 처리
				     if (ch >= 'A' && ch<= 'Z')     {result="대문자";  }
				else if (ch >='a'   && ch<='z')     {result="소문자";  }
		        // 출력
				System.out.println(result);
	}

}
