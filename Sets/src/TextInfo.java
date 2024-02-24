import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class TextInfo 
{
	HashSet<String> words;
	
	public TextInfo()
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
}
