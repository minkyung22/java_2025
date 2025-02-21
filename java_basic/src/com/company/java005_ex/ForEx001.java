package com.company.java005_ex;

public class ForEx001 {
	
   public static void main (String [] args) {
	   for(int i=1; i<=5; i++)
	   {System.out.print(i+"\t");}    System.out.println();
	   for(int i=5; i>=1; i--)
	   {System.out.print(i+"\t");}   
	   
	   //for{변수}
//	     System.out.println("JAVA1");
//       System.out.println("JAVA2");
//       System.out.println("JAVA3");        // {} {변수} for()
	    
	   for(int i=1; i<=3;i++)
	   {System.out.print("JAVA" +i+"\t");}  System.out.println();
//	   for( i=JAVA1; i<=JAVA3; i++)
//	   {System.out.print(i+"\t");}    System.out.println();  
   
	   // for{변수}
//	   System.out.println("HAPPY3");
//	   System.out.println("HAPPY2");
//	   System.out.println("HAPPY1");
	   for(int i=3; i>=1; i--) 
	   {System.out.print("HAPPY"+i+"\t");}  System.out.println();
	   
	   for(int i=0; i<=2; i++) 
	   {System.out.print(i+",");}
	   // {System.out.print((i==0? " ":",")+i);}
	   for(int i=0; i<=99;i++) 
	   {System.out.print((i==0? " ":",") +i);}
	   //system.out.print(" "+10);
	   //system.out.print(" "+9);   //9 
	   //system.out.print(" "+9);   // 변화 1
	   for(int i=10; i>=1; i--) 
	   {System.out.println((i==10? " ":"," )+ i);}  
	   for(int i=0; i<=8; i+=2) 
	   {System.out.print(i+",");}    System.out.println();
	   for(int i=0; i<=18; i+=2) 
	   {System.out.print(i+",");} 
		   
   }
   
}
