package basic;

import java.util.Scanner;

public class ScannerDemo {
   
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter distance:");
	 int distance =sc.nextInt();
	 
	 System.out.println("Enter time:");
	 int time =sc.nextInt();
	 
	 int speed=distance/time;
	 
	 System.out.println(speed);
	 
	 
	 
	}

	
	
}
