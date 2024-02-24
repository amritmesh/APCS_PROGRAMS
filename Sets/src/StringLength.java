import java.util.Comparator;

public class StringLength implements Comparator<String>
{
	public int compare(String x, String y)
	{
		if (x.length() == y.length()) 
		{
			return x.compareTo(y);
		}
		
		return y.length() - x.length();
	}
}
