public class BinarySearchTree<T> extends BinaryTree<T>
{
	public void insert(Comparable<T> item)
	{
		if (getRoot() == null)
		{
			setRoot(new TreeNode(item));
		}
		else
		{
			TreeNode p = null;
			TreeNode q = getRoot();
			
			while (q != null)
			{
				p = q;
				if (item.compareTo((T)p.getValue()) < 0)
				{
					q = p.getLeft();
				}
				else
				{
					q = p.getRight();
				}
			}
			
			if (item.compareTo((T)p.getValue()) < 0)
			{
				p.setLeft(new TreeNode(item));
			}
			else
			{
				p.setRight(new TreeNode(item));
			}
		}
	}
	
	public TreeNode find(Comparable<T> key)
	{
		TreeNode p = getRoot();
		
		while (p != null && key.compareTo((T) p.getValue()) != 0)
		{
			if (key.compareTo((T) p.getValue()) < 0)
			{
				p = p.getLeft();
			}
			else
			{
				p = p.getRight();
			}
		}
		
		return p;
	}
	
	public TreeNode first()
	{
		return first(root);
	}
	
	private TreeNode first(TreeNode tree)
	{
		while(tree.getLeft() != null) 
		{
			tree = tree.getLeft();
		}
		
		return tree;
	}
	
	public TreeNode firstR()
	{
		return firstR(root);
	}
	
	private TreeNode firstR(TreeNode tree)
	{
		if (tree.getLeft() == null)
		{
			return tree;
		}
		
		else return firstR(tree.getLeft());
	}
	
	public TreeNode last()
	{
		return last(root);
	}
	
	private TreeNode last(TreeNode tree)
	{
		while(tree.getRight() != null) 
		{
			tree = tree.getRight();
		}
		
		return tree;
	}
	
	public void inOrder()
	{
		inOrder(getRoot());
	}
	
	public void inOrder(TreeNode root)
	{
		if (root != null) 
		{
			inOrder(root.getLeft());
			System.out.println(root.getValue());
			inOrder(root.getRight());
		}
	}
	
	public static void main(String[] args)
	{
		BinarySearchTree<String> one = new BinarySearchTree<String>();
		
		one.insert("fig");
		one.insert("apple");
		one.insert("aadvark");
		one.insert("lemon");
		one.insert("grape");
		one.insert("blueberry");
		one.insert("pineapple");
		one.insert("lime");
		one.insert("kiwi");
		one.insert("pear");
		one.insert("date");
		System.out.println("contains orange? " + one.find("orange"));
		System.out.println("contains kiwi? " + one.find("kiwi"));
		System.out.println("First Alphabetically " + one.first());
		System.out.println("First Recursively " + one.firstR());
		System.out.println("Last Alphabetically " + one.last());
		one.inOrder();
	}
}
