package mylinkedlist;

public class LinkedList<E> implements MyList<E>
{
	private ListNode firstNode;
	
	public LinkedList()
	{
		firstNode = null;
	}
	
	public boolean add(Object o)
	{
		addLast(o);
		return true;
	}
	
	public void addLast(Object o)
	{
		if (isEmpty())
		{
			firstNode = new ListNode(o, null);
		}
		else
		{
			ListNode current = firstNode;
			
			while (current.getNext() != null)
			{
				current = current.getNext();
			}
			
			current.setNext(new ListNode(o, null));
		}
	}
	
	public void addFirst(Object o)
	{
		if (isEmpty())
		{
			firstNode = new ListNode(o, null);
		}
		else
		{
			firstNode = new ListNode(o, firstNode);
		}
	}
	
	public void clear()
	{
		firstNode = null;
	}
	
	public Object getFirst()
	{
		if (isEmpty())
		{
			System.exit(1);
		}
		
		return firstNode.getValue();
	}
	
	public Object getLast()
	{
		if (isEmpty())
		{
			return null;
		}
		
		ListNode current = firstNode;
		
		while (current.getNext() != null)
		{
			current = current.getNext();
		}
		
		return current.getValue();
	}
	
	public Object removeFirst()
	{
		if (isEmpty())
		{
			return null;
		}
		
		ListNode current = firstNode;
		ListNode tempNode = current.getNext();
		current.setNext(null);
		firstNode = tempNode;
		
		return current.getValue();
	}
	
	public Object removeLast()
	{
		if (isEmpty())
		{
			return null;
		}
		
		ListNode current = firstNode;
		ListNode follow = null;
		
		while (current.getNext() != null)
		{
			follow = current;
			current = current.getNext();
		}
		
		if (follow == null)
		{
			firstNode = null;
		}
		
		else
		{
			follow.setNext(null);
		}
		
		return current.getValue();
	}
	
	public String toString()
	{
		String s = "";
		ListNode current = firstNode;
		
		while (current != null)
		{
			s += current.getValue() + " ";
			current = current.getNext();
		}
		
		return s;
	}
	
	public int size()
	{
		int counter = 0;
		ListNode current = firstNode;
		
		while (current != null)
		{
			current = current.getNext();
			counter++;
		}
		
		return counter;
	}
	
	public boolean isEmpty()
	{
		ListNode current = firstNode;
		
		while (current != null)
		{
			current = current.getNext();
			
			return false;
		}
		
		return true;
	}
	
	public boolean remove()
	{
		Object returnVal = removeLast();
		if (returnVal != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remove(Object o)
	{
		if (isEmpty())
		{
			return false;
		}
		
		ListNode current = firstNode;
		ListNode follow = null;
		
		while (current.getNext() != null)
		{
			if (current.getValue().equals(o))
			{
				if (follow == null)
				{
					removeFirst();
					return true;
				}
				else
				{
					ListNode tempNode = current.getNext();
					current.setNext(null);
					follow.setNext(tempNode);
					return true;
				}
			}
			
			follow = current;
			current = current.getNext();
		}
		
		if (current.getValue().equals(o))
		{
			follow.setNext(null);
			return true;
		}
		
		return false;
	}
	
	//added for ListIterator class
	public ListNode getFirstNode()
	{
		return firstNode;
	}
	
	//added for ListIterator class
	public ListIterator<E> iterator() 
	{
		return new ListIterator<E>(this);
	}
	
	public static void main(String[] args){ 
		LinkedList<String> bowl = new LinkedList<String>();

		bowl.addFirst("three");
		bowl.addLast("four");
		bowl.addLast("five");
		bowl.addLast("six");
		bowl.addLast("seven");
		bowl.addLast("eight");
		bowl.add("nine");
		bowl.add("ten");
		bowl.addFirst("two");
		bowl.addFirst("one");

		System.out.println("Testing addFirst(),addLast() methods");
		System.out.println(bowl);
		System.out.println();
		System.out.println("Testing removeFirst() and removeLast() methods");
		System.out.println("First? " + bowl.removeFirst());
		System.out.println("Last? " + bowl.removeLast());
		System.out.println(bowl);
		System.out.println ("Testing remove object");
		System.out.println("two? " + bowl.remove("two"));
		System.out.println("nine? " +  bowl.remove("nine"));
		System.out.println("five? " + bowl.remove("five"));
		System.out.println("eleven? " +bowl.remove("eleven"));
		System.out.println(bowl);
		System.out.println("Testing size()");
		System.out.println(bowl.size());
	}

}
