package edu.wwp.apcs.pkg3;

public class Triangle 
{
	Vertex a, b, c;
	
	public Triangle()
	{
		a = new Vertex(0.5, 1);
		b = new Vertex(0, 3.2);
		c = new Vertex(5.0, 2.0);
	}
	
	public Triangle(Vertex x, Vertex y, Vertex z)
	{
		a = x;
		b = y;
		c = z;
	}
	
	public Vertex getA()
	{
		return a;
	}
	
	public Vertex getB()
	{
		return b;
	}
	
	public Vertex getC()
	{
		return c;
	}
	
	public double sideA()
	{
		return Vertex.length(b, c);
	}
	
	public double sideB()
	{
		return Vertex.length(a, c);
	}
	
	public double sideC()
	{
		return Vertex.length(a, b);
	}
	
	public double angleA()
	{
		return Math.toDegrees(Math.acos((Math.pow(sideB(), 2) + Math.pow(sideC(), 2) - 
				Math.pow(sideA(), 2))/(2 * sideB() * sideC())));
	}
	
	public double angleB() 
	{
		return Math.toDegrees(Math.acos((Math.pow(sideC(), 2) + Math.pow(sideA(), 2) - 
				Math.pow(sideB(), 2))/(2 * sideC() * sideA())));
	}
	
	public double angleC() 
	{
		return Math.toDegrees(Math.acos((Math.pow(sideA(), 2) + Math.pow(sideB(), 2) - 
				Math.pow(sideC(), 2))/(2 * sideA() * sideB())));
	}
	
	public double slope1()
	{
		return (a.getY() - b.getY()) / (a.getX() - b.getX());
	}
	
	public double slope2()
	{
		return (a.getY() - c.getY()) / (a.getX() - c.getX());
	}
	
	public double slope3()
	{
		return (c.getY() - b.getY()) / (c.getX() - b.getX());
	}
	
	public Vertex orthocenter()
	{
		double firstPerp = -1 * (1 / slope1());
		double secondPerp = -1 * (1 / slope2());
		
		double xVal = (firstPerp * c.getX() - secondPerp * b.getX() + b.getY() - c.getY()) /
				(firstPerp - secondPerp);
		
		Vertex oc = new Vertex(xVal, secondPerp * (xVal - b.getX()) + b.getY());
		
		return oc;
	}
	
	public Vertex centroid()
	{
		Vertex cr = new Vertex((a.getX() + b.getX() + c.getX()) / 3.0, 
				(a.getY() + b.getY() + c.getY()) / 3.0);
		
		return cr;
	}
	
	public Vertex circumcenter()
	{
		double firstPerp = -1.0 * (1.0 / slope1());
		double secondPerp = -1.0 * (1.0 / slope2());
		
		double midpoint1x = ((a.getX() + b.getX()) / 2.0);
		double midpoint2x = ((a.getX() + c.getX()) / 2.0);
		double midpoint1y = ((a.getY() + b.getY()) / 2.0);
		double midpoint2y = ((a.getY() + c.getY()) / 2.0);
		
		double xVal = (firstPerp * midpoint1x - midpoint1y - secondPerp * midpoint2x + midpoint2y) /
				(firstPerp - secondPerp);
		
		Vertex cc = new Vertex(xVal, firstPerp * (xVal - midpoint1x) + midpoint1y);
		
		return cc;
	}
	
	public double perimeter()
	{
		return (sideA() + sideB() + sideC()); 
	}
	
	public double area() 
	{
		double s = (double)(sideA() + sideB() + sideC()) / 2.0;
		return Math.sqrt(s * (s - sideA()) * (s - sideB()) * (s - sideC()));
	}
}
