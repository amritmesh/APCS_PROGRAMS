package edu.wwp.apcs.pkg4;

public class StringFuncts3 
{
	public static boolean isValid(String password)
	{
		if(password.length() < 6)
		{
			return false;
		}
		
		String temp1 = password.toLowerCase();
		String temp2 = password.toUpperCase();
		
		if(temp1.equals(password))
		{
			return false;
		}
		
		if(temp2.contentEquals(password))
		{
			return false;
		}
		
		return true;
	}	
	
	public static String getSecretWord(String phrase)
	{
		String x = "";
		
		for(int i = 1; i <= 6; i++)
		{
			int p = phrase.indexOf(" ");
			x += phrase.charAt(p - 1);
			phrase = phrase.substring(p + 1);
		}
		
		return x;
	}
	
	public static String encode(String word, int key) 
	{	
		String c = "";
		
		for(int i = 0; i < word.length(); i++)
		{
			c += (char)(((word.charAt(i) + key - 'a') % 26 + 'a'));
		}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isValid("Connolly"));
		System.out.println(isValid("Conn"));
		System.out.println(isValid("CONOLLY"));
		System.out.println(getSecretWord("My feet smell and my nose runs."));
		System.out.println(encode("green", 2));
	}
}
