import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;

public class Thesaurus 
{
	TreeMap<String, TreeSet<String>> synonyms;
	
	public Thesaurus()
	{
		synonyms = new TreeMap<String, TreeSet<String>>();
	}
	
	void add(String word, String syn) 
	{
		Set<String> keys = synonyms.keySet();
		
		if(!(keys.contains(word)))
		{
			TreeSet<String> x = new TreeSet<String>();
			x.add(syn);
			synonyms.put(word, x);
		}
		else
		{
			TreeSet<String> x = synonyms.get(word);
			x.add(syn);
			// synonyms.put(word, x);
		}
	}
	
	void display() 
	{
		
	}
	
	public static void main(String[] args) 
	{
		Thesaurus tc = new Thesaurus();
		tc.add("large", "big");
		tc.add("large", "humongous");
		tc.add("large", "bulky");
		tc.add("large", "broad");
		tc.add("large", "heavy");
		tc.add("smart", "astute");
		tc.add("smart", "clever");
		tc.add("smart", "clever");
		tc.add("large", "big");
		tc.add("heavy", "weighty");
		tc.add("heavy", "hefty");
		tc.display();
	}
}
