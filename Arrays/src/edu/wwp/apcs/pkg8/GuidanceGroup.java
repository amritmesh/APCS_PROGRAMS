package edu.wwp.apcs.pkg8;

public class GuidanceGroup 
{
	// Array group will store SatStudent objects
	private SatStudent[] group;

	/**
	 * Default Constructor for objects of class GuidanceGroup
	*/
	public GuidanceGroup() 
	{
		group = new SatStudent[12];
		group[0] = (new SatStudent("Ye", 640, 695, 686));
		group[1] = (new SatStudent("Bradly", 778, 768, 780));
		group[2] = (new SatStudent("Chen", 687, 614, 705));
		group[3] = (new SatStudent("Davis", 620, 534, 556));
		group[4] = (new SatStudent("Aarons", 550, 565, 517));
		group[5] = (new SatStudent("Gupta", 687, 720, 640));
		group[6] = (new SatStudent("Park", 722, 721, 745));
		group[7] = (new SatStudent("Kohl", 595, 605, 615));
		group[8] = (new SatStudent("Mehta", 525, 637, 521));
		group[9] = (new SatStudent("Bahl", 611, 607, 610));
		group[10] = (new SatStudent("Smith", 670, 703, 610));
		group[11] = (new SatStudent("Isaacs", 670, 690, 710));
	}

	// Constructor with a SatStudent[] array as a parameter
	public GuidanceGroup(SatStudent[] myGroup) 
	{
		group = myGroup;
	}

	// This method displays a chart with 2 columns: Name and Total SAT score
	public void display() 
	{
		System.out.println("NAME" + "\t" + "TOTAL");
		System.out.println("====" + "\t" + "=====");
		
		for (SatStudent i : group)
		{
			System.out.println(i.getName() + "\t" + i.total());
		}
	}
	
	public SatStudent[] getGroup()
	{
		return group;
	}
	
	// This method returns the name of the student with the lowest total SAT score
	public String getMin() 
	{
		int minScore = 0;
		
		for (int i = 0; i < group.length; i++)
		{
			if (group[i + 1].total() < group[i].total())
			{
				minScore = i;
			}
		}
		
		return group[minScore].getName();
	}

	// This method returns the name of the student with the highest total SAT score
	public String getMax() 
	{
		int maxScore = 0;
		
		for (int i = 0; i < group.length; i++)
		{
			if (group[i + 1].total() > group[i].total())
			{
				maxScore = i;
			}
		}
		
		return group[maxScore].getName();
	}

	// This method returns the average total SAT score
	public double average() 
	{
		double total = 0;
		
		for (int i = 0; i < group.length; i++)
		{
			total += group[i].total();
		}
		
		return total / 12;
	}
	
	// This method displays a list of names of students who scored below 1700 
	public void below1700List() 
	{
		for (int i = 0; i < group.length; i++)
		{
			if (group[i].total() < 1700)
			{
				System.out.println(group[i].getName());
			}
		}
	}
	
	// This method displays a list of names of students who scored above 2000 
	public void above2000List() 
	{
		for (int i = 0; i < group.length; i++)
		{
			if (group[i].total() > 2000)
			{
				System.out.println(group[i].getName());
			}
		}
	}

	// this method will return the total score of an inputed name.  return -1 if student is not found
	public int getScore(String lookfor)
	{
		for (int i = 0; i < group.length; i++)
		{
			if (group[i].getName().equals(lookfor))
			{
				System.out.println(group[i].total());
			}
		}
		
		return -1;
	}
	
	// returns an array of SatStudents with total scores >1900
	public SatStudent[] scholarship() 
	{
		int x = 0; 
		
		for (SatStudent i : group)
		{
			if (i.total() > 1900)
			{
				x++;
			}
		}
		
		SatStudent[] scholars = new SatStudent[x];
		int index = 0;
		
		for (SatStudent i : group)
		{
			if (i.total() > 1900)
			{
				scholars[index] = i;
				index++;
			}
		}
		
		return scholars;
	}

	// returns a new GuidanceGroup with the SatStudents of this class combined with the SatStudents of other class
	public GuidanceGroup combineGroups(GuidanceGroup other) 
	{
		SatStudent[] combined = new SatStudent[other.getGroup().length + group.length];
		
		int x = 0;
		
		for (SatStudent i : group)
		{
			combined[x++] = i;
		}
		
		for (SatStudent i : other.getGroup())
		{
			combined[x++] = i;
		}
		
		return new GuidanceGroup(combined);
	}

