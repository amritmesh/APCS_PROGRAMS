//Here is a class with examples of trees/maps
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExamples 
{
	public static void hashSet()
    {
        Set<String> colors = new HashSet<String>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("Magenta");
        colors.add("Pink");
        colors.add("Pink");
        System.out.println(colors);    
    }
	
    public static void treeSet()
    {
        TreeSet<String> colors = new TreeSet<String>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("Magenta");
        colors.add("Magenta");
        colors.add("Pink");
        System.out.println(colors);    
        System.out.println("First: "+ colors.first());
        System.out.println("Last: "+ colors.last());
    }  

    public static void hashMap() 
    {
    	//Create HashMap
    	Map<String , String> studentGrades = new HashMap<String, String>();
        //Add Key/Value pairs
        studentGrades.put("Alvin", "A+");
        studentGrades.put("Alan", "A");
        studentGrades.put("Becca", "A-");
        studentGrades.put("Sheila", "B+");
        //find element using key
        System.out.println("Becca's Marks:: " + studentGrades.get("Becca"));  
        //remove element
        //studentGrades.remove("Becca");
        //Iterate over HashMap
        for(String key: studentGrades.keySet())
        {
        	System.out.println(key  +" : "+ studentGrades.get(key));
        }
    }
    
    public static void treeMap() 
    {
        //Create HashMap
        TreeMap<String , String> studentGrades = new TreeMap<String, String>();
         
        //Add Key/Value pairs
     
        studentGrades.put("Alan", "A");
        studentGrades.put("Becca", "A-");
        studentGrades.put("Sheila", "B+");
        studentGrades.put("Alvin", "A+");
        //find element using key
        //System.out.println("Becca's Marks:: "+studentGrades.get("Becca"));
        //remove element
        //studentGrades.remove("Becca");
       
        //Iterate over HashMap
        for(String key: studentGrades.keySet())
        {
            System.out.println(key  +" :: "+ studentGrades.get(key));
        }
        
        System.out.println("First Student: " +studentGrades.firstEntry());
    }
       
	public static void main(String[] args) 
	{            
		System.out.println("HashSet");
		hashSet();  
		System.out.println();
		System.out.println("TreeSet");
		treeSet();  
		
		System.out.println("HashMap");
		hashMap();
		System.out.println();
		System.out.println("TreeMap");
		treeMap();
		System.out.println();      
	}
}
