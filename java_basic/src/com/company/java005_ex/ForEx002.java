package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main (String [] args) {
		// 변수
		int i=0; int j=0; 
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("숫자를 입력");
		i=scanner.nextInt();
		System.out.println("숫자를 입력");
		j=scanner.nextInt();
		
		//처리
		//for{변수} i=1~9까지 j=1~9까지
		//System.out.println(1*1);
		for(i=2; i<=9; i++) 
		for(j=1; j<=9; j++) 
		//출력
			
		{System.out.println(i+"*"+j+"="+(i*j));}
		
	}

}

         // int dan;

        // {System.out.println(2+"*"+1+"="+(2*1));}
		// {System.out.println(2+"*"+1+"="+(2*1));}
		// {System.out.println(2+"*"+1+"="+(2*1));}
       
        //{System.out.println(dan+"*"+i+"="+(dan*1);}




//사용자에게 단을 입력받아 해당하는 
//단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오.
