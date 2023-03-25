import java.util.*;
class Sw_case
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		String str;
		switch(choice)
		{
			case 1:
			  str="One";
			  break;
			  
			 case 2:
			  str="Two";
			  break;
			  
			case 3:
			  str="Three";
			  break;
			  
			case 4:
			  str="Four";
			  break;
			  
			 case 5:
			  str="Five";
			  break;
			  
			  default:
			  str="Invalid Chice";
			
			
			
		}
		System.out.println(str);



	}




}