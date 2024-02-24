public abstract class BinaryTree<T>
{   
	TreeNode root;
	
	public BinaryTree()
	{
	    root = null;
	}
	
	public void setRoot( TreeNode theNewNode)
	{
	    root = theNewNode;
	}
	
	public TreeNode getRoot()
	{
		return root;
	}
	
	boolean isEmpty()
	{
	    return (root == null);
	}
	
	public abstract void insert(Comparable<T> item);
	
	public abstract TreeNode find(Comparable<T> key);
}
