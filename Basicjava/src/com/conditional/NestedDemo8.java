package com.conditional;

import java.util.Scanner;

public class NestedDemo8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int pin=3333;
		int balance=15000;
		System.out.println("WELCOME TO HDFC BANK");
		
		System.out.println("Enter your pin:");
		int pin1=sc.nextInt();
		
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check balance");
		System.out.println("4.Exit");
		
		System.out.println("Please enter your choice.");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter amount to deposite");
			int deposite=sc.nextInt();
			System.out.println("Your current balance is" +" " +(balance+deposite));
		}
		else if(choice==2)
		{
			System.out.println("Enter amount for Withdraw");
			int Withdraw=sc.nextInt();
			System.out.println("Your current balance is"+" "+(balance-Withdraw));
		}	
		else
		{
			System.out.println("Your pin is invalid");
		}
			
		
		

		
		
		
		
		
		
		
		
		
	}

}
