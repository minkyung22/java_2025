package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main (String [] args) {
		// GIGO
		// 변수
		int d = 0;
		Scanner scanner= new Scanner(System.in);
		// 입력
		System.out.print("좋아하는 수(정수) 입력하시오 >");
		d = scanner.nextInt();
		// 처리 x
		// 출력
		System.out.println("좋아하는 숫자는"+d+"입니다");
		System.out.printf("좋아하는 숫자는 %d 입니다", d);
		
	}
}
