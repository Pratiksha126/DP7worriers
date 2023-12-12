package basic;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter your sub1 marks:");
		float sub1=sc.nextFloat();
		
		System.out.println("Enter your sub2 marks:");
		float sub2=sc.nextFloat();
		
		System.out.println("Enter your sub3 marks:");
		float sub3=sc.nextFloat();
		
		int total=(int) (sub1+sub2+sub3);
		float percentage=total*100/300;
		
		System.out.println("your total percentage are:" +"  " +percentage);
		         
		
		
		
		
	}

}
