//14. Write a Java Program to find the GCD of two given numbers.
import java.util.*;
class Gcd_no
{
     public static void main(String args[])
	{
	System.out.println("Enter two numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=(a<b)?b:a;
	int temp=0;
	for(int i=2;i<=c;i++)
{
	if(a%i==0&&b%i==0)
	{
		temp=i;
	}
		
	
}
     System.out.println("Greatest Common Factor of "+a+" and "+b+" is = "+temp);
	

	}
	
}