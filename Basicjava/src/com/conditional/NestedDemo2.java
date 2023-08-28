package com.conditional;

public class NestedDemo2 {

	public static void main(String args[])
	{
		float per=66f;
		
		if(per>=65)
		{
		 System.out.println("eligible for college admission");
		if(per>=80)
		 System.out.println("can opt for sci and comm stream");	
		else
		 System.out.println("can opt for comm stream");	
		}
		
		
		
		
		else
		{
			System.out.println("not eligible for college admission");
		}
		
		
	}
}
