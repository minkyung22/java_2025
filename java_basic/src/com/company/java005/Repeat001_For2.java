package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {
	 public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 // 무한반복
		    for(;;) { // #1. 조건이 없으면 무한반복
			System.out.println("숫자를 입력하세요");
			int a=scanner.nextInt();
			 if(a==1) {break;}
			
		 }
			// for - break
			 for(int i=1; i<=10;i++) {
				 if(i==3) {break;}
				 System.out.print(i + "\t");
			 }
		 
		 System.out.println();
		// for - continue
		 for(int i=1; i<=10;i++) {
			 if(i==3) {continue;}
			 System.out.print(i + "\t");
		   }

		 }
		 
	 }
		 
		
