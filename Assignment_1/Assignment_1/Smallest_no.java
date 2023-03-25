//11. Write a Java Program to find the smallest of 3 numbers (a,b,c)

import java.util.*;
class Smallest_no
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three no");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		int small= (num1<num2&&num1<num3)?num1:((num2<num3)?num2:num3);
		System.out.println("Smallest No = "+small);
		
		
		
		small= (num1>num2&&num1>num3)?num1:((num2>num3)?num2:num3);
		System.out.println("Largest No = "+small);
		
	}
	
}