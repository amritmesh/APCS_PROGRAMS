import java.util.LinkedList;

public class LinkedListQueue<E> implements MyQueue<E>
{
	private LinkedList<E> data;
	
	public LinkedListQueue()
	{
		data = new LinkedList<>();
	}
	
	public boolean isEmpty()
	{
		if (!(data.size() == 0))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean offer(E item)
	{
		data.addLast(item);
		
		if (!(data.contains(item)))
		{
			return false;
		}
		
		return true;
	}
	
	public E poll()
	{
		if (data.isEmpty())
		{
			return null;
		}
		
		return data.removeFirst();
	}
	
	public E peek()
	{
		if (data.isEmpty())
		{
			return null;
		}
		
		return data.getFirst();
	}
	
	  public String toString()
	  {
		  String result = "";
		  
		  for (E x : data)
		  {
			  result += x + " ";
		  }
		  
		  return result;
	  }

	  public static void main(String[] args)
	  {
		  LinkedListQueue<Integer> x = new LinkedListQueue<Integer>();
		  
		  System.out.println(x.isEmpty());
		  System.out.println(x.offer(1));
		  System.out.println(x.offer(8));
		  System.out.println(x.offer(9));
		  System.out.println(x.isEmpty());
		  System.out.println(x.toString());
		  System.out.println(x.poll());
		  System.out.println(x.toString());
		  System.out.println(x.peek());
	  }
}
