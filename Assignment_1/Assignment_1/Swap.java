/*Swap two numbers without using the third variable approach.*/
import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
	System.out.println("Enter two numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	a=a+b;
	b=a-b; //(a+b)-b=a
	a=a-b; //(a+b)-a=b
	
	System.out.println(a);
	System.out.println(b);
	}
}