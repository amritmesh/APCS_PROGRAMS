import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class PrintQueue 
{
	public Queue<PrintJob> printList = new LinkedList<PrintJob>();
	
	public PrintQueue()
	{
		printList = new LinkedList<PrintJob>();
	}
	
	// This will add a new printJob to the queue
	public void addJob(String userName)
	{
		printList.offer(new PrintJob(userName));
	}
	
	// This will return the next printJob in the queue
	public PrintJob newJob()
	{
		return printList.peek();
	}
	
	// forEach loop
	public void display()
	{
		for (PrintJob x : printList)
		{
			System.out.print(x + " ");
		}
	}
	
	// toString()
	public void display2()
	{
		System.out.println(printList);
	}
	
	// iterator()
	public void display3()
	{
		Iterator<PrintJob> pointer = printList.iterator();
		while (pointer.hasNext())
		{
			System.out.print(pointer.next() + " ");
		}
	}
	
	// empty and display
	public void clearThePrinter()
	{
		while (!printList.isEmpty())
		{
			System.out.println(printList.poll());
		}
	}
	
	public static void main(String[] args)
	{
		PrintQueue x = new PrintQueue();
		x.addJob("Adam");
		x.addJob("Bertha");
		x.addJob("Chetanya");
		x.display();
		System.out.println();
		x.clearThePrinter();
		System.out.println("Count: " + PrintJob.getPrintCount());
	}
}

