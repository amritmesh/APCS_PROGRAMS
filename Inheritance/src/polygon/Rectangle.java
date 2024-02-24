package polygon;

public class Rectangle extends Polygon
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		super(4, "Rectangle");
		length = 7;
		width = 8;
	}
	
	public Rectangle(double myLength, double myWidth)
	{
		super(4, "Reactangle");
		length = myLength;
		width = myWidth;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return 2*length + 2*width;
	}
	
	public String toString()
	{
		return super.toString() + "\nLENGTH: " + getLength() + "\nWIDTH: " + getWidth();
	}
}
