package com.loop;

public class DivisibilityTest {
	public static void main(String args[]) {
	
	for(int i=1;i<=50;i++)
	{
		
	if((i%3==0)&&(i%5==0))
	{
	  System.out.println("BYE");
	}
	  else if(i%3==0)
	   {
		 System.out.println("HELLO"); 
	   }
	     else if(i%5==0)
	      {
	    	 System.out.println("WELCOME");
	      }
	        else
	        {
	    	   System.out.println(i);
	        }
	}
	}   
	
}
