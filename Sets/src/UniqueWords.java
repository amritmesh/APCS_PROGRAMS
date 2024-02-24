import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;

public class UniqueWords 
{
	HashSet<String> words;
	
	public UniqueWords()
	{
		words = new HashSet<String>();
		loadWords();
	}
	
	public void loadWords()
	{
		File file = new File("dream.txt");
		try 
		{
		    Scanner inFile = new Scanner(file);
		       
		    while (inFile.hasNext()) 
		    {         
		    	String temp = inFile.next(); 
		        temp = temp.toLowerCase();
		        // temp=temp.replaceAll("[!;,':.?\"-] ","");
		        temp = temp.replaceAll("[^A-Za-z]","");
		        // temp is the word. What are we going to do with it?
		        if (temp.length() > 0)
		        {
		        	words.add(temp);
		        }
		    }
		    inFile.close(); 
		}
		catch (FileNotFoundException e) 
		{      
	    	System.out.println("FILE NOT FOUND");
	        e.printStackTrace(); 
		}
	}

	public int uniqueWordCount()
	{
		return words.size();
	}
	
	public void alphabeticalList()
	{
		TreeSet<String> y = new TreeSet<String>();
		
		for (String z : words)
		{
			y.add(z);
		}
		
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		UniqueWords x = new UniqueWords();
		
		x.loadWords();
	}
}
