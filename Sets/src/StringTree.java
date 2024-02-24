public class StringTree<T> extends BinarySearchTree<T>
{
	public void insert(String word)
	{
		if (getRoot()  == null)
		{
			setRoot(new TreeNode(word));
		}
		
		else
		{
			TreeNode p = null;
			TreeNode q = getRoot();
			
			while (q != null)
			{
				p = q;
				
				if (word.length() < ((String)p.getValue()).length())
				{
					q = p.getLeft();
				}
				else
				{
					q = p.getRight();
				}
			}
			
			if (word.length() < ((String)p.getValue()).length())
			{
				p.setLeft(new TreeNode(word));
			}
			else
			{
				p.setRight(new TreeNode(word));
			}
		}
	}
	
	public static void main(String[] args)
	{
		StringTree one = new StringTree();
		
		one.insert("fig");
		one.insert("apple");
		one.insert("lemon");
		one.insert("fig");
		one.insert("grape");
		one.insert("pineapple");
		one.insert("lime");
		one.insert("kiwi");

		one.inOrder();
		System.out.println();
		System.out.println("First word: " + one.first());
		System.out.println("Last word: " + one.last());
//		System.out.println("Letter Count: "  one.getLetterCount());
	}
}
