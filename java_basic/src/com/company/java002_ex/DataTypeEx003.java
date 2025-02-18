package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {

	public static void main(String[] args) {
		// 변수 (7자리 float / 15자리 double)
		float pi = 0.0f;
		Scanner scanner = new Scanner(System.in);
		System.out.print("파이값을 입력하세요");
		pi= scanner.nextFloat();
		System.out.println("파이값은 " + pi+ "입니다.");
		System.out.printf("파이값은 %f입니다.\n" , pi);
		System.out.printf("파이값은 %.2f입니다\n." , pi);
		System.out.printf("파이값은 %.3f입니다\n." , pi);

	}

}
