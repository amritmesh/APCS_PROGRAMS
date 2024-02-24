package polygon;
import java.util.ArrayList;

public class PolygonTester 
{
	public static void main(String[] args)
	{
		ArrayList<Polygon> shapes = new ArrayList<Polygon>();
		
		shapes.add(new Rectangle(4, 7));
		shapes.add(new Square(11));
		shapes.add(new RightTriangle(3, 5));
		shapes.add(new RegularNgon(6, 5));

		double total = 0;
		
		for (Polygon i : shapes)
		{
			System.out.println(i);
			total += i.getArea();
		}
		
		System.out.println("Total Area: " + total);
	}
}
