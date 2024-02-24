 package edu.wwp.apcs.pkg4;

public class StringFuncts 
{
	// 1. This method will return an email address in the form
	// first.last@ww-p.org
	// getEmail("Mister", "Connolly") ====> mister.connolly@ww-p.org
	public static String getEmail(String first, String last) 
	{
		return (first + "." + last + "@ww-p.org").toLowerCase();
	}

	// 2. This method will return initials with periods.
	// getInitials("Mister", "Connolly") ====> M.C.
	public static String getInitials(String first, String last) 
	{
		return first.charAt(0) + "." + last.charAt(0) + ".";
	}
	
	// 3. This method will determine if a String contains the '@' symbol
	// isValidEmail("tom.connolly@ww-p.org") ===> TRUE
	// isValidEmail("tom.connolly.ww-p.org") ===> FALSE
	public static boolean isValidEmail(String email) 
	{
		return email.contains("@");
	}

	// 4. This method will determine if a string is more than 8 characters 
	//isValid("programming") ====> true
	// sValid("java") ====> false
	public static boolean  isVocab(String word) 
	{
		return word.length() > 8;
	}
	
	// 5. This method will parse the year from a birthdate
	// in the form MMDDYYYY
	// getYear("06021966) ====> 1966
	public static String getYear(String bday) 
	{
		return bday.substring(4);
	}

	// 6. This method will return a lower case
	// user name in the form of first 3 letters of first name and
	// last 3 letters of last name.
	// getUserName("Mister", "Connolly") ====> mislly
	public static String getUserName(String first, String last)
	{
		int length = last.length();
		String beginning = first.substring(0, 3);
		String end = last.substring(length - 3, length);
		
		return (beginning + end).toLowerCase();
	}

	// 7. This method will parse the first name from a full name separated with
	// a space
	// getFirst("Mister Connolly") ====> Mister
	public static String getFirst(String fullName) 
	{
		int x = fullName.indexOf("");
		
		return fullName.substring(0, x);
	}

	// 8. This method will parse the last name from a full name separated with a
	// space
	// getLast("Mister Connolly") ====> Connolly
	public static String getLast(String fullName) 
	{
		int x = fullName.indexOf("");
		
		// return fullName.substring(x + 1, fullName.length());
		
		return fullName.substring(x + 1);
	}

	// 9. This will return a random 4 letter string of letters
	// getRandomWord() ====> CDRT
	public static String getRandomWord() 
	{
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int one = (int)(Math.random() * 26);
		int two = (int)(Math.random() * 26);
		int three = (int)(Math.random() * 26);
		int four = (int)(Math.random() * 26);
		
		return "" + letters.charAt(one) + letters.charAt(two) + 
				letters.charAt(three) + letters.charAt(four);
	}

	// 10. This will return a new word of every other letter
	// everyOtherLetter("KNIGHTS") ====> KIHS
	public static String everyOtherLetter(String word) 
	{
		String x = "";
		
		for (int i = 0; i < word.length(); i += 2)
		{
			x += word.charAt(i);
		}
		
		return x;
	}

	// 11. This will return a new word that is the reverse.
	// reverse("KNIGHTS") ====> STHGINK
	public static String reverse(String word) 
	{
		String x = "";
		
		for (int i = word.length() - 1; i >= 0; i -= 1)
		{
			x += word.charAt(i);
		}
		
		return x;
	}

	// 12. This will return true if the sum of the first digit and the last
	// digit is divisible by 5.
	// checkDigit("123456789") ====> TRUE
	// checkDigit("12345543211") ====> FALSE
	// checkDigit("87878787") ====> TRUE
	public static Boolean checkDigit(String creditCard) 
	{
		int first = Integer.parseInt(creditCard.substring(0, 1));
		int second = Integer.parseInt(creditCard.substring(creditCard.length() - 1));
		return (first + second) % 5 == 0;
	}

	// 13. This will return a string where every other letter is capitalized
	// everyOtherLetterCaps("misterconnolly") ====> mIsTeRcOnNoLlY
	public static String everyOtherLetterCaps(String word) 
	{
		word = word.toLowerCase();
		String x = "";
		
		for (int i = 0; i < word.length(); i++)
		{
			if (i % 2 == 1)
			{
				x = x + word.substring(i, i + 1).toUpperCase();
			}
			else
			{
				x = x + word.charAt(i);
			}
		}
		
		return x;
	}

	// 14. This will return a string where every o is replaced with an 8
	// replacesOsWith8s("TomConnolly") ====> T8mC8nn8lly
	public static String replaceOsWith8s(String word)
	{
		String x = word.replaceAll("o", "8");
		x = x.replaceAll("O", "8");
		return x;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("1. Email: " + StringFuncts.getEmail("Mister", "Conolly"));
		System.out.println("2. Initials: " + StringFuncts.getInitials("Mister", "Connolly"));
		System.out.println("3. Email validity: " + StringFuncts.isValidEmail("tom.connolly@ww-p.org"));
		System.out.println("3. Email validity (2): " + StringFuncts.isValidEmail("tom.connolly.ww-p.org"));
		System.out.println("4. Vocab: " + StringFuncts.isVocab("programming"));
		System.out.println("4. Vocab (2): " + StringFuncts.isVocab("java"));
		System.out.println("5. Year: " + StringFuncts.getYear("06021966"));
		System.out.println("6. Lower case username: " + getUserName("Mister", "Connolly"));
		System.out.println("7. First name: " + StringFuncts.getFirst("Mister Connolly"));
		System.out.println("8. Last name: " + StringFuncts.getLast("Mister Connolly"));
		System.out.println("9. Random word: " + StringFuncts.getRandomWord());
		System.out.println("10. Every other letter: " + StringFuncts.everyOtherLetter("KNIGHTS"));
		System.out.println("11. Reverse: " + StringFuncts.reverse("KNIGHTS"));
		System.out.println("12. Check digit: " + StringFuncts.checkDigit("123456789"));
		System.out.println("12. Check digit (2): " + StringFuncts.checkDigit("123455432119"));
		System.out.println("12. Check digit (3): " + StringFuncts.checkDigit("87878787"));
		System.out.println("13. Every other letter capitalized: " + StringFuncts.everyOtherLetterCaps("misterconnolly"));
		System.out.println("14. Every 'o' replaced with 8: " + StringFuncts.replaceOsWith8s("TomConnolly"));
	}
}