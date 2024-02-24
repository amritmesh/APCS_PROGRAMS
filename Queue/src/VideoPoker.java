import java.util.ArrayList;
import java.util.Scanner;

public class VideoPoker 
{
	static int bank;
	static int bet;
	Deck deck;
	PokerHand myHand;
	Scanner scanner = new Scanner(System.in);
	
	public VideoPoker(int myBankRoll)
	{
		bank = myBankRoll;
		deck = new Deck();
		deck.shuffle();
		myHand = new PokerHand(deck);
	}
	
	public int getBank()
	{
		return bank;
	}
	
	public int getBet()
	{
		return bet;
	}
	
	public static void winOrLose(PokerHand z, int bet)
	{
		if (z.royalFlush() == true) 
		{
			System.out.println("Royal flush ---- You won $" + bet * 250);
			bank += bet * 250;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.straightFlush() == true) 
		{
			System.out.println("Straight flush --- You won $" + bet * 50);
			bank += bet * 50;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.fourOfAKind() == true) 
		{
			System.out.println("Four of a kind --- You won $" + bet * 25);
			bank += bet * 25;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.fullHouse() == true) 
		{
			System.out.println("Full house --- You won $" + bet * 6);
			bank += bet * 6;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.flush() == true) 
		{
			System.out.println("Flush --- You won $" + bet * 5);
			bank += bet * 5;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.straight() == true) 
		{
			System.out.println("Straight --- You won $" + bet * 4);
			bank += bet * 4;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.threeOfAKind() == true) 
		{
			System.out.println("Three of a kind --- You won $" + bet * 3);
			bank += bet * 3;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.twoPairs() == true) 
		{
			System.out.println("Two pair --- You won $" + bet * 2);
			bank += bet * 2;
			System.out.println("Total: $" + bank);
		} 
		
		else if (z.pairOfJacksOrBetter() == true) 
		{
			System.out.println("Pair of jacks or better --- You won $" + bet * 1);
			bank += bet * 1;
			System.out.println("Total: $" + bank);
		} 
		
		else 
		{
			System.out.println("You lost $" + bet + ".");
			// bank = bank - bet;
			System.out.println("Total: $" + bank + ".");
		}
	}
	
	public void newHand()
	{
		for (int i = 0; i < 5; i++)
		{
			myHand.getHand()[i] = deck.deal(); 
		}
	}
	
	public void play(String yesOrNo)
	{ 
		while (yesOrNo.equals("YES")) 
		{
			System.out.println("How much do you want to bet?");
			bet = scanner.nextInt();
			
			while (bet > bank) 
			{
				System.out.println("You do not have enough money to place a bet. Please place a bet amount lower than your total funds.");
				System.out.println("How much do you want to bet? ");
				bet = scanner.nextInt();
			}
			
			bank -= bet;

			Deck x = new Deck();
			x.shuffle();
			x.cut();
			x.bridgeShuffle();
			
			PokerHand z = new PokerHand(x);
			System.out.println();
			z.display();

			System.out.println();
			System.out.println("Which cards do you want to replace? (EX. 014, 5 if you would NOT like to replace any): ");
			String response = scanner.next();
			
			boolean replaceNone = false;
			
			for (int i = 0; i < response.length(); i++) 
			{
				if (response.charAt(i) == '5') 
				{
					replaceNone = true;
				}
			}
			
			if (replaceNone == false) 
			{
				char[] responseArray = new char[response.length()];
				
				for (int i = 0; i < response.length(); i++) 
				{
					responseArray[i] = response.charAt(i);
				}
				
				ArrayList<Integer> result = new ArrayList<Integer>();
				
				for (int i = 0; i < responseArray.length; i++) 
				{
					result.add(i, Character.getNumericValue(responseArray[i]));
				}
				
				for (int i = 0; i < result.size(); i++) 
				{
					z.hand[result.get(i)] = x.deal();
				}
			}
			
			System.out.println("Your Last Hand:");
			z.display();
		
			winOrLose(z, bet);
			
			//play again
			System.out.println("Do you want to play again? (YES/NO):");
			String answer = scanner.next();
			if (answer.equals("YES") && bet <= 0) 
			{
				System.out.println("You do not have enough money to play again.");
				yesOrNo = "NO";
				bet = 0;

			}
					
			else if (answer.contentEquals("NO"))
			{
				break;
			}
		}
		
		System.out.println("Have a great day!");
	}

	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("How much $$ to you want to deposit? ");
		bank = scanner.nextInt();
		
		VideoPoker playGame = new VideoPoker(bank);
		System.out.println("Welcome to Amrit's Video Poker!");

		String cont = "YES";
			
		playGame.play(cont);
	}
}
