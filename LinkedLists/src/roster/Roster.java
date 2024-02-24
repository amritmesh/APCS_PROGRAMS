package roster;

import mylinkedlist.ListNode;

public class Roster
{
    // pointer to linked list of wrestlers on the roster sorted 
    // by weight (lighest to heaviest)
   
	private ListNode firstWrestler;

    public Roster()
    {
        firstWrestler = null;
    }
    
    /**
     * precondition: the teamList field is null or it points to the 
     * first node of a linked list
     * 
     * postcondition: w has been added to the list in sorted order (by weight)
     */
    public void addWrestler(Wrestler w)
    {
    	ListNode temp, follow;
    	
		if (firstWrestler == null)
		{
			firstWrestler = new ListNode(w, null);
			return;
		}
		else if (w.compareTo((Wrestler)firstWrestler.getValue()) == 0)
		{
			firstWrestler = new ListNode(w, firstWrestler);
			return;
		}
		else
		{
			temp = follow = firstWrestler;
						
			while (temp!= null && w.compareTo((Wrestler)temp.getValue()) == 1)
			{
				follow = temp;
				temp = temp.getNext();
			}
			
			follow.setNext(new ListNode(w, temp));
		}
    }

    /**
     * precondition: the teamList field is null or it points to the 
     * first node of a linked list
     *
      * return a String representation of the roster
     */
    public String toString()
    {    	
		if (firstWrestler == null)
		{
			return "No values";
		}
		
		String roster = "";
				
		ListNode current = firstWrestler;
		
		while (current != null)
		{
			roster += "(" + ((Wrestler)(current.getValue())).getName() + ", " + ((Wrestler)(current.getValue())).getWeight() + ") ";
			current = current.getNext();
		}
		
		return roster;
    }

    /**
     * precondition: the teamList field is null, or it points to the first node of a linked list
     * the list is sorted according to the weight
     * 
     * postcondition:  returns the pointer to the node in the linked list for the wrestler               
     * whose weight is closest to the given weight without going over.   
     * Returns null if there are no wrestlers or none whose weight is less than or equal to the given weight
     */
    
    public ListNode wrestlerBefore(int weight)
    {
    	ListNode current = firstWrestler;
    	
		if (firstWrestler == null || ((Wrestler)(current.getValue())).getWeight() > weight)
		{
			return null;
		}
		
		while (current.getNext() != null && weight > ((Wrestler)((current.getNext()).getValue())).getWeight())
		{
			current = current.getNext();
		}
		
		if (current.getNext() == null)
		{
			return current;
		}
		else
		{
			int currentDiff = weight - ((Wrestler)(current.getValue())).getWeight();
			int nextDiff = ((Wrestler)((current.getNext()).getValue())).getWeight() - weight;
			
			if (currentDiff < nextDiff)
			{
				return current;
			}
			else
			{
				return current.getNext();
			}
		}
    }

    /**
     * Displays wrestlers less than weight
     */ 
    public void smallerList(int weight)
    {
		String roster = "";

    	ListNode current = firstWrestler;
  		
		while (current != null)
		{			
			if (((Wrestler)(current.getValue())).getWeight() < weight)
			{
				roster += "(" + ((Wrestler)(current.getValue())).getName() + ", " + ((Wrestler)(current.getValue())).getWeight() + ") ";
			}
			
			current = current.getNext();
		}
		
		System.out.println(roster);
    }
    
    public static void main(String[] args)
	{
		Wrestler a = new Wrestler("Bob", 180);
		Wrestler b = new Wrestler("Tom", 160);
		Wrestler c = new Wrestler("Max", 170);

    	Roster x = new Roster();
		
		x.addWrestler(a);
		x.addWrestler(b);
		x.addWrestler(c);

		System.out.println(x);
		
		System.out.println(((Wrestler)(x.wrestlerBefore(168)).getValue()).getWeight());
		System.out.println(((Wrestler)(x.wrestlerBefore(177)).getValue()).getWeight());
		
		x.smallerList(177);
	}
}
