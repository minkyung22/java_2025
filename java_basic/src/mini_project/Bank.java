package mini_project;

import java.util.Scanner;

public class Bank {
  public static void main (String [] args) {
	  // 변수
	  int num=1; char id=' ',pass=' '; int age=0 ,balance=0; 
	  char temp_id=' ';  char temp_pass= ' ';
	  Scanner scanner=new Scanner(System.in);
	  
	  // step1. 메뉴판 무한반복
	  for(;;) { //# 무한반복
		  System.out.print("\n\n========BANK========\r\n"+ "1.추가\r\n"+"2.조회\r\n"+"3.입금\r\n"+"4.출금\r\n"+"5.삭제\r\n"+"9.종료\r\n"+"입력>>>\n");
		  
	      num = scanner.nextInt();
	 
	  if      (num==1) {System.out.println("추가기능입니다.");
	  //Step3. 추가

	  //*ID :   _입력받기 first
	  //*PASS :   _입력받기 1111 
	  //*BALANCE : _입력받기 10000
	  
	  System.out.print("*ID : ");  
	  id=scanner.next().charAt(0);
	  System.out.print("*PASS : ");
	  pass=scanner.next().charAt(0);
	  System.out.print("나이 입력");
	  age=scanner.nextInt();
	  System.out.print("*BALANCE : ");
	  balance=scanner.nextInt();
	  
	  }
	  else if (num==2) {System.out.println("조회기능입니다.");
	  //Step4. 조회
	  //변수- 임시변수 temp_id,임시변수 temp_pass
	  //입력- 임시변수 temp_id, temp_pass 입력받기
	  //처리- temp_id 와 id가 같고 temp_pass 와 pass가 같다면 사용자정보출력
	  //    아니라면 비밀번호를 확인해주세요.
	  //변수
	
	  //입력
	  System.out.print("*ID : ");  
	  temp_id=scanner.next().charAt(0);
	  System.out.print("*PASS : ");
	  temp_pass=scanner.next().charAt(0);
	  //처리
	  if(temp_id==id && temp_pass==pass) {System.out.println("ID : "+id+ "\nPASS:"+pass+"\nBALANCE:"+balance);}
	  else {System.out.println("비밀번호를 확인해주세요");}
	 
	  }
	  else if (num==3) {System.out.println("입금기능입니다.");
	  System.out.print("*ID : ");  
	  temp_id=scanner.next().charAt(0);
	  System.out.print("*PASS : ");
	  temp_pass=scanner.next().charAt(0);}
	  else if (num==4) {System.out.println("출금기능입니다.");}
	  System.out.print("*ID : ");  
	  temp_id=scanner.next().charAt(0);
	  System.out.print("*PASS : ");
	  temp_pass=scanner.next().charAt(0);}
	  if(temp_id== id && temp_pass==pass) {System.out.println("==송금완료\n 잔액:"+balance);}
	  
	  else if (num==5) {System.out.println("삭제기능입니다.");}
	  else if (num==9) {System.out.println("종료기능입니다.");}
	  if(num==9) {break;}
	
   }
  }
}
