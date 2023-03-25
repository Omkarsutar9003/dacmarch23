import java.util.*;

class Print_digit
{
  public static void main(String args[])
  {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter no");
	   int num=sc.nextInt();
	   int temp=0;
	   int sum=0;
	    System.out.println("digit are = ");
	   for(int i=0;num!=0;i++)
	   {
		 temp=num%10;
		 num=num/10;
		 sum=sum+temp;
		 System.out.print(temp+" ");
		 
	   }
	  System.out.println("Sum = "+sum+" ");
  
  }

}