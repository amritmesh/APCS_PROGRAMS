import java.util.TreeSet;

public class StringTree1 
{
	TreeSet <String> words;
	
	public StringTree1()
	{
		words = new TreeSet<String>(new StringLength());
	}
	
	public void insert(String x)
	{
		words.add(x);
	}
	
	public String getLongest()
	{
		return words.first();
	}
	
	public String getShortest()
	{
		return words.last();
	}
	
	public void display()
	{
		System.out.println(words.toString());
	}
	
	public void display2()
	{
		for (String x : words)
		{
			System.out.println(x + " ");
		}	
	}
	
	public static void main(String[] args)
	{
		StringTree1 one = new StringTree1();
		
		one.insert("fig");
		one.insert("apple");
		one.insert("lemon");
		one.insert("fig");
		one.insert("grape");
		one.insert("pineapple");
		one.insert("lime");
		one.insert("kiwi");
		one.insert("ugli");
		one.insert("watermelon");
		
		one.display();
		System.out.println("Longest Word: " + one.getLongest());
		System.out.println("Shortest Word: " + one.getShortest());
	}
}
