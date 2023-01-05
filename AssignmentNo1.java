package in.ineuoron.main;

public class AssignmentNo1 {
           // Assignment 1 question 1
	
	public static void main(String[] args) {
	   
		int k=5;
		int n=10;
		
	    for(int i=0;i<=n;i++)
	    {
		    for(int j=0;j<=n;j++)
		{
			if ( (i==0)|| i==n || j==(n/2) )
			{
				
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
		}
		    System.out.print("  ");
		    for(int j=0;j<=n;j++)
			{
				if ( j==0  || j==n || i==j)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
		    System.out.print("  ");
		    for(int j=0;j<=n;j++)
			{
				if ( i==0 || j==0  || i==n || i==(n/2))
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}	    
		    
		    System.out.print("  ");
		    for(int j=0;j<=n;j++)
			{
				if ( j==0 || j==n  || i==n )
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}	
		    
		    
		    System.out.print("  ");
		    
		    for(int j=0;j<=n;j++)
			{ 
				if ( j==0 || (j==n && i<=(n/2))  || i==0 || i==(n/2) || (i>=(n/2) && i+j==k))
						
						
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
			
			     }
				
			}
		    
		    if(i>=(n/2))
				k=k+3;
		    
		    System.out.print("  ");
		    for(int j=0;j<=n;j++)
			{
				if ( i==0 || i==n || j==0 || j==n )
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}	
		    
		    System.out.print("  ");
		    for(int j=0;j<=n;j++)
			{
				if ( j==0  || j==n || i==j)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
		    System.out.print("  ");
		    System.out.println();		 
		   
		     }
	    
	    System.out.println();
	    
	    //	ANSWER NUMBER 2
	    
	    int m=4;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	    
		System.out.println();
	    System.out.println();
		
	    //ANSWER NUMBER 3
		
		int p=13;
		for(int i=0; i<=p; i++)
		{
			for(int j=0; j<=p; j++)
			{
				if( i==0  || j==0  || i+j<=(p/2) || i==p
					 || (j==p) || j-i>=(p/2))	
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
		System.out.println();
	      //ANWER NUMBER 4
		
		int q=13 ;
		for(int i=0;i<=q;i++)
		{
			for(int j=0;j<=q;j++)
			{
				if( ( i>=(q/2) && j==0) || i>=q-1 || ( i>=(q/2) && j==q) || i+j>=(3*q/2) || i-j>=(q/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println();
		
		System.out.println();
		
		
		// ANWER NUMBER 5
	 
		int r=13 ;
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=r;j++)
			{
				if( i==0 || i==r || j==0 || i+j<=(r/2) || i-j>=(r/2) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
	}

}



