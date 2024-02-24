package edu.wwp.apcs.pkg4;
import java.util.ArrayList;

public class StringFuncts2 
{
	// This method will return the number of occurrences
	// of letter in the string word.
	// countletter(&quot;o&quot;, &quot;Connolly&quot;) ======&gt; 2
	public static int countLetter(String letter, String word) 
	{
		int x = 0;
		for (int i = 0; i < word.length(); i++) 
		{
			if (word.charAt(i) == letter.charAt(0)) 
			{
				x++;
			}
		}
		return x;
	}
	
	// This method will put a name back in correct form
	// from an inputted String in the form last, first
	// getName (&quot;Connolly, Tom&quot;) =========&gt; Tom Connolly
	// precondition: inputed name is in the correct form
	public static String getName(String name) 
	{
		String first = name.substring(name.indexOf(",") + 1);
		String last = name.substring(0, name.indexOf(","));
		return first + " " + last;
	}
	
	// This method will return a new String with the vowels removed
	public static String removeVowels(String fullName) 
	{
		String vowels = "aeiouAEIOU";
		String letter = "";
		String newWord = "";
		
		for (int i = 0; i < fullName.length(); i++)
		{
			letter = fullName.substring(i, i + 1);
			
			if (vowels.indexOf(letter) < 0)
			{
				newWord += letter;
			}
		}
		
		return newWord;
	}
	
	// This method returns an anagram of a word
	public static String anagram(String name) 
	{
		String x = "";
		
		for (int i = 0; i < name.length(); i += 2) 
		{
			x += name.charAt(i);
		}
		
		for (int i = 1; i < name.length(); i += 2) 
		{
			x += name.charAt(i);
		}
		
		return x;
	}
	
	// This will create a random anagram of a string
	public static String randomAnagram(String name) 
	{
		String x = "";
		
		ArrayList<String> letters = new ArrayList<String>();
		
		for (int i = 0; i < name.length(); i++) 
		{
			letters.add(Character.toString(name.charAt(i)));
		}
		
		while (letters.size() > 0) 
		{
			int a = (int) (Math.random() * letters.size());
			x += letters.get(a);
			letters.remove(a);
		}	
		
		return x;
	}
	
	/* Pyramid 1
	C
	CO
	CON
	CONN
	CONNO
	CONNOL
	CONNOLL
	CONNOLLY*/
	public static void displayPyramid1(String last)
	{
		for (int i = 0; i < last.length() + 1; i++) 
		{
			System.out.println(last.substring(0, i).toUpperCase());
		}
	}
	
	/*Pyramid 2
	CONNOLLY

	CONNOLL
	CONNOL
	CONNO
	CONN
	CON
	CO
	C*/
	public static void displayPyramid2(String last)
	{
		for (int i = last.length(); i > 0; i--) 
		{
			System.out.println(last.substring(0, i).toUpperCase());
		}
	}
	
	/*Pyramid 3
	Y
	LY
	LLY
	OLLY
	NOLLY
	NNOLLY
	ONNOLLY
	CONNOLLY
	*/
	public static void displayPyramid3(String last)
	{
		for (int i = 0; i < last.length() + 1; i++) 
		{
			System.out.println(last.substring(last.length() - i).toUpperCase());
		}
	}
	
	/*Pyramid 4
	CONNOLLY
	ONNOLLY
	NNOLLY
	NOLLY
	OLLY
	LLY
	LY
	Y*/
	public static void displayPyramid4(String last)
	{
		for (int i = last.length(); i > 0; i--) 
		{
			System.out.println(last.substring(last.length() - i).toUpperCase());
		}
	}
}