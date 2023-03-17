class Pattern_6
{
   public static void main(String args[])
   { 
      
        int i,j;
		int n=5;
		for (i=0 ;i<n;i++)
		{
			for ( j =2*(n -i); j >=0;j--)
			{
				System.out.print(" ");
			}
			for( j = 0 ; j <= i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
   
   /*
       int sp;
         for(int i=1;i<=5;i++)
		 {
             for(sp=5;sp>=i;sp--)
			 {
				 System.out.print(" ");
				 
			 }
			 
			 for(int j=1;j<=i;j++)
			 {
				// System.out.print(" ");  
				 System.out.print(j+" ");
				
			 }
             System.out.println();

		 }			 
		 
   
   
   }
   */
   
   
 }
}

/*

1 2 3 4 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

class Pattern9 
{
	public static void main(String args [])
	{
		int i,j;
		int n=5;
		for (i=0 ;i<n;i++)
		{
			for ( j =2*(n -i); j >=0;j--)
			{
				System.out.print(" ");
			}
			for( j = 0 ; j <= i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/