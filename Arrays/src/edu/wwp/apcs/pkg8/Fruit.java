package edu.wwp.apcs.pkg8;

public class Fruit 
{
	private String[] bowl;

	public Fruit()
	{
		bowl = new String[10];
		
		bowl[0] = "apple";
		bowl[1] = "banana";
		bowl[2] = "mango";
		bowl[3] = "pineapple";
		bowl[4] = "orange";
		bowl[5] = "pear";
		bowl[6] = "strawberry";
		bowl[7] = "blueberry";
		bowl[8] = "watermelon";
		bowl[9] = "cantaloupe";
	}
	
	public void display() 
	{
        for (int i = 0; i < bowl.length; i++) 
        {
            System.out.println(bowl[i]);
        }
    }

    public void reverse() 
    {
        for (int i = bowl.length - 1; i >=0; i--) 
        {
            System.out.println(bowl[i]);
        }
    }
    
//    public boolean search()
//    {
//    	
//    }
//
//    public boolean delete (String del) 
//    {
//        int index;
//    	
//    	if(!search(del))
//        {
//        	return false;
//        }
//    	
//        else 
//        {
//            index = -1;
//        }
//    	
//        for(int i = 0; i < bowl.length; i++) 
//        {
//			if (bowl[i].equals(del))
//            {
//            	index = i;
//            }
//			
//        for(int x = index; x < bowl.length - 1; x++)
//            bowl[x] = bowl[x + 1];
//
//        String[] temp = new String[bowl.length - 1];
//
//        for(int x = 0; x < temp.length; x++)
//            temp[x] = bowl[x];
//        	bowl = temp;
//        }
//    }
	
	public static void main(String[]args)
	{
		Fruit bowl = new Fruit();
		
		bowl.display();
//		bowl.delete("pineapple");
	}
}
