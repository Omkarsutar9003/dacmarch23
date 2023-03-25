import java.util.*;
class odd_Series
{
	public static void main(String args[])
	{ 
	
	  Scanner sc=new Scanner(System.in); 
	   System.out.println("Ente num");
	   int temp=sc.nextInt();
		int i=1;
		
		for( ;i<temp;)
		{
			
			System.out.println(i);
			i=i+2;
		}
		
	}
}

/*import java.util.*;
class Q20OddSeries 
{
	public static void main (String args [] )
	{
		System.out.println("Enter a range of series.");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for(int i = 1; i < num ; i++)
		{
			if (i% 2== 1 )
			{
				System.out.print(i+" ");
			}
		}
	}
}*/