import java.util.Stack;

public class StackMethods2 
{
	// This  method will return the reverse of a string
	// Use a stack
	public static String reverse(String word) 
	{
		Stack<Character> x = new Stack<Character>();
		String y = "";
		
		for (int i = 0; i < word.length(); i++)
		{
			x.add(word.charAt(i));
		}

		while (!(x.isEmpty()))
		{
			y += x.pop();
		}
		
		return y;
	}
	
	// This method finds the nth term of the fibonacci sequence
	// 1,1,2,3,5,8,13
	// Use a stack
	// nthFibonacci(7) returns 13
	public static int nthFibonacci(int n) 
	{
		Stack<Integer> x = new Stack<Integer>();
		
		int n1 = 0;
		int n2 = 1;
		int fib = 0;
		
		x.push(n1);
		x.push(n2);
		
		for (int i = 0; i < n - 1; i++)
		{
		   fib = n1 + n2;
		   x.push(fib);
		   n1 = n2;
		   n2 = fib;
		}
		
		return (int)x.peek();
	}
	
	/*
	* The isValidParens() method tests if parentheses of an expression are
	* balanced. An expression is valid if the number of opening parenthesis matches
	* the number of closing parenthesis and every opener has a matching closer
	* after it. You must use a stack efficiently. examples: (do not use a counter)
	* isValidParens("(x-(y(z+4)") returns false
	* isValidParens("(3+4*(5%3))") returns true
	* isValidParens(" )3+4(") returns false
	*/
	public static boolean isValidParens(String expression) 
	{
	    Stack<Character> stackVer = new Stack<Character>();
	    
	    for (int i = 0; i < expression.length(); i++)
	    {
	        if (expression.charAt(i) == '(')
	        {
	        	stackVer.push(expression.charAt(i));
	        }
	        if (expression.charAt(i) == ')')
	        {
	            if (stackVer.isEmpty())
	            {
	                return false;
	            }
	            if (stackVer.peek() == '(' && expression.charAt(i) == ')')
	            {
	            	stackVer.pop();
	            }
	            else 
	            {
	                return false;
	            }
	        }
	    }
	    
	    return stackVer.isEmpty();
	}
	
	public static void main(String[] args) 
	{
		System.out.println(reverse("apple"));
		System.out.println();
		System.out.println(nthFibonacci(9));
		System.out.println();
		System.out.println(isValidParens("(x - (y(z + 4)"));
		System.out.println(isValidParens("(3 + 4 * (5 % 3))"));
		System.out.println(isValidParens(")3 + 4("));
	}
}
