import java.util.ArrayList;

public class ArrayListStack<E> implements MyStack<E>
{
	private ArrayList<E> data;
	
	public ArrayListStack()
	{
		data = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		if (!(data.size() == 0))
		{
			return false;
		}
		
		return true;
	}
	
	public E push(E item)
	{
		data.add(item);
		
		return item;
	}
	
	public E pop()
	{
		return data.remove(data.size() - 1);
	}
	
	public E peek()
	{
		return data.get(data.size() - 1);
	}
	
	public int size()
	{
		return data.size();
	}
	
	public int search(E a)
	{
		int location = 1;
		
		for (int i = data.size() - 1; i >= 0; i--)
		{
			location++;
			
			if (data.get(i).equals(a))
			{
				location = i;
			}
		}
		
		return location;
	}
	
	public String toString()
	{
		return data.toString();
	}

	public static void main(String[] args)
	{
		ArrayListStack<Integer> x = new ArrayListStack<Integer>();
	  
		System.out.println(x.isEmpty());
		
		System.out.println(x.push(1));
		System.out.println(x.push(8));
		System.out.println(x.push(9));
		System.out.println(x.push(3));
		System.out.println(x.toString());
		
		System.out.println(x.pop());
		System.out.println(x.toString());
		
		System.out.println(x.peek());

		System.out.println(x.isEmpty());
		System.out.println(x.size());
		System.out.println(x.search(8));
	}
}
