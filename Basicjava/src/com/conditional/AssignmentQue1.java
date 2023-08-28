////. Write a Java program to check whether a number is divisible by 5 and 11 or not 

package com.conditional;

import java.util.Scanner;


public class AssignmentQue1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		
		if((number%3==5)&&(number%11))
		{
			System.out.println(number+"is diivisible by 5");
		}		
		
		
		
		
		
		
		
	}

}
