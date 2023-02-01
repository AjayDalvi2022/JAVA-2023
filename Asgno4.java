package ineuron2;

import java.util.Arrays;

public class Asgno4 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
 // Q1:WAP to remove Duplicates from a String.(Take any String x with duplicates
		 System.out.print("Q1:");
 		 
		 String x= "SghisurGhNtnow";                               // ineuronineurok.ai
		 
		 char [] chh=x.toCharArray();       char[] tmp=new char[x.length()];   
		 
		 int v=0;
		 for(char c:chh) {tmp[v]=c;v++;}                 // creating a copy to match the exact case for the output
		
		 
         char ckk='@';char kk11='`';  
          

           for(int j=0;j<x.length();j++)                      // First convert string to lower case
            { ckk='@'; 
               for(int i=65;i<91;i++)
             {
                if(chh[j]==++ckk) 
                { chh[j]=(ckk+=32);break;}
              }        		        	   
            }
			 	                                                                 // logic for replacing duplicate character
		 		 	 
		 System.out.println();
		 System.out.println("Before removing duplicate:"+" "+x);
		
		
			 for(int i=0;i<chh.length;i++)
					
				{ 
				 for(int k=i+1;k<chh.length;k++)
						
					{    			       
						  if(chh[i]==chh[k])
						  {  chh[k]=' ' ;}
				       					
					}
				}
			 
			 
			 for(int i=0;i<chh.length;i++)
					
				{      if(chh[i]!=' ')			       
					     { if(chh[i]!=tmp[i])
						   {  chh[i]=tmp[i] ;}
					     }								
				}
			 
			 
						
				 System.out.print("After removing duplicate:" + " " );
				 System.out.print(chh);
			     System.out.println();
			     System.out.println();
			     
		
		
		
			
  // Q2:WAP to print Duplicates characters from the String.	
		
	
			     System.out.println("Q2:");
		String ex= "ineuronineurok";
		String d= "";                                     // Answer String
		int u;boolean trp = false;
		
		
		for(int i=0;i<ex.length();i++)
			
		{	u=0;                         
			for(int k=0;k<d.length();k++)                  // Loop for checking if character is stored in Answer String
				
			{	if(d.charAt(k)==ex.charAt(i))
			     {u=1;break;}
			}
		    
			if(u==0)                                           // Loop for storing in Answer String after checking with help of 'u' variable
			{	for(int j=i+1;j<ex.length();j++)
				
		         if(ex.charAt(i)==ex.charAt(j) )
		         { 	d =d + ex.charAt(j);trp = true;break;}		         	
			}
		}	
		 System.out.println("String:" +" "+ex);
		 if(trp==true)
		 System.out.println("Duplicate characters are:" +" "+d);	
		 else 
	      System.out.println("No Duplicate character found");
		 System.out.println();
		 
		 
		 
		 
  // Q3: WAP to check if “2552” is palindrome or not.
     
		 System.out.println("Q3:");
         String yy="2552";int y1=0;		           
         System.out.print(yy);
     	           
       p:  for(int j=0;j<yy.length();j++)                          // Traversing from both sides for checking exact match
  	    {	
  	       for(int i=(yy.length()-(j+1));i>0;)
  	      { 
  	    	  if(i==j) break p;
  	    	   if(yy.charAt(j)!=yy.charAt(i))
  	    	   {  System.out.println("<---String is not a Palindrome");y1=1;break p;  }
  	    	   else
  	    	   {   break;          }
  	    	   
  	      }
  	    }
         if(y1==0) System.out.println("<---String is a Palindrome");
         
         System.out.println();
		 
		 
		 
         

         
    // Q4:WAP to count the number of consonants, vowels, special characters in a String.
         
         System.out.println("Q4:");
         String tof="a%cde*irtz!";
         
         char [] vo= {'a','e','i','o','u'}; int vow,con,sp; vow=con=sp=0; boolean trf=true;
         
          char[] cd1=new char[26];  char cc1='`';                    
         
         for(int i=0;i<26;i++)                              // []cd Storing a-z alphabets 
         { cd1[i]=(++cc1); }
         
        // System.out.println(cd1);
         
         for(int j=0;j<tof.length();j++)
         { trf=true;
      	   for(int i=0;i<vo.length;i++)
   	      {    	  
      		   if(tof.charAt(j)==vo[i])
   	    	   {  ++vow;trf=false;break;  }		    	    		 	    	  
   	      }
      	   
         if(trf==true)
           {    for(int i=0;i<cd1.length;i++)
    	        {    	  
       		   if(tof.charAt(j)==cd1[i])
    	    	   {  ++con;trf=false;break;  }		    	    		 	    	  
    	        }
            } 
          
         if(trf==true)
         ++sp;   
      	   
         }
        
         System.out.println("String:"+tof);
         System.out.println("Vowels:"+vow);
         System.out.println("Consonants:"+con);
         System.out.println("Special Characters:"+sp);
       
         
         
         
         
         
         System.out.println();	 
		 
  // Q5:WAP to implement Anagram Checking least inbuilt methods being used.
         
         System.out.println("Q5:");
         String sd="";
         String s1="race";
         String s2="care"; int ijk=0; sd=s1;
         System.out.println("s1:"+" "+s1);System.out.println("s2:"+" "+s2);
         
         if(s1.length() != s2.length())
         { System.out.println("Since length of characters are not the same the String can't be an Anagram.");ijk=1;}
         
      if(ijk==0)   
 {    for(int j=0;j<2;j++)
   {	    
 	    boolean p1=true;
			l1: for(int i=0;i<sd.length();i++)
					                                          // Loop for checking if both strings are unique or not
				{	
					for(int k=i+1;k<sd.length();k++)
						
					{	if(sd.charAt(i)==sd.charAt(k))
					     {p1=false;break l1;}
					}
				}
		
		  if(p1==true) 
		  {  sd=s2;}
		  else if(sd==s1)
		  {System.out.println("String S1 is NOT unique.String can't be an Anagram.");ijk=1;break;}
		  else
		  { System.out.println("String S2 is NOT unique.String can't be an Anagram.");ijk=1;break;}
    }
  }  
         

        if(ijk==0)
      {   boolean sk=false;
         	for(int j=0;j<s1.length();j++)          
 	    {	sk=false;
 	       for(int i=0;i<s2.length();i++)
 	      { 
 		      if(s1.charAt(j)==s2.charAt(i))
 		      { sk=true;break;}
 		     
 	      }
 	      if(sk==false)		    	    	  
 	      { System.out.println("Strings s1 & s2 are NOT ANAGRAM");break;}
 	    }
           if(sk==true)	 System.out.println("Strings s1 & s2 are Anagram of each other");
      }
        System.out.println();
        
		 
        
        
