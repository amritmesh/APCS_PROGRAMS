public class PokerHand 
{
	Card[] hand = new Card[5];
	
	public PokerHand()
	{
		hand[0] = new Card(2, 10);
		hand[1] = new Card(2, 11);
		hand[2] = new Card(2, 12);
		hand[3] = new Card(2, 13);
		hand[4] = new Card(2, 14);
	}
	
	public PokerHand(Deck myDeck)
	{
		hand[0] = myDeck.deal();
		hand[1] = myDeck.deal();
		hand[2] = myDeck.deal();
		hand[3] = myDeck.deal();
		hand[4] = myDeck.deal();
	}
	
	public Card[] getHand()
	{
		return hand;
	}
	
	public int suitCount(int suit)
	{
		int count = 0; for (Card i : hand)
		{
			if (i.suit() == suit)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public boolean straight()
	{
		int count = 0;
		
		if (hand[4].value() == 14 && hand[0].value() == 2 && hand[1].value() == 3 && hand[2].value() == 4)
		{
			return true;
		}
		
		for (int i = 0; i < tally().length - 1; i++) 
		{
			if (tally()[i + 1] != 0)
			{
				count++;
			}
			else
			{
				count = 0;
			}
		}
		
		if (count == 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean flush()
	{
		for (int i = 0; i < 4; i++) 
		{
			if (hand[i + 1].suit() != hand[i].suit())
			{
				return false;
			}
		}
		
		return true;
	}
	
	public boolean straightFlush()
	{
		return straight() & flush();
	}
	
	public boolean royalFlush()
	{
		if (!(flush() == true && tally()[10] == 1 && tally()[11] == 1 && tally()[12] == 1 && tally()[13] == 1 && tally()[14] == 1))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean onePair()
	{
		int numPairs = 0;
		
		for (int i = 0; i < tally().length; i++) 
		{
			if (tally()[i] == 2)
			{
				numPairs++;
			}
		}
		
		if (numPairs == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean twoPairs()
	{
		int numPairs = 0;
		
		for (int i = 0; i < tally().length; i++) 
		{
			if (tally()[i] == 2)
			{
				numPairs++;
			}
		}
		
		if (numPairs == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean threeOfAKind()
	{
		for (int i = 0; i < tally().length; i++) 
		{
			if (!(tally()[i] == 3))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean fullHouse()
	{
		if (!(threeOfAKind() == true && onePair() == true))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean fourOfAKind()
	{
		for (int i = 0; i < tally().length; i++) 
		{
			if (!(tally()[i] == 4))
			{
				return false;
			}
		}
		
		return true;
	}
	public boolean pairOfJacksOrBetter()
	{
		int card = 0;
		int pairs = 0;
		
		int[] counts = tally();
		for (int x = 0; x < counts.length; x++)
		{
			if (counts[x] == 2)
			{
				card = x;
				pairs++;
			}
		}
		
		return (pairs == 1 && card > 10);
	}
	
	public int[] tally() 
	{
		int[] counts = new int[15];

		for (Card x : hand)
		{
			counts[x.value()]++;
		}
		
		return counts;
	}
	
	public void display()
	{
		for (Card x : hand) 
		{
			System.out.print(x + "    ");
		}
	}
	
	public static void main(String[] args)
	{
		PokerHand x = new PokerHand();
		x.hand[0] = new Card(2, 10);
		x.hand[1] = new Card(2, 11);
		x.hand[2] = new Card(2, 12);
		x.hand[3] = new Card(2, 13);
		x.hand[4] = new Card(2, 14);
		x.display();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Straight? " + x.straight());
		System.out.println("Flush? " + x.flush());
		System.out.println("Straight Flush? " + x.straightFlush());
		System.out.println("Royal Flush? " + x.royalFlush());
		System.out.println();
		
		System.out.println("One Pair? " + x.onePair());
		System.out.println("Two Pairs? " + x.twoPairs());
		System.out.println("Three of a Kind? " + x.threeOfAKind());
		System.out.println("Full House? " + x.fullHouse());
		System.out.println("Four of a Kind? " + x.fourOfAKind());
		System.out.println();

		int temp[] = x.tally();
		for (int i = 0; i < temp.length; i++)
		{
			System.out.println(i + " " + temp[i]);
		}
	}
}