	//Sorts the array of the GuidanceGroup by total score (descending)
	public void sortByTotalScore() 
	{
		for (int i = 0; i < group.length; i++)
		{
			for (int j = 0; j < group.length - 1 - i; j++)
			{
				if (group[j].total() < group[j + 1].total())
				{
					SatStudent copy = group[j];
					group[j] = group[j + 1];
					group[j + 1] = copy;
				}
			}
		}
	}
	
	//Sorts the array of the GuidanceGroup by Name (ascending (alphabetically))
	public void sortByName() 
	{
		for (int i = 0; i < group.length; i++)
		{
			for (int j = 0; j < group.length - 1 - i; j++)
			{
				if (group[j].getName().compareTo(group[j + 1].getName()) > 0)
				{
					SatStudent copy = group[j];
					group[j] = group[j + 1];
					group[j + 1] = copy;
				}
			}
		}
	}

	// this method will return the average of all of the students in the Scholarship category
	public double getScholarShipAverage() 
	{
		double count = 0;
		double total = 0;
		
		for (int i = 0; i < scholarship().length; i++)
		{
			total += scholarship()[i].total();
			count++;
		}
		
		return total / count;
	}
	
	public static void main(String[] args) 
    {	
		SatStudent[] temp = new SatStudent[12];
		
        temp[0] = (new SatStudent("Ye", 640,695,686));
        temp[1] = (new SatStudent("Bradley", 778,768,780));
        temp[2] = (new SatStudent("Chen", 687,614,705));
        temp[3] = (new SatStudent("Davis", 620,534,556));
        temp[4] = (new SatStudent("Aarons", 550,565,517));
        temp[5] = (new SatStudent("Gupta", 687,720,640));
        temp[6] = (new SatStudent("Park", 722,721,745));
        temp[7] = (new SatStudent("Kohl", 595,605,615));
        temp[8] = (new SatStudent("Mehta", 525,637,521));
        temp[9] = (new SatStudent("Bahl", 611,607,610));
        temp[10] = (new SatStudent("Smith", 670,703,610));
        temp[11] = (new SatStudent("Issacs", 670,690,710));
        
        GuidanceGroup becker = new GuidanceGroup (temp);
        System.out.println( "BECKER GROUP");
        becker.display();
          
        SatStudent[] temp2 = new SatStudent[6];

        temp2[0] = (new SatStudent("Jones", 644,695,696));
        temp2[1] = (new SatStudent("Boomer", 778,788,780));
        temp2[2] = (new SatStudent("Chung", 657,612,705));
        temp2[3] = (new SatStudent("Addams", 627,537,557));
        temp2[4] = (new SatStudent("Patel", 550,565,577));
        temp2[5] = (new SatStudent("Garcia", 687,720,645));
   
        GuidanceGroup riley = new GuidanceGroup (temp2);     
          
		GuidanceGroup comb = becker.combineGroups(riley); 
		comb.sortByName();
		System.out.println( "ALPHABETICAL LISTING");
		comb.display();
		System.out.println();   
		 	
		System.out.println( "LOWEST STUDENT: " + comb.getMin());
		System.out.println( "HIGHEST STUDENT: " + comb.getMax());
		System.out.println( "AVERAGE SCORE: " + comb.average());
		System.out.println( ); 
		System.out.println( "STUDENTS BELOW 1700");
		System.out.println( "=================="); 
		comb.below1700List();
		System.out.println( ); 
		System.out.println( "STUDENTS ABOVE 2000");
		System.out.println( "==================");
		comb.above2000List();
		System.out.println( );
		  
		comb.sortByTotalScore();
		System.out.println( "ORDERED BY TOTAL SCORE");
		comb.display();
		System.out.println( );
		  
		  
		System.out.println( "SCHOLARS");
		System.out.println( "========");
		SatStudent[] one = comb.scholarship();
		
		for(SatStudent i: one)
			System.out.println(i);
		
		System.out.println("AVERAGE SCORE OF SCHOLARS: " + comb.getScholarShipAverage()) ;
	}	
}
