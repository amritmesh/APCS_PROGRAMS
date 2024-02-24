import java.util.ArrayList;

public class NameHashTable 
{
	// instance variables - replace the example below with your own
	private ArrayList<String>[] table;

	/**
	 * Constructor for objects of class NameHashTAble
	 */
	public NameHashTable() 
	{
		table = new ArrayList[26];
		
		for (int i = 0; i < 26; i++)
		{
			table[i] = new ArrayList<String>();
		}
	}

	public void add(String x) 
	{
//		int ch = (int)(x.charAt(0));
//		int letter = ch-65;
//		table[letter].add(x);
		
		table[x.charAt(0) - 'A'].add(x);
	}

	public void remove(String x) 
	{
		table[x.charAt(0) - 'A'].remove(x);
	}

	public boolean contains(String x) 
	{
//		for (ArrayList<String> list : table) 
//		{
//			for (String name : list) 
//			{
//				if(name == x)
//					return true;
//			}
//		}
//		return false;
		
		return table[x.charAt(0)-'A'].contains(x);
	}

	public void display() 
	{
		char ch = 'A';
		
		for (ArrayList<String> list : table) 
		{
			System.out.println(ch++ + "\t" +  list);
		}
	}
	
	public static void main(String[] args) 
	{
		NameHashTable club = new NameHashTable();
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