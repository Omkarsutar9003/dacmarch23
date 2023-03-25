import java.util.*;

class Even_odd
{
     public static void main(String args[])
	{
	System.out.println("Enter numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	
	String str=(a%2==0)?"even number":"Odd number";
	System.out.println(str);
	
	}
	
	
}