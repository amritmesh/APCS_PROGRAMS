public class BalancedTree 
{
	public static TreeNode balance(int arr[])
	{
		return balance(arr, 0, arr.length - 1);
	}
	
	public static TreeNode balance(int arr[], int start, int end)
	{
		if (start > end)
		{
			return null;
		}
		
		int mid = start + (end - start) / 2;
		
		TreeNode node = new TreeNode(arr[mid]);
				
		node.setLeft(balance(arr, start, mid - 1));
		node.setRight(balance(arr, mid + 1, end));
		return node;
	}
	
	public static void main(String[] args)
	{
		int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		TreeNode root = balance(data);
		BinarySearchTree x = new BinarySearchTree();
		x.setRoot(root);
		x.inOrder();
		System.out.println("Right Branch");
		
		while (root != null)
		{
			System.out.print(root + " ");
			root = root.getRight();
		}
	}
}
