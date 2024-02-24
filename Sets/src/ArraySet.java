import java.util.Arrays;

public class ArraySet<E> implements MySet<E>
{
	E[] set;
	
	public ArraySet()
	{
		set = (E[]) new Object[0];
	}
	
	public boolean add(E y)
	{
		if (contains(y))
		{
			return false;
		}
		
		E[] newSet = Arrays.copyOf(set, set.length + 1);
		newSet[newSet.length - 1] = y;
		
		set = (E[])newSet;
		return true;
	}
	
    public boolean contains(E x)
    {
    	for (E y : set)
    	{
    		if (x == y)
    		{
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public int size()
    {
    	return set.length;
    }
    
    public MyIterator<E> iterator()
    {
    	return new ArrayIterator(this);
    }
    
    public boolean remove(E y) 
    {
		if (!(contains(y)))
		{
			return false;
		}
		
		int index = 0;
	    for (int i = 0; i < set.length; i++)
	    {
	        if (y.equals(set[i])) 
	        {
	        	index = i;
	        }
	    }
	    
		E[] newSet = Arrays.copyOf(set, set.length - 1);

	    for (int i = 0, j = 0; i < set.length; i++) 
	    {
	        if (i != index) 
	        {
	            newSet[j++] = set[i];
	        }
	    }
	    
	    set = newSet;
	    
		return true;
    }
    
    public E[] getSet()
    {
    	return set;
    }
    
    public String toString()
    {
    	return Arrays.toString(set);
    }
    
    public static void main(String[] args)
    {
    	System.out.println("ArraySet Class Test: ");
    	System.out.println();

    	ArraySet<Integer> x = new ArraySet<Integer>();
    	
    	x.add(1);
    	x.add(2);
    	x.add(3);
    	x.add(4);
    	x.add(5);
    	x.add(6);
    	System.out.println(x.toString());
    	System.out.println();
    	
    	System.out.println(x.remove(4));
    	System.out.println();
    	System.out.println(x.toString());
    	System.out.println();
    	
    	System.out.println(x.contains(5));
    	System.out.println();
    	
    	System.out.println(x.size());
    	System.out.println();
    	
    	System.out.println("-------------------------");
    	System.out.println();
    	System.out.println("ArrayIterator Class Test:");
    	System.out.println();
    	
    	ArrayIterator<Integer> y = new ArrayIterator<Integer>(x);
    	
    	System.out.println(y.hasNext()); 
    	System.out.println();
    	System.out.println(y.next());  
    	System.out.println(y.next());
    	System.out.println();
    	System.out.println("y.remove() called here");
    	y.remove();
    	
    	System.out.println();
    	
    	ArrayIterator<Integer> removeMethodChecker = new ArrayIterator<Integer>(x);

    	while (removeMethodChecker.hasNext())
    	{
    		System.out.println(removeMethodChecker.next());
    	}
    }
}
