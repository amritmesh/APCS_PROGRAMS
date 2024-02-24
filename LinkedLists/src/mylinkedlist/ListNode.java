package mylinkedlist;

public class ListNode
{
	private Object value;
	private ListNode next;
	
	public ListNode(Object initValue, ListNode initNext)
	{
		value = initValue;
		next = initNext;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public void setNext(ListNode next)
	{
		this.next = next;
	}
	
	public String toString()
	{
		return (String)value;
	}
}
