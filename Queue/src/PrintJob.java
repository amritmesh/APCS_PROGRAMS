import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class PrintJob 
{      
    String user;
    LocalDateTime time;
    private static int printCount = 0;
       
	public PrintJob(String name)
	{
		user = name;
		time = LocalDateTime.now();
		printCount++;    
	}
	       
	public static int getPrintCount() 
	{
		return printCount;
	}
	
	public String getUser() 
	{
	    return user;
	}
	
	public void setUser(String user) 
	{
	    this.user = user;
	}
	
	public LocalDateTime getTime() 
	{
	    return time;
	}
	
	public String toString()
	{
	    return user + " " + time;
	}
	       
	public static void main(String[] args) 
	{
		PrintJob x = new PrintJob("Connolly");
		System.out.println(x);
	}
}
