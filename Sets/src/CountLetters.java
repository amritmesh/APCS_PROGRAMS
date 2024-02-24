import java.util.HashMap;
import java.util.Set;

public class CountLetters 
{
	public static void tallyPrint(String phrase)
	{
		HashMap<String, Integer> mapping = new HashMap<String, Integer>();
		
		for (int i = 0; i < phrase.length(); i++)
		{
			String letter = phrase.substring(i, i + 1);
			
			if (!mapping.containsKey(letter))
			{
				mapping.put(letter,  1);
			}
			else
			{
				int count = mapping.get(letter);
				mapping.put(letter,  count + 1);
			}
		}
		
		Set<String> letters = mapping.keySet();
		System.out.println("LETTER" + "\t" + "COUNT");
		
		for (String letter : letters)
		{
			System.out.println(letter + "\t" + mapping.get(letter));
		}
		
		System.out.println(mapping);
		// System.out.println(mapping.get("<"));
	}
	
	public static void main(String[] args)
	{
		System.out.println("my feet smell and my nose runs");
		tallyPrint("my feet smell and my nose runs");
	}
}
