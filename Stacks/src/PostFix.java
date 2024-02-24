import java.util.Stack;

public class PostFix 
{	
	//calc(5,7,'-') returns -2
	public static double calc(double one, double two, char op) 
	{
		switch(op)
		{
			case '+':
			{
				return one + two;
			}	
			case '-':
			{
				return one - two;
			}				
			case '*':
			{
				return one * two;
			}	
			case '/':
			{
				return one / two;
			}	
			default:
			{
				return -11;
			}
		}
	}
	
	/**
	* @param expr==> postfix expression with single digits and +,-,*,/ as a String 
	* @return  calculated value of the expression as a double
	*/
	public static double calculate(String expr) 
	{
		Stack<Double> x = new Stack<Double>();
		
		for (int i = 0; i < expr.length(); i++)
		{
			char y = expr.charAt(i);
			
			if (Character.isDigit(y))
			{
				x.push(1.0 * Character.getNumericValue(y));
			}
			else
			{
				double w = x.pop();
				double z = x.pop();
				
				if (y == '+')
				{
					x.push(z + w);
				}	
				else if (y == '-')
				{
					x.push(z - w);
				}				
				else if (y == '*')
				{
					x.push(z * w);
				}	
				else if (y == '/')
				{
					x.push(z / w);
				}	
			}
		}
		
		return x.pop();
	}

	public static void main(String[] args) 
	{
		System.out.println(calculate("57+"));  //12
		System.out.println(calculate("27+12++")); //12
		System.out.println(calculate("55+2*4/9+"));	//14
		System.out.println(calc(5, 7, '-'));	//-2
	}
}
