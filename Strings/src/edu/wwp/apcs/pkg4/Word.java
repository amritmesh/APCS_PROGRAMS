package edu.wwp.apcs.pkg4;

public class Word 
{
	private String original;

	/**
	* constructs a Word with String value s
	* @param s is string value of Word
	*/
	public Word(String s)
	{
		original = s;
	}
	
	/**
	* reverses letters in original string
	* @return a string that is a reverse of original
	*/
	public String reverse()
	{
		String x = "";
		
		for (int i = original.length() - 1; i >= 0; i -= 1)
		{
			x += original.charAt(i);
		}
		
		return x;
	}
	
	/**
	* returns the length of the string
	*/
	public int getLength()
	{
		return original.length();
	}
	
	/**
	* determines is word is a palindrome
	* @return true if word is a palindrome, false otherwise
	*/
	public boolean isPalindrome()
	{
		return original.equals(reverse());
	}
	
	/**
	* Alternate method to determine if word is a palindrome
	* @return true if word is a palindrome, false otherwise
	*/
	public boolean isPalindrome2()
	{
		for (int i = 0; i < (original.length()) / 2; i++)
		{
			if (original.charAt(i) != original.charAt(original.length() - i - 1))
			{
				return false;
			}
		}
		
		return true;
	}
	
	/**
	* removes vowels in original string
	* @return a string that removes all of the vowels
	*/
	public String removeVowels()
	{
		String vowels = "aeiouAEIOU";
		String letter = "";
		String newWord = "";
		
		for (int i = 0; i < original.length(); i++)
		{
			letter = original.substring(i, i + 1);
			
			if (vowels.indexOf(letter) < 0)
			{
				newWord += letter;
			}
		}
		
		return newWord;
	}
	
	/**
	* creates an anagram
	* @return a string that is a random anagram of the original word
	*/
	public String anagram()
	{
		String a = reverse();
		String anagram = "";
		
		for (int i = 1; i < a.length(); i += 3)
		{
			anagram += a.charAt(i);
		}
		for (int i = 0; i < a.length(); i += 3)
		{
			anagram += a.charAt(i);
		}
		for (int i = 2; i < original.length(); i += 3)
		{
			anagram += a.charAt(i);
		}
		
		return anagram;
	}
	
	public String code(int key)
	{
		String x = "";
		int length = original.length();
		
		for (int i = 0; i < length; i++)
		{
			int y = original.charAt(i) + key;
			x += (char)((y - 97) % 26 + 97);
		}
		
		return x;
	}
}