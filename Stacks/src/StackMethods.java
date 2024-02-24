import java.util.Stack;
import java.util.ListIterator;

public class StackMethods 
{
	public Stack<String> reverse(Stack<String> x)
	{
		Stack<String> originalX = new Stack<String>();
		ListIterator<String> xIter = x.listIterator();
		
		while (xIter.hasNext())
		{
			originalX.push(xIter.next());
		}
		
		Stack<String> y = new Stack<String>();
		
		while (!(originalX.isEmpty()))
		{
			y.push(originalX.pop());
		}
		
		return y;
	}
	
	public Stack<String> combine(Stack<String> x, Stack<String> y)
	{
		Stack<String> newY = reverse(y);
		
		while (!(newY.isEmpty()))
		{
			x.push(newY.pop());
		}
		
		return x;
	}
	
	public Stack<String> alternate(Stack<String> x, Stack<String> y)
	{
		Stack<String> temp = new Stack<String>();
		
		Stack<String> xTemp = reverse(x);
		Stack<String> yTemp = reverse(y);

		while(!(xTemp.isEmpty()) || (!yTemp.isEmpty()))
		{
			if (!xTemp.isEmpty())
			{
				temp.push(xTemp.pop());
			}
			if (!yTemp.isEmpty())
			{
				temp.push(yTemp.pop());
			}	
		}
		
		return temp;
	}
	
	public Stack<String> removeEveryOther(Stack<String> one)
	{
//		Stack<String> temp = reverse(one);
//		System.out.println(temp);
//		Stack<String> result = new Stack<String>();
//		int indicator = 0;
//		
//		while (!(temp.isEmpty()))
//		{
//			indicator++;
//			
//			if (indicator % 2 != 0)
//			{
//				result.push(temp.pop());
//			}
//			
//			temp.pop();
//		}
//		
//		return result;
		
		ListIterator<String> x = one.listIterator();
		
		while (x.hasNext())
		{
			x.next();
			x.remove();
			
			if (x.hasNext())
			{
				x.next();
			}
		}
		
		return one;
	}
	
	public double getAverage(Stack<Integer> one)
	{
		double sum = 0;
		double numValues = one.size();
		
		while (!(one.isEmpty()))
		{
			sum += one.pop();
		}
		
		return sum / numValues;
	}
	
	public boolean isPalindrome(Stack<String> one)
	{		
		Stack<String> temp = reverse(one);
		
		while (!(temp.isEmpty()))
		{
			String tempVal = temp.pop();
			String oneVal = one.pop();
			
			if (!(tempVal.equals(oneVal)))
			{
				return false;
		    }
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		StackMethods ar = new StackMethods();
		
		Stack<String> stackToBeReversed = new Stack<String>();
		stackToBeReversed.push("a");
		stackToBeReversed.push("b");
		stackToBeReversed.push("c");
		stackToBeReversed.push("d");
		stackToBeReversed.push("e");
		stackToBeReversed.push("f");
		
		System.out.println(stackToBeReversed);
		System.out.println(ar.reverse(stackToBeReversed));
		System.out.println();
		
		Stack<String> stackOneToBeCombined = new Stack<String>();
		stackOneToBeCombined.push("a");
		stackOneToBeCombined.push("b");
		stackOneToBeCombined.push("c");
		stackOneToBeCombined.push("d");
		stackOneToBeCombined.push("e");
		stackOneToBeCombined.push("f");
		
		Stack<String> stackTwoToBeCombined = new Stack<String>();
		stackTwoToBeCombined.push("g");
		stackTwoToBeCombined.push("h");
		stackTwoToBeCombined.push("i");
		stackTwoToBeCombined.push("j");
		stackTwoToBeCombined.push("k");
		stackTwoToBeCombined.push("l");
		
		System.out.println(stackOneToBeCombined);
		System.out.println(stackTwoToBeCombined);
		System.out.println(ar.combine(stackOneToBeCombined, stackTwoToBeCombined));
		
		Stack<String> stackOneToAlternate = new Stack<String>();
		stackOneToAlternate.push("a");
		stackOneToAlternate.push("b");
		stackOneToAlternate.push("c");
		stackOneToAlternate.push("d");
		stackOneToAlternate.push("e");
		stackOneToAlternate.push("f");
		
		Stack<String> stackTwoToAlternate = new Stack<String>();
		stackTwoToAlternate.push("g");
		stackTwoToAlternate.push("h");
		stackTwoToAlternate.push("i");
		stackTwoToAlternate.push("j");
		stackTwoToAlternate.push("k");
		stackTwoToAlternate.push("l");
		
		System.out.println();
		System.out.println(stackOneToAlternate);
		System.out.println(stackTwoToAlternate);
		System.out.println(ar.alternate(stackOneToAlternate, stackTwoToAlternate));

		Stack<String> stackToRemoveEveryOther = new Stack<String>();
		stackToRemoveEveryOther.push("a");
		stackToRemoveEveryOther.push("b");
		stackToRemoveEveryOther.push("c");
		stackToRemoveEveryOther.push("d");
		stackToRemoveEveryOther.push("e");
		stackToRemoveEveryOther.push("f");
		
		System.out.println();
		System.out.println(stackToRemoveEveryOther);
		System.out.println(ar.removeEveryOther(stackToRemoveEveryOther));
		
		Stack<Integer> stackToFindAverage = new Stack<Integer>();
		stackToFindAverage.push(1);
		stackToFindAverage.push(2);
		stackToFindAverage.push(3);
		stackToFindAverage.push(4);
		stackToFindAverage.push(5);
		stackToFindAverage.push(6);
		
		System.out.println();
		System.out.println(stackToFindAverage);
		System.out.println(ar.getAverage(stackToFindAverage));
		
		Stack<String> stackToCheckIfPalindrome = new Stack<String>();
		stackToCheckIfPalindrome.push("a");
		stackToCheckIfPalindrome.push("b");
		stackToCheckIfPalindrome.push("c");
		stackToCheckIfPalindrome.push("d");
		stackToCheckIfPalindrome.push("c");
		stackToCheckIfPalindrome.push("b");
		stackToCheckIfPalindrome.push("a");
		
		System.out.println();
		System.out.println(stackToCheckIfPalindrome);
		System.out.println(ar.isPalindrome(stackToCheckIfPalindrome));
	}
}
