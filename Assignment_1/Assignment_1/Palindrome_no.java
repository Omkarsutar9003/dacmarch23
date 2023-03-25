//Check whether the Given Number is a Palindrome or NOT. 

import java.util.*;
class Palindrome_no
{
     public static void main(String args[])
	{
	System.out.println("Enter numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int rev=0;
     int orignal=a;
	while(a!=0)
	{
		int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		
	}
	
	//System.out.println(rev);
	
	String str=(orignal==rev)?"Palindrome":"not Palindrome";
	System.out.println(str);
	}
	
}