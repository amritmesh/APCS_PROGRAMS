public class CircularArrayQueue<E> implements MyQueue<E>
{
	private int head;
	private int tail;
	private int size; // # array in queue
	private Object[] array;
       
	// Constructs a CircularArrayQueue object
   	public CircularArrayQueue(int capacity)
   	{
   		array = new Object[capacity];
      	head = 0;
      	tail = 0;
      	size = 0;
   	}
   	
	public boolean isEmpty()
	{
		return (size == 0);
	}
   
   	public boolean offer(Object x)
   	{
   		if (size == array.length) 
   		{
   			doubleCapacity();
   		}
   		
   		array[tail] = x;
   		tail = nextIndex(tail); // same as tail = (tail + 1) % array.length;
   		size++;
	   
   		return true;
   	}
   
   	public E poll()
   	{
   		size--;
   		Object x = array[head];
   	    array[head] = null;
   	    head = nextIndex(head); // same as head = (head + 1) % array.length;
   	    
   	    return (E) x;
  	}
   	
   	public E peek()
   	{
   		if (size == 0) 
   		{
   			return null;
   		}
   		
   		else 
   	    {
   	    	return (E) array[head];
   	    }
   	}
	
   	public void doubleCapacity()
   	{
   	    Object[] newArray = new Object [size * 2];
   	    
   	    for (int i = 0; i < array.length; i++) 
   	    {
   	    	newArray[i] = array[head];
   	    	head = nextIndex(head); // same as head = (head + 1) % array.length;
   	    }
   	      	    
   	    array = newArray;
   	    tail = size;
   	    head = 0;
   	}
   
   	public int nextIndex(int x)
   	{
   		int r = x + 1;
   		if (r == array.length)
   		{
   			r = 0;
   		}
   		
   		return r;
   	}
	
	public String toString()
	{
	    String x = "[ ";
	    int y = head;
	 
	    for (int i = 0; i < array.length; i++)
	    {
	    	if (array[y] != null)
	    	{
		    	x += array[y] + " ";
	    	}
	    	
		    y = nextIndex(y);
	    }
	    
	    x += "]";
	    return x;
	}
	
	public static void main(String[] args) 
	{
        CircularArrayQueue<Integer> a = new CircularArrayQueue<Integer>(10);
        a.offer(1);
        a.offer(2);
        a.offer(3);
        a.offer(4);
        a.offer(5);
        a.offer(6);
        a.offer(7);
        a.offer(8);
        a.offer(9);
        
        System.out.println(a);
        
        System.out.println("NEXT: " + a.poll());
        System.out.println("NEXT: "+ a.poll());
        System.out.println("NEXT: "+ a.poll());
        
        System.out.println(a);
        
        a.offer(10);
        System.out.println(a);
        
        a.offer(11);
        System.out.println(a);
       
        a.offer(12);
        System.out.println(a);
        
        System.out.println("NEXT: "+ a.poll());
        System.out.println(a);
        
        a.offer(13);
        System.out.println(a);
       
        a.offer(14);
        System.out.println( a);
        
        a.offer(15);
        System.out.println(a);
        
        System.out.println("NEXT: "+ a.poll());
        System.out.println(a);
	}
        /**
    	[1, 2, 3, 4, 5, 6, 7, 8, 9]
        NEXT: 1
        NEXT: 2
        NEXT: 3
        [4, 5, 6, 7, 8, 9]
        [4, 5, 6, 7, 8, 9, 10]
        [4, 5, 6, 7, 8, 9, 10, 11]
        [4, 5, 6, 7, 8, 9, 10, 11, 12]
        NEXT: 4
        [5, 6, 7, 8, 9, 10, 11, 12]
        [5, 6, 7, 8, 9, 10, 11, 12, 13]
        [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        [5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        NEXT: 5
        [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        */
}
