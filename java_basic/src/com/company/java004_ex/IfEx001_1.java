package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001_1 {

 public static void main(String[] args) {
	// 변수
	int avg; String result="불합격";
	Scanner scanner=new Scanner(System.in);
	// 입력
	System.out.print("평균을 입력>");
	avg=scanner.nextInt();
	// 처리 
	if(avg>=60) {System.out.println("합격");}
	// 출력
	System.out.println(result);
	
	
}
}
