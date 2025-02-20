package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {

	public static void main(String[] args) {
		// 변수
		int gradeK=0, gradeE=0, gradeM=0;
		String student_number="", level="",student="",a="";
		int sum=0;
		double avg= 0.0;
		
		
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("학번입력");
		student_number=scanner.next();
		System.out.print("국어점수 입력>");
		gradeK=scanner.nextInt();
		System.out.print("수학점수 입력> ");
		gradeM=scanner.nextInt();
		System.out.print("영어점수 입력");
		gradeE=scanner.nextInt();
		// 처리
		sum = gradeK+gradeE+gradeM;
		avg = sum/3.0;
		
		if (avg>=60 && gradeK>40 && gradeM>40 && gradeE>40) {
			a="합격";
			} else a="불합격";
		     if (avg>=95) {
		    	 student="장학생";
		    	 }
		     if (avg>=90) {
		    	 level ="수";
		     } else if (avg>=80) {
		    	 level ="우";
		     } else if (avg>=70) {
		    	 level ="미";
		     } else if (avg>=60) {
		    	 level ="양";
		     } else {
		    	 level ="가";
		     }
		
		     // 출력
		     System.out.println("======================================================================");
		     System.out.println("학번"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부"+"\t"+"레벨"+"\t"+"장학생"+"\t");
		     System.out.println("======================================================================");
		     System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n", student_number,gradeK,gradeE,gradeM,sum,avg,a,level,student);
	
	}
		
	
}
