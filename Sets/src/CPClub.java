import java.util.HashSet;

public class CPClub
{
	HashSet<Student> club = new HashSet<Student>();
	
	public void join(Student x)
	{
		club.add(x);
	}
	
	public HashSet<Student> union(CPClub y)
	{
		HashSet<Student> union = new HashSet<Student>();

		for (Student a : club)
		{
			union.add(a);
		}
		
		for (Student b : y.getHashSet())
		{
			union.add(b);
		}
		
		return union;
	}
	
	public HashSet<Student> intersection(CPClub z)
	{
		HashSet<Student> intersection = new HashSet<Student>();
		
		for (Student a : club)
		{
			for (Student b : z.getHashSet())
			{
				if (a.getName().equals(b.getName()) && a.getId() == b.getId())
				{
					intersection.add(a);
				}
			}
		}
		
		return intersection;
	}
	
	public HashSet<Student> getHashSet()
	{
		return club;
	}

	public String toString()
	{
		return club.toString();
	}
	
	public static void main(String[] args)
	{
		CPClub conn = new CPClub();
		CPClub miller = new CPClub();

		conn.join(new Student("Aarons", 12347));
		conn.join(new Student("Daley", 3575));
		conn.join(new Student("Chen", 4356));
		miller.join(new Student("Davis", 4345));
		miller.join(new Student("Gupta", 12675));
		miller.join(new Student("Aarons", 12347));
		miller.join(new Student("Yu", 2345));
		miller.join(new Student("Daley", 3575));
		miller.join(new Student("Daley", 3575));
		System.out.println("conn");
		System.out.println(conn);
		System.out.println("miller");
		System.out.println(miller);
		System.out.println("union");
		System.out.println(conn.union(miller));
		System.out.println("");
		System.out.println("intersection");
		System.out.println(conn.intersection(miller));    
	}
}
