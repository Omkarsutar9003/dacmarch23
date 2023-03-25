//Write a Java Program to print all the Factors of the Given number. import java.util.*;
import java.util.*;
class Factors
{
     public static void main(String args[])
	{
	System.out.println("Enter numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			System.out.print(i+" ");
		}
	}
	
	
	}
	
	
}