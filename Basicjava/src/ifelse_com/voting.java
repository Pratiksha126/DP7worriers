package ifelse_com;
import java.util.Scanner;
public class voting {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter you age:");
	int age=sc.nextInt();
	
	if (age>=18)
	{
		System.out.println("You can vote");
	}
	else
	{
		System.out.println("You can not vote");
	}	
   
}

}

