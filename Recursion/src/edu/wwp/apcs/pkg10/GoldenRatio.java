package edu.wwp.apcs.pkg10;

public class GoldenRatio 
{
    public static double calculateGR(double x) 
    {
        if (x == 0)
        {
        	return 1;
        }
        
        return 1.0 + 1.0 / calculateGR(x - 1.0);
    }
    
    public static void main(String[] args)
    {
    	System.out.println(calculateGR(10));
    }
}
