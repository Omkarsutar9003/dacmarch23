import java.util.*;
class Lcm_no
{
     public static void main(String args[])
	{
	System.out.println("Enter two numbers");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=(a<b)?b:a;
	
	for(int i=1;i<=c;c++)
	{
	  if(c%a==0&&c%b==0)
	  {
		  System.out.println("Lcm = "+c);
		  break;
	  }
		
	}
	
	
	}
	
}