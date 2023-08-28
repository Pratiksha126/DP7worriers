package basic;

import java.util.Scanner;

public class BookingTickets {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Welcome to Airline !!");
		
		System.out.println("Enter Airline name:");
		String name=sc.next();
		
		System.out.println("Enter depart place:");
		String place=sc.next();
		
		
		System.out.println("Enter destination place:");
		String place1=sc.next();
		
		System.out.println("Enter coupen code if you have:");
		int code=sc.nextInt();
		
		double price=35000;
		if(code==4500)
		{
		 
		 System.out.println("we are providing you 10% discount");
		 double discount=price*0.1;
		 System.out.println("Your discount is:"+discount);
		
		}
		else
		{
		  System.out.println("No such coupens available...");
		  System.out.println("your final ticket price is:"+price);
		}	
		 
		  System.out.println("Congratulation !! Your ticket has been booked...");
		  System.out.println("Enjoy Your Holidays...");
		  
		  
		
		
		
	}

}
