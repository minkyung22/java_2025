package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {

	public static void main(String[] args) {
		int K,E,M,sum;double avg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		K = scanner.nextInt();
		System.out.print("영어점수를 입력하세요");
		E= scanner.nextInt();
		System.out.print("수학점수를 입력하세요");
		M= scanner.nextInt();
		
		sum=K+E+M;
		avg= sum/3.0;
		
//		System.out.println("총점"+sum);
//		System.out.println("평균"+avg);
		System.out.printf("총점: %d  \n평균 : %.2f", sum,avg );

	}

}