// Q6:WAP to implement Pangram Checking with least inbuilt methods being used.
        
        System.out.println("Q6:");
        String ff="Mr. Jock, TV quiz Ph. D., bags few lynx."; int kk=0;
  		           
                                                                          // First convert string to lower case
       char ck='@';char kk1='`'; boolean jf=true; boolean jfk=true;  char [] ch=ff.toCharArray();
       
       for(int j=0;j<ff.length();j++)          
       { ck='@'; 
    	   for(int i=65;i<91;i++)
    	   {
    		   if(ch[j]==++ck) 
    		   { ch[j]=(ck+=32);break;}
           }        		        	   
	    }
       
         char [] dum= new char[ch.length]; int ip=-1;                     // Removing special characters
       
         for(char er:ch)
         {    kk1='`';
              n:  for(int ik=65;ik<91;ik++)
	                 { 
                       if(er==++kk1) 
                         {  	                      
	                        dum[++ip]=er;
	                        break n;  
                          }
                         
	                   }                
	        } 
              
  	  System.out.print(dum);
 		           		           
       System.out.print(" ");
       
       	           
       char cc='`'; char[] cd=new char[26];                      
       
       for(int i=0;i<26;i++)                              // []cd Storing a-z alphabets 
       { cd[i]=(++cc); }
       
											
       
    for(int j=0;j<dum.length;j++)          
	    {	kk=0;
	       for(int i=0;i<cd.length;i++)
	      { 
	    	  
	    	   if(dum[j]==cd[i])
	    	   {  cd[i]='!';jfk=false;break;  }		    	    		
	    	  
	      }
	      if(jfk==true)break;
	    } 
       
       for(char er:cd)
       {  
    	   if(er!='!')
          { System.out.println("<--- String is not a Pangram" );jf=false;break;}
       }
       
       if(jf==true)
       System.out.println("<--- String is a Pangram"); 
       System.out.println();
		 
	
         
      		     
  // Q7:WAP to find if String contains all unique characters.
				 
       System.out.println("Q7:");
			String rr="abcdefghijklmnoprstuvwxyzz";
			System.out.println("String :" +" "+rr);
			boolean p=true;
					 
				l1: for(int i=0;i<rr.length();i++)
						
					{	
						for(int k=i+1;k<rr.length();k++)
							
						{	if(rr.charAt(i)==rr.charAt(k))
						     {p=false;break l1;}
						}
					}
			
			  if(p==true) 
				  System.out.println("All the characters in the string are unique");
			  else System.out.println("All the characters in the string are NOT unique");
			  System.out.println();
			
			  
			 
  // Q8: WAP to find the maximum occurring character in a String.
			  
			  System.out.println("Q8:");
			  String giv ="ineuroineuroke";
			  
				                              //   first to find Duplicate characters
		
				String dd= "";                                      // Answer String
				int u1;boolean trp1 = false;int op=0;
				
				
				for(int i=0;i<giv.length();i++)
					
				{	u1=0;                         
					for(int k=0;k<dd.length();k++)            // Loop for checking if character is stored1 in Answer String
						
					{	if(dd.charAt(k)==giv.charAt(i))
					     {u1=1;break;}
					}
				    
					if(u1==0)                                // Loop for storing in Answer String after checking with help of 'u1' variable
					{	for(int j=i+1;j<giv.length();j++)
						
				         if(giv.charAt(i)==giv.charAt(j) )
				         { 	dd =dd + giv.charAt(j);trp1 = true;break;}		         	
					}
				}	
				 System.out.println("String:" +" "+giv);
				 if(trp1==true)
				 System.out.println("Du1plicate characters are:" +" "+dd);	
				 else
			     {System.out.println("No Duplicate character was found.So each character's maximum occurrence is 1"); op=1;}
			  
			  		  
			  
		
		       
		       int [] count= new int[dd.length()];                      // int count[] to store number of count of each duplicate character
		       
		       for(int i=0;i<dd.length();i++)
					
				{	
					for(int k=0;k<giv.length();k++)
					{
						if(dd.charAt(i)==giv.charAt(k))
					     { count[i]= ++count[i];   }
					}	
				}

		       
		       int [] id=new int[count.length]; int ii=0;
		            for(int ele:count)
		    	    {
		    	    	   id[ii]=ele;ii++;
		    	    }	  
		            
		            
		          
		            for(int j=0;j<=count.length-2;j++)                              // Sorting the count[]
		    	    {	
		    	   for(int i=0;i<=count.length-2;i++)
		    	      {
		    	    	if(count[i]>count[i+1])
		    	    	{
		    	    		int temp =count[i+1];
		    	    		count[i+1]=count[i];
		    	    		count[i]=temp;
		    	    		
		    	    	}
		    	      }
		    	    }	
		    	    
		            
		        if(op==0)    
	    {         if(count[count.length-1]>count[count.length-2])                // only if 1 is maximum ocuuring
		            	
		            { for(int i=0;i<id.length;i++)  
		            	if(count[count.length-1]==id[i])
		            		{System.out.println("Maximum ocurring character is:"+" "+dd.charAt(i));break;}
		            	
		            }
		            else
		            {      System.out.print("Maximum ocurring characters are:"+"  ")  ;                                                     
		            	for(ii=0;ii<id.length;ii++)
		 	
		            	{  if(count[count.length-1]==id[ii])
		            		System.out.print(dd.charAt(ii) );
		            		
		            	}
		    	      
		    	    }
	     }       
		            System.out.println();

		            
		            
		            
	
	    }
}
