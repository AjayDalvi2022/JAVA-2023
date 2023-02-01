



package ineuron2;

import java.util.Scanner;


public class Asgno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		players ump = new players();
		ump.guess1();

	}

}



class guesser
{
	String name;
	int numG;
	String k="Guesser enter the number between 1 to 10";
	
	
	int guess()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(k);
		
		numG=scan.nextInt();
		if(numG>0 && numG<11)
		return numG;
		else
		{  while(numG<=0 || numG>10)
		   {
			System.out.println(k.replaceAll("Guesser","Please!!!").toUpperCase());
			numG=scan.nextInt();
		    }
		 return numG;
		}
		
		
	}

}

class players
{
	String name;
	int numP,numP1,numP2,numP3,colG;
	
	void guess1()
	{
		guesser g= new guesser();
		 colG=g.guess();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("Minimum 1 and Maximum 3 players are allowed ");		
		System.out.println("Enter the number of players ");
		numP=scan.nextInt();
		
		if (numP>3)
		{	System.out.print("NUMBER OF PLAYERS EXCEED THE LIMIT.SO,GAME CAN'T BE PLAYED");}
		
		else if(numP==3)
		{
		System.out.println("Player1 Guess the number between 1 to 10");
		 numP1=scan.nextInt();
		 while(numP1<=0 || numP1>10)
		   {
			System.out.println("Please!!! player1 guess the number between 1 to 10");
			numP1=scan.nextInt();
		    }
		 
		System.out.println("Player2 Guess the number between 1 to 10");
		 numP2=scan.nextInt();
		 
		 while(numP2<=0 || numP2>10)
		   {
			System.out.println("Please!!! player2 guess the number between 1 to 10");
			numP2=scan.nextInt();
		    }
		 
		System.out.println("Player3 Guess the number between 1 to 10");
		 numP3=scan.nextInt();
		 
		 while(numP3<=0 || numP3>10)
		   {
			System.out.println("Please!!! player3 guess the number between 1 to 10");
			numP3=scan.nextInt();
		    }
		}
		
		else if(numP==2)
		{
			System.out.println("Player1 Guess the number between 1 to 10");
			 numP1=scan.nextInt();
			 while(numP1<=0 || numP1>10)
			   {
				System.out.println("Please!!! player1 guess the number between 1 to 10");
				numP1=scan.nextInt();
			    }
			 
			System.out.println("Player2 Guess the number between 1 to 10");
			 numP2=scan.nextInt();
			 
			 while(numP2<=0 || numP2>10)
			   {
				System.out.println("Please!!! player2 guess the number between 1 to 10");
				numP2=scan.nextInt();
			    }
			 
		
		}	
		
		else if(numP==1)
		{
			System.out.println("Player Guess the number between 1 to 10");
			 numP3=scan.nextInt();
			 
			 while(numP3<=0 || numP3>10)
			   {
				System.out.println("Please!!! Guess the number between 1 to 10");
				numP3=scan.nextInt();
			    }
			 
		}
		
		else
		{
			System.out.println("WE CAN'T PLAY THE GAME WITHOUT PLAYERS.SO GAME IS TERMINATED ");
			  }
		
		
		if (numP==3)
		{
		 
		 
		 if (colG==numP1 && numP1==numP2 && numP1==numP3)
				System.out.print("Game Tied");
				
				else if(colG==numP1 && numP1==numP2)
				System.out.print("Player 1 and 2 are winner");
				
				else if(colG==numP1 && numP1==numP3)
					System.out.print("Player 1 and 3 are winner");
				
				else if(colG==numP2 && numP2==numP3)
					System.out.print("Player 2 and 3 are winner");
				
				else if(colG==numP1)
					System.out.print("Player 1 is the winner");
				
				else if(colG==numP2)
					System.out.print("Player 2 is the winner");
				
				else if(colG==numP3)
					System.out.print("Player 3 is the winner");
				else
					System.out.println("All players lost");
		}
		
		
		if(numP==2)
		{if(colG==numP2 && numP2==numP1)
			System.out.print("Game Tied");
		
		else if(colG==numP1)
			System.out.print("Player 1 is the winner");
		
		else if(colG==numP2)
			System.out.print("Player 2 is the winner");
		else
			System.out.println("Both players lost the game");
			
		}
		
		
		if(numP==1)
		{ if(colG==numP3)
					System.out.print("PLAYER HAS WON!!! ");
				else
					System.out.println("Player lost the game");
		
	    }	
		
	
		
}

}	


