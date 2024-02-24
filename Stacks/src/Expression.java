import java.util.Scanner;
import java.util.Stack;

public class Expression 
{
	private Stack<Double> numbers;
	private Stack<Character> operators;
	
	public Expression()
	{
		numbers = new Stack<Double>();
		operators = new Stack<Character>();
	}

	// uses the character to perform the operation	 
	double evaluate(char x)
	{
		double a = numbers.pop();
		double b = numbers.pop();
	
		switch (x)
		{
			case '+':
			{
				return b + a;
			}	
			case '-':
			{
				return b - a;
			}				
			case '*':
			{
				return b * a;
			}	
			case '/':
			{
				return (Double)b / (Double)a;
			}	
			case '^':
			{
				return Math.pow(a, b);
			}
			default:
			{
				return -11;
			}
		}
	}
	
	//returns an int to check order of operations
	public int getPriority(char x) 
	{
		if (x == '^')
		{
			return 1;
		}
		else if (x == '-' || x == '+')
		{
			return 3;
		}
		else if (x == '/' || x == '*')
		{
			return 2;
		}
		else
		{
			return -1;
		}
	}	
			
	//adds the operator to the stack or evaluates operation on top of stack
	public void changeStack(char x)
	{
		if (operators.isEmpty())
		{
			operators.push(x);
		}
		
		else if (getPriority(x) < getPriority((operators.peek())))
		{
			operators.push(x);
		}
		
		else
		{
			numbers.push(evaluate(operators.pop()));
			changeStack(x);
		}
	}

	public double evaluateExpression(String exp)
	{
		Scanner s = new Scanner(exp);//.useDelimiter("\\s* \\s*");
		
	    // Load first 3 elements from expression
	    numbers.push(s.nextDouble());
	    operators.push(s.next().charAt(0));
	    numbers.push(s.nextDouble());
	    
	    //empty the string
	    while(s.hasNext())
	    {
		    changeStack(s.next().charAt(0));
		    numbers.push(s.nextDouble());
	    }
	    
	    //empty the stacks to evaluate
		while (!operators.isEmpty())
		{
			numbers.push(evaluate(operators.pop()));
		}
		
		return numbers.pop();
	}

	// @param args
	public static void main(String[] args) 
	{
		Expression ar = new Expression();
		
		System.out.println(ar.evaluateExpression(" 13 * 4"));
		System.out.println(ar.evaluateExpression(" 3 * 4 ^ 2 + 5"));
		System.out.println(ar.evaluateExpression(" 2 - 10 - 3 * 2 - 5"));
		System.out.println(ar.evaluateExpression(" 2 ^ 3 - 3 * 2 - 5 + 7"));
		System.out.println(ar.evaluateExpression(" 4 + 3 * 2 + 3 ^ 2 - 7"));
//		System.out.println(Integer.parseInt("+"));
	}
}
