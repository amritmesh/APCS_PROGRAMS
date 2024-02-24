package roster;

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
		value = this.value;
	}
	
	public void setNext(ListNode next)
	{
		next = this.next;
	}
	
	public String toString()
	{
		return (String) value;
	}
}
