package edu.wwp.apcs.pkg8;

public class LetterArray 
{ 
	 
	 public String[] letter; 
	 
	 /** 
	  * Default constructor for objects of class LetterArray 
	  */ 
	 public LetterArray() 
	 { 
		 letter = new String[] { "r", "a", "c", "e", "c", "a", "r" }; 
	 } 
	 
	 /** 
	  * Constructor for objects of class LetterArray. Each letter of phrase will 
	  * be assigned as an element in the array 
	  */ 
	 public LetterArray(String phrase) 
	 { 
		 letter = new String[phrase.length()];
		 
		 for (int i = 0; i < letter.length; i++) 
		 {
			 letter[i] = phrase.substring(i, i + 1);
		 }
	 }
	 
	 /** 
	  * Prints the array in order 
	  */ 
	 public void display() 
	 { 
		 for (int i = 0; i < letter.length; i++)
		 {
			 System.out.print(letter[i] + " ");
		 }
		
		 System.out.println();
	 } 
	 
	 /** 
	  * Prints the array in reverse order 
	  */ 
	 public void displayReverse() 
	 { 
		 for (int i = letter.length - 1; i >= 0; i--) 
		 {
			 System.out.println(letter[i] + " ");
		 }
	        
		 System.out.println();
	 } 
	 
	 /** 
	  * Prints the every other element of the array starting with the first 
	  * letter. 
	  */ 
	 public void displayEveryOtherLetter() 
	 { 
		 for (int i = 0; i < letter.length; i += 2)
		 {
			 System.out.print(letter[i]);
		 }
	 } 
	 
	 /** 
	  * Tests if palindrome. 
	  */ 
	 public boolean isPalindrome() 
	 { 
		 for (int i = 0; i < letter.length / 2; i++)
		 {
			 if (!(letter[i].contentEquals(letter[letter.length - 1 - i])));
			 {
				 return false;
			 }
		 }
		 
		 return true;
	 } 
	 
	/** 
	  * Changes the order of the array. (Scrambles the letters) 
	  */ 
	 public void anagram() 
	 { 
		 for (int i = 0; i < letter.length / 2; i++)
		 {
			 int rand = (int)(Math.random() * letter.length);
			 
			 String temp = letter[i];
			 letter[i] = letter[rand];
			 letter[rand] = temp;
		 }
		 
		 display();
	 } 
	 
	 /** 
	  * Counts the number of occurrences of an inputed letter in the array 
	  */ 
	 public int count(String x) 
	 { 
		 int count = 0; 
		 
		 for (int i = 0; i  < letter.length; i++)
		 {
			 if (letter[i].contentEquals(x));
			 {
				 count++;
			 }
		 }
		 
		 return count;
	 } 
	 
	 /** 
	  * Return a chart of the letters of the alphabet and the letter count.
	  * LETTER COUNT
	  *  a 	2
	  *  b		0
	  *  c		1
	  *………
	  *  z       0
	  */ 
	 public void letterCount() 
	 { 
		 int[] count = new int[26];
		 for (int i = 0; i < letter.length; i++)
		 {
			 count[letter[i].charAt(0) - 'a']++;
		 }
		 
		 System.out.println("LETTER" +  "\t" + "COUNT");
		 
		 for (int i = 0; i < count.length; i++)
		 {
			 System.out.println("" + (char)(i + 'a') + "\t" + count[i]);
		 }
	 } 
	 
	 /** 
	  * sorts the array alphabetically 
	  */ 
	 public void sort() 
	 { 
		 for (int outer = 0; outer < letter.length; outer++)
		 {
			 for (int inner = 0; inner < letter.length; inner++)
			 {
				 if (letter[inner].compareTo(letter[outer]) > 0)
				 {
					 String temp = letter[inner];
					 letter[inner] = letter[outer];
					 letter[outer] = temp;
				 }
			 }
		 }
	 } 
	 
	 public static void main(String[] args) 
	 { 
	  LetterArray one = new LetterArray(); 
	  LetterArray two = new LetterArray("programming");
	 } 
} 