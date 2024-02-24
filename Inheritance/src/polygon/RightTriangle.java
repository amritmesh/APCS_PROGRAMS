package polygon;

public class RightTriangle extends Polygon
{
	private double base;
	private double height;
	
	public RightTriangle(double myBase, double myHeight)
	{
		super(3, "Triangle");
		base = myBase;
		height = myHeight;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		return base * height / 2;
	}
	
	public double getPerimeter()
	{
		return base + height + Math.sqrt(base * base + height * height);
	}
	
	public String toString()
	{
		return super.toString() + "\nBASE: " + getBase() + "\nHEIGHT: " + getHeight();
	}
}
