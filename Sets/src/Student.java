public class Student 
{
	String name;
	int id;
	
	public Student(String myName, int myId)
	{
		name = myName;
		id = myId;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int newId)
	{
		id = newId;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return name + " " + id;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
