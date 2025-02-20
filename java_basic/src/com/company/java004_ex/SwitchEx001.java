package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {

	public static void main(String[] args) {
		// 변수
		int num=0;
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("숫자 한개 입력");
		num=scanner.nextInt();
		// 처리     num==3 / num==6/ num==9/ num==12
	    switch (num){
	    case 3  :   System.out.println("봄");      break;
	    case 6  :   System.out.println("여름");     break;
	    case 9  :   System.out.println("가을");     break;
	    case 12 :   System.out.println("겨울");     break;
	    }
	    
	  

  }
}
