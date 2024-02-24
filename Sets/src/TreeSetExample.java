import java.util.*;

public class TreeSetExample 
{
	TreeSet<Integer> tree;
	
	public TreeSetExample()
	{
		tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(23);
		tree.add(34);
		tree.add(45);
		tree.add(6);
		tree.add(9);
		tree.add(1);
		tree.add(31);
		tree.add(5);
	}
	
	public void display()
	{
		System.out.println(tree);
	}
	
	public void display2()
	{
		for (Integer x : tree)
		{
			System.out.println(x + " ");
		}
	}
	
	public void display3()
	{
		Iterator iter = tree.iterator();
		
		while(iter.hasNext())
		{
			System.out.print(iter.next() + " ");
		}
	}
	
	public void displayReverse()
	{
		System.out.println();
		Iterator iter = tree.descendingIterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next() + " ");
		}
	}
	
	public int getBiggest()
	{
		System.out.println("Biggest Number");
		return tree.last();
	}
	
	public int getSmallest()
	{
		System.out.println("Smallest Number");
		return tree.first();
	}
	
	public static void main(String[] args)
	{
		TreeSetExample one = new TreeSetExample();
		
		one.display();
		one.display2();
		System.out.println();
		one.display3();
		one.displayReverse();
		System.out.println();
		System.out.println(one.getBiggest());
		System.out.println();
		System.out.println(one.getSmallest());
	}
}
