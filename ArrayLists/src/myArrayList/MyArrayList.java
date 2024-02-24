//package myArrayList;
//
//public class MyArrayList<E> implements MyList<E>
//{
//	private Object[] list;
//	
//	public MyArrayList()
//	{
//		list = new Object[0];
//	}
//	
//	public void add(E o)
//	{
//		Object[] temp = new Object[list.length + 1];
//		int x = 0;
//		
//		for (Object i : list)
//		{
//			temp[x] = i;
//			x++;
//		}
//		
//		temp[list.length] = o;
//		list = temp;
//	}
//	
//	public void display() 
//	{
//		for (Object x : list)
//		{
//			System.out.println(x);
//		}
//	}
//	
//	public Object get(int index)
//	{
//		return list[index];
//	}
//	
//	public boolean contains (E o)
//	{
//		boolean i;
//		
//		for (Object x : list)
//		{
//			if (x != o)
//			{
//				i = false;
//			}
//			
//			else
//			{
//				i = true;
//			}
//		}
//		
//		return i;
//	}
//	
////	public boolean remove (E o)
////	{
////		
////	}
////	
////	public Object remove(int index) 
////	{
////		
////	}
//	
//	public Object set(int index, Object o) 
//	{
//		Object deleted = list[index];
//		list[index] = 0;
//		return deleted;
//	}
//	
////	public String toString()
////	{
////		
////	}
//	
//	public int size()
//	{
//		return list.length;
//	}
//	
//	public static void main(String[] args)
//	{
//		MyArrayList<String> zoo = new MyArrayList<String>();
//		zoo.add("aardvark");
//		zoo.add("cat");
//		zoo.add("elephant");
//		zoo.add("emu");
//		zoo.add("gnu");
//		zoo.add("goat");
//		zoo.add("hippo");
//		System.out.println(zoo.size());
//		System.out.println(zoo);
//	}
//}
