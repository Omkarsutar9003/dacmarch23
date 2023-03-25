//How to check whether the given number is Positive or Negative in Java?
import java.util.*;

class Positive_negative
{
     public static void main(String args[])
	{
	System.out.println("Enter numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	
	if(a>0)
	{
	System.out.println("Postive number");	
	}
    else
	{
		System.out.println("negative number");	
	}
	
	}
}