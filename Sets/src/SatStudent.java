public class SatStudent implements Comparable<SatStudent>
{
	String name;
	int math;
	int verbal;
	int writing;
	
	public SatStudent(String myName, int myMath, int myVerbal, int myWriting)
	{
		name = myName;
		math = myMath;
		verbal = myVerbal;
		writing = myWriting;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getMath() 
	{
		return math;
	}

	public void setMath(int math) 
	{
		this.math = math;
	}

	public int getVerbal() 
	{
		return verbal;
	}

	public void setVerbal(int verbal) 
	{
		this.verbal = verbal;
	}

	public int getWriting() 
	{
		return writing;
	}

	public void setWriting(int writing) 
	{
		this.writing = writing;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + verbal;
		result = prime * result + writing;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SatStudent other = (SatStudent) obj;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (verbal != other.verbal)
			return false;
		if (writing != other.writing)
			return false;
		return true;
	}

	public int compareTo(SatStudent other)
	{
		if ((math + verbal + writing) > (other.getMath() + other.getVerbal() + other.getWriting()))
		{
			return +1;
		}
		else if ((math + verbal + writing) < (other.getMath() + other.getVerbal() + other.getWriting()))
		{
			return -1;
		}
		else
		{
			return this.getName().compareTo(other.getName());
		}		
	}

	public String toString() 
	{
		return name + " " + (math + verbal + writing);	
	}
}
