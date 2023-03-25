import java.util.Scanner;
class M1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		String str=null;
		int a=sc.nextInt();
		
		switch(a)
		{
			case 1:
			       str="H";
				   break;
				   
		    case 2:
			       str="M";
				  // break;
				   
				  // default:
				  // str="k";
			
			
		}
		System.out.println(str);
		
	}
	
	
}