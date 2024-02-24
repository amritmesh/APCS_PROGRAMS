import java.util.Iterator;
import java.util.Stack;

public class CDStack 
{
	Stack<String> myStack;
	
	public CDStack()
	{
		myStack = new Stack<String>();
		
		myStack.push("Rumours");
		myStack.push("Joshua Tree");
		myStack.push("Abbey Road");
		myStack.push("Muse Greatest Hits");
		myStack.push("Born to Run");
		myStack.push("Revolver");
		myStack.push("Peter Frampton Comes Alive");	
	}
	
	public String nextCD()
	{
		return myStack.peek();
	}
	
	public String playNewCD()
	{
		return myStack.pop();
	}
	
	public void playAllCDs()
	{
		while (!(myStack.empty()))
		{
			System.out.print(myStack.pop() + " ");
		}
	}
	
	public void printCDs2()
	{
		Iterator<String> i = myStack.iterator();
		
		while (i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
	}
	
	public void printCDs3()
	{		
		for (String x : myStack)
		{
			System.out.print(x + " ");
		}
	}
	
	public void printCDs4()
	{
		System.out.print(myStack);
	}
	
	public void printCDsRecursive()
	{
		System.out.print(myStack.pop() + " ");
		if (!(myStack.isEmpty()))
		{
			printCDsRecursive();
		}
	}
	
	public void add(String a)
	{
		myStack.push(a);
	}
	
	public int find(String name)
	{
		return myStack.search(name);
	}
	
	public static String convertToBinary(int num)
	{
		Stack<Integer> x = new Stack<Integer>();
		String y = "";
		
		while(num != 0)
		{
			x.push(num % 2);
			num /= 2;
		}
		
		while(!(x.isEmpty()))
		{
			y += x.pop();
		}
		
		return y;
	}
	
	public String toString()
	{
		return myStack.toString();
	}
	
	public static void main(String[] args)
	{
		CDStack ar = new CDStack();
		
		ar.printCDs4();
		ar.add("Baby Shark");
		System.out.println();
		ar.printCDs4();
		System.out.println();
		System.out.println(ar.find("Baby Shark"));
		System.out.println(ar.find("Rumours"));
		System.out.println(ar.find("Unorthodox Jukebox"));
		System.out.print(ar.convertToBinary(124));
		
	}
}

