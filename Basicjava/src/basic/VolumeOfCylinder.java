package basic;

import java.util.Scanner;

public class VolumeOfCylinder 
{
  public static void main(String[] args) {
		   
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the radius");
  double radius =sc.nextDouble();
  System.out.println("enter the height");
  double height =sc.nextDouble();
  double result=(Math.PI)*radius*radius*height;
  System.out.println("volume of cylinder is:"+result);
  sc.close();
		   
		
	}

}
