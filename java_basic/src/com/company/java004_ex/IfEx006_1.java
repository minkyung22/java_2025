package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_1 {

	
	public static void main(String[] args) {
		// 변수
		int num;
		Scanner scanner=new Scanner(System.in);
		String result="여자 ";
		// 입력
		System.out.print("숫자를 입력 >");
		num=scanner.nextInt();
		// 처리 
		if (num%2==1) {result="남자";}
		// 출력
		System.out.println(result);
	
	}
}