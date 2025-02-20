package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {

	public static void main(String[] args) {
		// 변수
		int d,d1,result=0; char operator= ' ';
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("정수 입력>");
		d= scanner.nextInt();
		System.out.print("정수 입력>");
		d1=scanner.nextInt();
		System.out.print("연산자 입력>");
		operator=scanner.next().charAt(0);
		// 처리 & 출력
		// 만약 연산자가 플러스라면 더하기 연산
		if(operator=='+') {result=d+d1; System.out.println(d+"+"+d1+"="+result);}
		// 연산자가 마이너스라면 빼기 연산
		else if(operator=='-') {result=d-d1; System.out.println(d+"-"+d1+"="+result);}
		// 연산자가 곱셈이라면 곱하기 연산
		else if(operator=='*') {result=d*d1; System.out.println(d+"*"+d1+"="+result);}
		// 연산자가 나눗셈이라면 나누기 연산
		else if(operator=='/') {result=d/d1; System.out.println(d+"/"+d1+"="+result);}
		

	}

}
