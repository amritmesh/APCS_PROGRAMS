import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Deck
{
	Queue<Card> deck;
	
	public Deck()
	{
		deck = new LinkedList<Card>();
		loadDeck();
	}
	
	public void loadDeck()
	{
		for (int suit = 1; suit <= 4; suit++)
		{
			for (int rank = 2; rank <= 14; rank++)
			{
				deck.offer(new Card(suit, rank));
			}
		}
	}
	
	public void shuffle()
	{
		Queue<Card> temp = new LinkedList<Card>();
		Random rnd = new Random();
		int pos = 0;
		
		while (!deck.isEmpty())
		{
			pos = rnd.nextInt(deck.size());
			
			for (int i = 1; i < pos; i++)
			{
				deck.offer(deck.poll());
			}
			
			temp.offer(deck.poll());
		}
		
		deck = temp;
	}
	
	public void bridgeShuffle()
	{
		Queue<Card> a = new LinkedList<Card>();
		Queue<Card> b = new LinkedList<Card>();

		Queue<Card> temp = new LinkedList<Card>();
		int i = 0;

		for (Card x : deck) 
		{
			if (i < (deck.size() / 2))
			{
				a.add(x);
			}
			else
			{
				b.add(x);
			}
			
			i++;
		}
		
	    for (int j = a.size(); j > 0; j--)
	    {
	    	temp.add(a.poll());
	    	temp.add(b.poll());
	    }
	    
	    deck = temp;
	}
	
	public void cut()
	{
		Random rnd = new Random();
		
		int cutPos = rnd.nextInt(deck.size());	
		
		for (int i = 1; i < cutPos; i++)
		{			
			deck.offer(deck.poll());
		}
	}
	
	public Card deal() 
	{
		if (!deck.isEmpty())
		{
			return deck.poll();
		}
		
		loadDeck();
		
		return deck.poll();
	}
	
	public String toString()
	{
		String result = "";
		
		for (Card x : deck)
		{
			result += x + " ";
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Deck a = new Deck();
		
		System.out.println(a);
		a.bridgeShuffle();
		a.cut();
//		a.shuffle();
		System.out.println(a);
	}
}
