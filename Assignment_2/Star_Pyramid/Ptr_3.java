class Ptr_3
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=6;k>=i;k--)
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++)
			{    
		      if(i==3&&j==2||i==4&&(j==2||j==3)||i==5&&(j==2||j==3||j==4))
			    {
				System.out.print("    ");
			    continue;
				}
				System.out.print("*   ");
				
			}
			
			System.out.println();
			
		}
		
				
		
		
	}
	
	
	
	
	
}

