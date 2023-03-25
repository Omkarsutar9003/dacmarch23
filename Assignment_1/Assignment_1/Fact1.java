//3. Find the Factorial of a number using Recursion.
import java.util.*;

class Fact1
{
	public static int fact(int num)
	{
		
		if(num>=1)
		{
			return(num*fact(num-1));
		}
		else 
		{
			return 1;
			
		}
		
	
	}
	
	
 public static void main(String args[])
 {
	  Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter no");
	   int num=sc.nextInt();
	    int temp=num;
	          temp=fact(num);
			  
	   System.out.println("factorial of "+num+" is "+temp);
	 
 }


}


