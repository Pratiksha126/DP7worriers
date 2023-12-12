package basic;

public class LogicalProgram {
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println(a>5 & b<30);
		System.out.println(a>5 & b>30);
		System.out.println(a<5 & b<30);
		System.out.println(a<5 & b>30);
		
		
		System.out.println(a>5 | b<30);
		System.out.println(a>5 | b>30);
		System.out.println(a<5 | b<30);
		System.out.println(a<5 | b>30);
		
		
		
		
		
	}

}
