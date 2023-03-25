import java.util.*;
class Fact
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter no");
	   int num=sc.nextInt();
	   int fact=num;
	   for(int i=1;i<num;i++)
	   {
		  fact=fact*(num-i); 
	   }
	   
	   System.out.println(fact);
	   
	   
	   
	   
	   
   }
	
	
}