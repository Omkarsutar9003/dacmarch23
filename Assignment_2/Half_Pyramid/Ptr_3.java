class Ptr_3
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{   
		      if(i==2&&(j==5||j==4||j==3)||i==3&&(j==5||j==4)||i==4&&(j==5))
				 { System.out.print("  ");
				    continue;
				 }
				System.out.print("* ");
				
			}
			System.out.println();
			
			
			
			
		}
		
	}
	
	
	
	
}