public class ArrayIterator<E> implements MyIterator<E>
{
	public ArraySet<E> set;
	public int pointer;
	
	public ArrayIterator(ArraySet<E> mySet) 
	{
		set = mySet;
		pointer = 0;
	}

	public E next()
	{
		E[] iterSet = (E[])(set.getSet());
		
		return iterSet[pointer++];
	}
	
	public boolean hasNext()
	{
        return pointer < set.getSet().length;
	}
	
	public void remove()
	{
		E[] iterSet = (E[])(set.getSet());
		set.remove(iterSet[--pointer]);
	}
}
