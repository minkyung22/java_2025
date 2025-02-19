package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {

	public static void main(String[] args) {
		//변수
		int num;  int num1; 
		Scanner scanner =new Scanner(System.in);
		//입력
        System.out.print("숫자 입력1 >");
        num = scanner.nextInt();
        System.out.print("숫자 입력2 >");
        num1 = scanner.nextInt();
        //처리 x
        double result = (double)num/num1;  //정수/정수
        //출력
        // 10 / 3 = 3.33               String.format("출력서식","처리할값);
        // System.out.printf("%d / %d = %.2f\n",num,num1,((double)num/num1));
        // System.out.println(num +"/"+ num1+ "=" +((double)num/num1));
        System.out.println( num + "/" + num1 + "=" + String.format("%.2f",result)); //##
        System.out.printf("%d / %d = %.2f" , num,num1,result);
        
	}

}
