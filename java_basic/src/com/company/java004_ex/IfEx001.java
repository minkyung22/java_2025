package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {

	public static void main(String[] args) {
		// 변수
		int avg;
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("평균을 입력>");
		avg=scanner.nextInt();
		// 처리 & 출력
		if(avg>=60) {System.out.println("합격");}
		else  {System.out.println("불합격");}
		
		
	}
}
		
		
		

