package edu.wwp.apcs.pkg3;

public class Vertex 
{
	private double x;
	private double y;
	
	public Vertex()
	{
		x = 4;
		y = 6;
	}
	
	public Vertex(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public static double length(Vertex a, Vertex b)
	{
		return Math.sqrt(Math.pow((b.getY() - a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2));
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public static void main(String[] args)
	{
		Vertex a = new Vertex(3, 5);
		System.out.println("Vertex a: " + a);
		Vertex b = new Vertex(-11, -7);
		System.out.println("Vertex b: " + b);
		System.out.println("Length: " + Vertex.length(a, b));
	}
}
