import java.io.File;
import java.util.Scanner;

public class ClubMapTester 
{
	public static void main(String[] args)
	{
		ClubMap tc = new ClubMap();
		File one = new File("student.txt");
		String last, first, id, club;
		int count = 0;
		
		try 
		{
			Scanner in = new Scanner(one);
	        while (in.hasNext()) 
	        {
	        	last = (in.next());
	        	first = (in.next());
	        	id = (in.next());
	        	club = (in.next());
	        	tc.add(club, new ClubStudent(last, first, id));
	        }
		} 
		catch (Exception e) 
		{
			System.out.println("File not found");
		}
 
		tc.printMap();
		System.out.println();
		tc.printRoster("Math");
		System.out.println("Total Students " + tc.size());
	}
}
