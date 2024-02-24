public class IntegerTree<T> extends BinarySearchTree<T>
{
	public int treeSum()
	{
		return treeSum(root);
	}
	
	private int treeSum(TreeNode node)
	{
		if (node == null)
		{
			return 0;
		}

		return ((Integer)node.getValue()) + treeSum(node.getLeft()) + treeSum(node.getRight());
	}
	
	public int countNodes()
	{
		return countNodes(root);
	}
	
	private int countNodes(TreeNode node)
	{
		if (node == null)
		{
			return 0;
		}

		return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
	}
	
	public int height()
	{
		return height(root);
	}
	
	private int height(TreeNode tree)
	{
		if (getRoot() == null)
		{
			return 0;
		}

		else if (tree == null)
		{
			return -1;
		}
		
		return 1 + Math.max(height(tree.getLeft()), height(tree.getRight()));
	}
	
	public int treeAverage()
	{
		return treeAverage(root);
	}
	
	private int treeAverage(TreeNode node)
	{
		return treeSum(node) / countNodes(node);
	}
	
	public static void main(String[] args)
	{
		IntegerTree<Integer> t = new IntegerTree<Integer>();
		
		t.insert(2);
		t.insert(5);
		t.insert(3);
		t.insert(4);
		t.insert(11);
		t.insert(9);
		t.insert(7);
		t.insert(12);
		t.insert(19);
		t.inOrder();
		
		System.out.println();
		System.out.println("Sum: ");
		System.out.println(t.treeSum());
		
		System.out.println();
		System.out.println("COUNT: ");
		System.out.println(t.countNodes());
		
		System.out.println();
		System.out.println("Max Value: ");
		System.out.println(t.last());
		
		System.out.println();
		System.out.println("Average: ");
		System.out.println(t.treeAverage());
		
		System.out.println();
		System.out.println("Height: ");
		System.out.println(t.height());
	}
}
