package edu.wwp.apcs.pkg4;

public class StringFunctionsQuizPreview 
{
	public static int countLetters (String word)
	{
		String lower = word.toLowerCase();
		int x = 0;
	
		for (int i = 0; i < lower.length(); i++)
		{
			if ((int)(lower.charAt(i)) < 111 && 
			   (int)(lower.charAt(i)) >= 97) 
			{
				x++;
			}
		}

		return x;
	}
	
	public int countConsonants (String word)
	{
		String lower = word.toLowerCase();
		int x = 0;

		for (int i = 0; i < lower.length(); i++) 
		{
			if ((int)(lower.charAt(i)) >= 97 
				&& (int)(lower.charAt(i)) != 101 
				&& (int)(lower.charAt(i)) != 105 
				&& (int)(lower.charAt(i)) != 111 
				&& (int)(lower.charAt(i)) != 118)
			{
				x++;
			}
		}

		return x;
	}
	
	public String reverseEveryOtherLetter (String myWord)
	{
		String x = "";
		
		for (int i = myWord.length() - 1; i >= 0; i -= 2) 
		{
			x += myWord.charAt(i);
		}

		return x;
	}
	
	public String getFirstSentence (String phrase)
	{
		return phrase.substring(0, phrase.indexOf("/"));
	}
	
	public boolean isValid (String password)
	{
		return ((password.length() > 5) && (password.indexOf('?') >= 0 
		|| password.indexOf('!') >= 0 
		|| password.indexOf('&') >= 0 
		|| password.indexOf('$') >= 0));
	}
	
	public static void main(String [] args) 
	{
		StringFunctionsQuizPreview s = new StringFunctionsQuizPreview();
		
		System.out.println(StringFunctionsQuizPreview.countLetters("Hello World!"));
		System.out.println(s.countConsonants("Hello World!"));
		System.out.println(s.reverseEveryOtherLetter("Connolly"));
		System.out.println(s.getFirstSentence("How are you?/I'm doing good."));
		System.out.println(s.isValid("$##"));
		System.out.println(s.isValid("Advait!"));
		System.out.println(s.isValid("Mr. Guy"));
	}
}