//import java.util.Arrays;
//
//public class MorseTree 
//{
//	BinarySearchTree data;
//	String letters = "0_9O .8M Q G Z7T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5";
//	
//	public MorseTree()
//	{
//		char[] arr = letters.toCharArray();
//		data = new BinarySearchTree();
//		data.setRoot(balance(arr));
//	}
//	
//	public static TreeNode balance(char arr[], int start, int end)
//	{
//		if (start > end)
//		{
//			return null;
//		}
//		
//		int mid = start + (end - start) / 2;
//		
//		TreeNode node = new TreeNode(new Morse(mid, arr[mid]));
//				
//		node.setLeft(balance(arr, start, mid - 1));
//		node.setRight(balance(arr, mid + 1, end));
//		
//		return node;
//	}
//	
//	public static TreeNode balance(char arr[])
//	{
//		return balance(arr, 0, arr.length - 1);
//	}
//	
//	public String translateToMorse()
//	{
//		
//	}
//	
//	public String translateToString()
//	{
//		String word;
//		word.getValue();
//		
//		return ((Morse)t.getValue()).getLetter());
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		BinarySearchTree data = new BinarySearchTree();
//		
//		System.out.println(data.translateToEnglish("--- --.. .."));
//		System.out.println(data.translateToMorse("SOS SOS"));
//	}
//}
