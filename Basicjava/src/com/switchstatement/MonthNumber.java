package com.switchstatement;

import java.util.Scanner;

public class MonthNumber {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Month name (lowercase):");
			String mName=sc.next();
			
			switch(mName)
			case "january":
			case "march":
			case "may":
			case "july":
			case "august":
			case "october":
			case "december":System.out.println("31 days");
				            break;
				            
			
				            
			case "april":
			case "june":
			case "september":
			case "november":System.out.println("30days");	
				            break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	

}
