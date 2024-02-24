package doublyLL21;

import java.util.NoSuchElementException;

public class DLinkedList<E> implements MyList<E>
{
	private DListNode firstNode;
	private DListNode lastNode;
	
	public DLinkedList()
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
			firstNode = new DListNode(o, null, null);
			lastNode = firstNode;
		}
		else
		{
			lastNode.setNext(new DListNode(o, null, lastNode));
			lastNode = lastNode.getNext();
		}
	}
	
	public void addFirst(Object o)
	{
		if (firstNode == null)
		{
			firstNode = new DListNode(o, null, null);
			lastNode = firstNode;
		}
		else
		{
			DListNode temp = new DListNode(o, firstNode, null);
			firstNode.setPrevious(temp);
			firstNode = temp;
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
		
		return lastNode.getValue();
	}
	
	public void setFirst(DListNode newFirstNode)
	{
		DListNode oldFirstNode = firstNode;
		firstNode = newFirstNode;
		firstNode.setPrevious(null);
		firstNode.setNext(oldFirstNode);
		oldFirstNode.setPrevious(firstNode);
	}
	
	public void setLast(DListNode newLastNode)
	{
		DListNode oldLastNode = lastNode;
		lastNode = newLastNode;
		lastNode.setNext(null);
		lastNode.setPrevious(oldLastNode);
		oldLastNode.setNext(lastNode);
	}
	
	public Object removeFirst()
	{
		if (isEmpty())
		{
			return null;
		}
		
		DListNode current = firstNode;
		DListNode tempNode = current.getNext();
		current.setNext(null);
		firstNode = tempNode;
		firstNode.setPrevious(null);
		
		return current.getValue();
	}
	
	public Object removeLast()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("Can't remove from an empty list");
		}
		else if (firstNode == lastNode) 
		{
			Object item = firstNode.getValue();
			firstNode = lastNode = null;
			return item;
		}
		else
		{
			DListNode temp = lastNode;
			lastNode = lastNode.getPrevious();
			lastNode.setNext(null);
			return temp.getValue();
		}
	}
	
	public String toString()
	{
		String s = "";
		DListNode current = firstNode;
		
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
		DListNode current = firstNode;
		
		while (current != null)
		{
			current = current.getNext();
			counter++;
		}
		
		return counter;
	}
	
	public boolean isEmpty()
	{
		DListNode current = firstNode;
		
		while (current != null)
		{
			current = current.getNext();
			
			return false;
		}
		
		return true;
	}
	
	public boolean remove(Object o)
	{
		if (isEmpty())
		{
			return false;
		}
		
		DListNode current = firstNode;
		
		while (current.getNext() != null)
		{
			if (current.getValue().equals(o))
			{
				if (current.getPrevious() == null)
				{
					removeFirst();
					return true;
				}
				else
				{
					DListNode tempNodeNext = current.getNext();
					DListNode tempNodePrev = current.getPrevious();
					current.setNext(null);
					tempNodePrev.setNext(tempNodeNext);
					tempNodeNext.setPrevious(tempNodePrev);
					return true;
				}
			}
			
			current = current.getNext();
		}
		
		if (current.getValue().equals(o))
		{
			DListNode tempNodePrev = current.getPrevious();

			current.setNext(null);
			tempNodePrev.setNext(null);
			lastNode = tempNodePrev;
			return true;
		}
		
		return false;
	}
	
	public void printBackwards()
	{
		DListNode current = lastNode;
		
		while (current != null)
		{
			System.out.print(current + " ");
			current = current.getPrevious();
		}
		
		System.out.println();
	}

	public static void main(String[] args)
	{ 
		DLinkedList<String> bowl = new DLinkedList<String>();

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
		System.out.println("Testing output backwards");
		bowl.printBackwards();
		System.out.println();
		System.out.println("Testing removeFirst() and removeLast() methods");
		System.out.println("First? " + bowl.removeFirst());
		System.out.println("Last? " + bowl.removeLast());
		System.out.println(bowl);
		System.out.println();
		System.out.println ("Testing remove object");
		System.out.println("two? " + bowl.remove("two"));
		System.out.println("nine? " +  bowl.remove("nine"));
		System.out.println("five? " + bowl.remove("five"));
		System.out.println("eleven? " + bowl.remove("eleven"));
		System.out.println(bowl);
		System.out.println();
		System.out.println("Testing size()");
		System.out.println(bowl.size());
	}
}
