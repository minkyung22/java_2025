package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {

	public static void main(String[] args) {
		
		// 변수
	    int gradeK,gradeE,gradeM,sum; double avg;
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("국어점수를 입력하세요");
		gradeK= scanner.nextInt();
		System.out.print("영어점수를 입력하세요");
		gradeE= scanner.nextInt();
		System.out.print("수학점수를 입력하세요");
		gradeM= scanner.nextInt();
		
		sum = gradeK+gradeE+gradeM;
	    avg = sum/3.0;   //정수/정수 = 정수  299/3 몫> 해결방안) 정수/실수
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		System.out.printf("총점 : %d \n평균 : %.2f" ,sum ,avg);
		
		

	}

}
