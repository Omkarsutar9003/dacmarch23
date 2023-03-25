//To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....
import java.util.*;
class Series_even
{
	public static void main(String args[])
	{ 
	
	  Scanner sc=new Scanner(System.in); 
	   System.out.println("Ente num");
	   int temp=sc.nextInt();
		int i=0;
		for( ;i<temp;)
		{
			
			System.out.println(i);
			i=i+2;
		}
		
	}
}