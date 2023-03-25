
//12. How to add two numbers without using the arithmetic operators in Java? 

import java.util.*;
class Add_12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two no");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		for(int i=1;i<=num2;i++)
		{
			num1++;	
		}
		System.out.println("Addition = "+num1);
		
	}
	
	
}
