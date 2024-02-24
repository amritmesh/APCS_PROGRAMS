package polygon;

public class RegularNgon extends Polygon
{
	private double sideLength;
	
	public RegularNgon(int mySide, double myLength)
	{
		super(mySide, "Regular " + mySide + "-Gon");
		sideLength = myLength;
	}
	
	public double getPerimeter()
	{
		return getSides() * sideLength;
	}
	
	public double getArea()
	{
		int n = getSides();
		return (sideLength * sideLength * n) / (4 * Math.tan(Math.PI/n));
	}
	
	public double getSideLength()
	{
		return sideLength;
	}
	
	public String toString()
	{
		return super.toString() + "\nLENGTH: " + getSideLength();
	}
}
