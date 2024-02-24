import java.util.ArrayList;
import java.util.Arrays;

public class NameHashTable2 
{
	// instance variables - replace the example below with your own
	private ArrayList<String>[] table;

	/**
	 * Constructor for objects of class NameHashTAble
	 */
	public NameHashTable2() 
	{
		table = new ArrayList[4];
		
		for (int i = 0; i < 4; i++)
		{
			table[i] = new ArrayList<String>();
		}
	}

	public void add(String x) 
	{
		int bucket = Math.abs(x.hashCode())%table.length;
		table[bucket].add(x);
	}

	public void remove(String x) 
	{
		int bucket = Math.abs(x.hashCode())%table.length;
		table[bucket].remove(x);
	}

	public boolean contains(String x) 
	{
		int bucket = Math.abs(x.hashCode())%table.length;
		return table[bucket].contains(x);
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(table);
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameHashTable2 other = (NameHashTable2) obj;
		return Arrays.equals(table, other.table);
	}

	public void display() 
	{
		for(ArrayList<String> list : table) 
		{
			System.out.println(list);
		}
		
//		for(int i = 0 ; i < table.length ; i++) {
//			if(table[i].isEmpty())
//				break;
//			System.out.println(table[i]);
//		}
	}
	
	public static void main(String[] args) 
	{
		NameHashTable2 club = new NameHashTable2();
		club.add("Aarons");
		club.add("Araons");
		club.add("Daly");
		club.add("Mealy");
		club.add("Davis");
		club.add("Burns");
		club.add("Zhang");
		club.add("Yellowstone");
		club.add("McHale");
		club.add("Yeung");
		club.add("Burns");
		club.add("Garcia");
		club.add("Chen");
		club.add("Yu");
		club.add("Anderson");
		club.add("Dooley");
		club.add("Murphy");
		club.add("Dean");
		club.add("Bettys");
		club.add("Gupta");
		club.add("Chang");
		System.out.println("HASH TABLE");
		club.display();
		club.remove("Chen");
		System.out.println("Contains Yu?   " + club.contains("Yu"));
		System.out.println("Contains Chen?   " + club.contains("Chen"));
	}
}
