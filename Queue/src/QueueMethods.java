import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueMethods 
{
	public static Queue<String> clone(Queue<String> one)
	{
		Queue<String> temp = new LinkedList<String>();
		int size = one.size();
		
		while(size > 0)
		{
			String current = one.poll();
			one.offer(current);
			temp.offer(current);
			size--;
		}
		
		return temp;
	}
	
	public static Queue<String> reverse(Queue<String> x) 
	{
		Queue<String> xTemp = clone(x);
		ArrayList<String> temp = new ArrayList<String>();

		while (!(xTemp.isEmpty()))
		{
			temp.add(xTemp.poll());
		}
		while (!(temp.isEmpty()))
		{
			xTemp.offer(temp.remove(temp.size() - 1));
		}
		
		return xTemp;
	}
	
	public static Queue<String> reverse2(Queue<String> x) 
	{
		ArrayList<String> temp = new ArrayList<String>();

		while (!(x.isEmpty()))
		{
			temp.add(x.poll());
		}
		while (!(temp.isEmpty()))
		{
			x.offer(temp.remove(temp.size() - 1));
		}
		
		return x;
	}
		
	public static Queue<String> alternate(Queue<String> one, Queue<String> two) 
	{
		Queue<String> temp = new LinkedList<String>();
		Queue<String> oneTemp = clone(one);
		Queue<String> twoTemp = clone(two);

		while(!(oneTemp.isEmpty()) || (!twoTemp.isEmpty()))
		{
			if (!oneTemp.isEmpty())
			{
				temp.offer(oneTemp.poll());
			}
			if (!twoTemp.isEmpty())
			{
				temp.offer(twoTemp.poll());
			}	
		}
		
		return temp;
	}
	
	public static Queue<String> append(Queue<String> x, Queue<String> y) 
	{
		Queue<String> xTemp = clone(x);
		Queue<String> yTemp = clone(y);

		while(!yTemp.isEmpty()) 
		{
			xTemp.offer(yTemp.poll());
		}
		
		return xTemp;
	}

	public static boolean isPalindrome(Queue<String> x)
	{
		Queue<String> temp = x;
		
		return temp.equals(reverse(x));
	}   
	
	// return a string of the first n binary numbers.... 1 10 11 100 101 110 111 1000�
	public static String generateBinary(int n) 
	{
		String output = "";
		Queue<String> temp = new LinkedList<String>();
		
		temp.offer("1");
		
		for (int i = 1; i <= n; i++)
		{
			temp.offer(temp.peek() + "0");
			temp.offer(temp.peek() + "1");
			output += temp.poll() + " ";
		}
		
		return output;
	}
	
//	B. TapOut
	
//	In the game of 1Tap, 2Tap, 3Tap, OUT, Children stand in a circle. The teacher
//	starts at position 1 and walks around the circle and counts to 4 and taps the
//	students. The 4th student has to leave the circle. (�1Tap, 2Tap, 3Tap, OUT�) .
//	This continues until there is only 1 student left who is declared the winner.
//	Ava always won. She wrote a method that determines where she should stand for
//	every size game.

	// This method find the winning position of 1Tap, 2Tap, 3Tap,
	// OUT based on a game of count //students. The winning position will be in the
	// range of 1 to count where count is the number of //players.
	public static int getTapPosition(int count)
	{
		Queue<Integer> temp = new LinkedList<Integer>();
		
		for (int i = 1; i <= count; i++)
		{
			temp.add(i);
		}
		while (temp.size() > 1)
		{
			for (int i = 1; i <= 3; i++)
			{
				temp.offer(temp.poll());
			}
			
			temp.poll();
		}
		
		return temp.poll();
	}

	// Use alphanumeric values of Objects in Queue to check
//	public static boolean isAlphabetical(Queue <String> x)
//	{
//		
//	}                                             

//	public static double getAverage(Queue <Integer> x)
//	{
//		
//	}

	public static void main(String[] args) 
	{
		Queue<String> one = new LinkedList<String>();
	    one.offer("A");
		one.offer("B");
		one.offer("C");
		one.offer("D");
		one.offer("E");
		one.offer("Z");
//		System.out.println(isAlphabetical(one));
		
		Queue<String> two = new LinkedList<String>();
	    two.offer("1");
		two.offer("2");
		two.offer("2");
		two.offer("1");
		System.out.println(one);
		System.out.println(isPalindrome(one));
		System.out.println(isPalindrome(two));
		System.out.println(append(one,two));
		System.out.println(alternate(one,two));
		System.out.println(reverse(one));
//		System.out.println(isPalindrome2(one));
		System.out.println(reverse(one));
		System.out.println(one);
		
		System.out.println(generateBinary(10));
		System.out.println(getTapPosition(5));
	}
}
