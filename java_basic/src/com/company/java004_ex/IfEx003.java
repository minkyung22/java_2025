package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {

	public static void main(String[] args) {
		// 변수
		int d;
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("숫자를 입력");
		d=scanner.nextInt();
		// 처리 & 출력
		if (d==1) {System.out.println("one");}
		else if (d==2) {System.out.println("two");}
		else if (d==3) {System.out.println("three");}
		else  { System.out.println("1,2,3이 아니다");}
		
		}
		
		
	}


