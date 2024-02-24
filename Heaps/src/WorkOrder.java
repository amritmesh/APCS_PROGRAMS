public class WorkOrder implements Comparable<WorkOrder>
{
	int num;
	String task;
	
	public WorkOrder(int myNum, String myTask)
	{
		num = myNum;
		task = myTask;
	}
	
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getTask() 
	{
		return task;
	}

	public void setTask(String task) 
	{
		this.task = task;
	}

	public int compareTo(WorkOrder x)
	{
		if (this.getNum() > x.getNum()) 
		{
			return 1;
		}
		else if (this.getNum() == x.getNum()) 
		{
			return 0;
		}

		return -1;
	}

	public String toString() 
	{
		return "priority = " + num + ", " + task;
	}
}
