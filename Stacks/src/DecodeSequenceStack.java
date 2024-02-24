import java.util.Stack;

public class DecodeSequenceStack 
{
	public DecodeSequenceStack() {}
	
	public static String decode(String seq)
	{
		String x = "";
		Stack<Integer> y = new Stack<Integer>();
		
		if (seq.length() == 0)
		{
			return seq;
		}
		
		for (int i = 0; i <= seq.length(); i++)
		{
			y.push(i + 1);
			
			if (i == seq.length() || seq.charAt(i) == 'I')
			{
				while(!y.isEmpty())
				{
					x = x + y.pop();
				}
			}
		}
		
		return x;
	}
	
	public static void main(String[] args)
	{
		DecodeSequenceStack z = new DecodeSequenceStack();
		
		System.out.println(decode("IIDDIDID"));
		System.out.println(decode("IDIDII"));
		System.out.println(decode("DDDD"));
		System.out.println(decode("IIII"));
	}
}

