public class Patient 
{
	public String name;
	public int priority;
	
	public Patient(String myName, int myPriority)
	{
		name = myName;
		priority = myPriority;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		name = newName;
	}
	
	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int newPriority)
	{
		priority = newPriority;
	}
	
	public String toString()
	{
		return "Patient: " + name + "//Priority: " + priority;
	}
}

