package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {

	public static void main(String[] args) {
		// 변수
		int num;
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("숫자를 입력 >");
		num=scanner.nextInt();
		// 처리 & 출력
		if (num%2==1) {System.out.println("남자");}
		else {System.out.println("여자");}
	
	}

}
