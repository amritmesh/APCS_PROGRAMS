package edu.wwp.apcs.pkg4;

public class PigLatin 
{
	private String engPhrase;
	
	public PigLatin()
	{
		engPhrase = "my feet smells and my nose runs";
	}
	
	public PigLatin(String phrase)
	{
		engPhrase = phrase + " ";
	}
	
	public String getPhrase()
	{
		return engPhrase;
	}
	
	public String getWord(int s) 
	{
		int x = engPhrase.indexOf(" ");
		String word = engPhrase.substring(s, x);
		return word;
	}
	
	public int findVowelPos(String word)
	{
		String vowels = "AEIOUaeiou";
		String letter = "";
		
		for(int i = 0; i < word.length(); i++)
		{
			letter = word.substring(i, i + 1);
			if(vowels.indexOf(letter) >= 0)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public String wordToPigLatin(String engWord)
	{
		int v = findVowelPos(engWord);
		String t = "";
		
		if(v == -1)
		{
			t = engWord.substring(0, engWord.length() - 1) + "ay";
		}
		else if(v == 0)
		{
			t = engWord.substring(0, engWord.length() - 1) + "yay";
		}
		else
		{
			t = engWord.substring(v, engWord.length() - 1) + engWord.substring(0, v) + "ay";
		}
		
		String punctuation = ",.?!:;";
		String letter = "";
		for (int i = 0; i < t.length(); i++) 
		{
			letter = t.substring(i, i+1);
			if (punctuation.indexOf(letter) >= 0) 
			{
				return t.substring(0,t.indexOf(letter)) + t.substring(t.indexOf(letter) + 1) + letter;
			}
		}
				
		return t;
	}
	
	public String checkForCapitals(String word) 
	{
		String c = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String l = "";
		
		for (int i = 0; i < word.length(); i++) 
		{
			l = word.substring(i, i+1);
			if (c.indexOf(l) >= 0) 
			{
				return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
			}
		}
		
		return word;
	}
	
	public String translate(String engPhrase)
	{
		String pigLatinPhrase = "";
		
		while(engPhrase.length() > 1)
		{
			String w = engPhrase.substring(0, engPhrase.indexOf(' ') + 1);
			pigLatinPhrase += checkForCapitals(wordToPigLatin(w)) + " ";
			engPhrase = engPhrase.substring(w.length());
		}
		
		return pigLatinPhrase;
	}
	
	public static void main(String[] args)
	{
		PigLatin y = new PigLatin("Hello, my name is Mr. Connolly. Have a great day!");
		System.out.println(y.translate(y.getPhrase()));
	}
}
