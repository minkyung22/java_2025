package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {

	public static void main(String[] args) {
		// 변수
	   int K,E,M,sum,level; 
	   double avg;
	   Scanner scanner = new Scanner(System.in);
	   // 입력
	   System.out.print("국어점수를 입력>");
	   K= scanner.nextInt();
	   System.out.print("영어점수를 입력>");
	   E=scanner.nextInt();
	   System.out.print("수학점수를 입력>");
	   M=scanner.nextInt();
	   // 처리
	   sum = K+E+M;
	   avg = sum/3.0;       //(double)sum/3;   sum/(double)3;   (double)sum/(double)3;
	   level = (int) (avg/10);
	   // 출력
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	   System.out.println(":: GOOD  IT SCORE ::");	
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	   System.out.println("국어\t영어\t수학\t총점\t평균\t레벨");
	   System.out.println(K + "\t"+ E + "\t"+ M + "\t"+sum+"\t" +String.format("%.2f",avg)+ "\t"+level);
	   System.out.printf("%d\t%d \t%d \t%d \t%.2f \t%d" ,K,E,M,sum,avg,level);
	}

}



