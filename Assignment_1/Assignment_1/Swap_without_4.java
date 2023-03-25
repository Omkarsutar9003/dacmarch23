//4. Swap two numbers without using the third variable approach. 

import java.util.*;
class Swap_without_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two no");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before Swap ->a = "+num1+"  "+"b = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swap -> a = "+num1+"  "+"b = "+num2);
		
	}
	
	
}