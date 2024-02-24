public class PhoneEntry
{
	String initial;
	String name;
	String number;
	
	public PhoneEntry(String myInitial, String myName, String myNumber)
	{
		initial = myInitial;
		name = myName;
		number = myNumber;
	}

	public String getInitial() 
	{
		return initial;
	}

	public void setInitial(String newInitial) 
	{
		initial = newInitial;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String newName) 
	{
		name = newName;
	}

	public String getNumber() 
	{
		return number;
	}

	public void setNumber(String newNumber) 
	{
		number = newNumber;
	}

	public int compareTo(PhoneEntry other)
	{
		if (name.contentEquals(other.getName()))
		{
			return initial.compareTo(other.getInitial());
		}
		
		return name.compareTo(other.getName());
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((initial == null) ? 0 : initial.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		PhoneEntry other = (PhoneEntry) obj;
		if (initial == null) {
			if (other.initial != null)
				return false;
		} else if (!initial.equals(other.initial))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return name + " " + initial + ". " + number;
	}
}
