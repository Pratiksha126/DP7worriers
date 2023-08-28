package basic;
import java.util.Scanner;

public class person
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter your name");
	  String name=sc.next();
	  System.out.println("enter your age");
	  int age=sc.nextInt();
	  System.out.print("my name is " +name );
	  System.out.print("my age is " +age );
	  sc.close();
  }
  
}
