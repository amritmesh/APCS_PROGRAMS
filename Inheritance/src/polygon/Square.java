package polygon;

public class Square extends Rectangle
{
	public Square()
	{
		super(4, 4);
	}
	
	public Square(double side)
	{
		super(side, side);
		setType("Square");
	}
	
	public static void main(String[] args)
	{
		Square a = new Square(15);
		System.out.println(a);
	}
}
