//Write a Java Program to print all the Prime Factors of the Given Number.

import java.util.*;
class Prime_facto
{
     public static void main(String args[])
	{
	System.out.println("Enter numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int temp=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			temp++;
		 System.out.println(i);
			
	    }
					
	}
	
	  // System.out.println(" "+temp);
	
	}
	
	
	
}