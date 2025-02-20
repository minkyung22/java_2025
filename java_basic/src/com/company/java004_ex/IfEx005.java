package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {

	public static void main(String[] args) {
		// 변수
		char ch =' ';  String result= "";
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("문자한개를 입력 >");
		ch =scanner.next().charAt(0);
		// 처리 
		if(ch>= 'A' && ch<='Z') {result="소문자";}
		else  {result="대문자";}
	   // 출력
		System.out.println(result);
		
	}

}

// if(ch>= 'A' && ch<='Z')         { result=""+(ch+=32); }
// else if (ch>= 'a' && ch<='z')   { result=""+(ch-=32); }