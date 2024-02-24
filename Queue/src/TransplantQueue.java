import java.util.LinkedList;

public class TransplantQueue implements PriorityQueue
{
	private LinkedList<Patient> queue = new LinkedList<Patient>();

	public boolean isEmpty()
	{
		if (!(queue.size() == 0))
		{
			return false;
		}
		
		return true;
	}
	
	public void offer(Object x)
	{
		queue.addLast((Patient)x);;
	}
	
	//Retrieves and removes the head of this queue, or null if this queue is empty.
	public Object poll()
	{
		Patient x = queue.peek();
		int z = x.getPriority();
		
		for (Patient y : queue) 
		{
			if (y.getPriority() < z)
			{
				x = y;
				z = x.getPriority();
			}
		}
		
		queue.remove(x);
		return x;
	}
	
	//Retrieves, but does not remove, the head of this queue, returning null if this queue is empty.
	public Object peek()
	{
		Patient x = queue.peek();
		int z = x.getPriority();
		
		for (Patient y : queue) 
		{
			if (y.getPriority() < z)
			{
				x = y;
				z = x.getPriority();
			}
		}
		
		return x;
	}
	
	public int size()
	{
		return queue.size();
	}
	
	public String toString()
	{
		String result = "";
		
		for (Patient x : queue)
		{
			result += x;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		TransplantQueue pq = new TransplantQueue();
		pq.offer(new Patient("Smith",3));
		pq.offer(new Patient("Cheng",2));
		pq.offer(new Patient("Jones",3));
		pq.offer(new Patient("Wong",3));
		pq.offer(new Patient("Gupta",2));
		pq.offer(new Patient("Garcia",1));
		pq.offer(new Patient("Brown",3));
		System.out.println("The list is");
		System.out.println(pq);  
		
		while (pq.size() > 0)
		{
			System.out.println("The next patient for the liver transplant is");
			System.out.println(pq.poll());
	   	}
	}
}
