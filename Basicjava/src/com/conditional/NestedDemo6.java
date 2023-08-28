package com.conditional;

import java.util.Scanner;

public class NestedDemo6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("WELCOME TO BOOK MY SHOW..");
		
		System.out.println("Enter Movie name:");
		String name=sc.next();
		
		System.out.println("Enter rating:");
		float rating=sc.nextFloat();
		
		System.out.println("Enter price:");
		int price=sc.nextInt();
		
		
		
		System.out.println("Coupen codes available");
		
		System.out.println("Enter the code:");
		int code=sc.nextInt();
		
		int discount=0;
		
		if (code==0)
		{
			System.out.println("You got discount of Rs.50 ="+(price-50));
			System.out.println("Your ticket is booked at Rs." +(price-50) +" "+ "Keep watching BOOK MY SHOW..");
			
		}
		else if(code==1)
		{
			System.out.println("You got discount of Rs.100=" +(price-100));
			System.out.println("Your ticket is booked at Rs." +(price-100) +" "+ "Keep watching BOOK MY SHOW..");
			
		}
		else 
		{
			System.out.println("code is invalid");
			System.out.println("Your ticket is booked at Rs." +price);
			
		}
		
		 
		
	}

}
