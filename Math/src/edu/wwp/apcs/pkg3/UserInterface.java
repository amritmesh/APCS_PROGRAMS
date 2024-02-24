package edu.wwp.apcs.pkg3;
import java.util.Scanner;

public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("TO CREATE A TRIANGLE, PLEASE FOLLOW THE DIRECTIONS BELOW:");
		System.out.println("---------------------------------------------------------");
		
		System.out.println();
		
		System.out.print("Please enter the x-value of the first vertex: ");
		double x1 = input.nextDouble();
		System.out.print("Please enter the y-value of the first vertex: ");
		double y1 = input.nextDouble();
		
		Vertex a = new Vertex(x1, y1);
		
		System.out.println();

		System.out.print("Please enter the x-value of the second vertex: ");
		double x2 = input.nextDouble();
		System.out.print("Please enter the y-value of the second vertex: ");
		double y2 = input.nextDouble();
		
		Vertex b = new Vertex(x2, y2);
		
		System.out.println();
		
		System.out.print("Please enter the x-value of the third vertex: ");
		double x3 = input.nextDouble();
		System.out.print("Please enter the y-value of the third vertex: ");
		double y3 = input.nextDouble();
		
		Vertex c = new Vertex(x3, y3);
		
		Triangle one = new Triangle(a, b, c);
		
		System.out.println();
		
		System.out.println("TRIANGLE INFORMATION:");
		System.out.println("---------------------");
		
		System.out.println();

		System.out.println("SIDES:");
		System.out.println("------");
		
		System.out.println("Side A: " + one.sideA());
		System.out.println("Side B: " + one.sideB());
		System.out.println("Side C: " + one.sideC());
		
		System.out.println();

		System.out.println("ANGLES:");
		System.out.println("-------");
			
		System.out.println("Angle A: " + one.angleA());
		System.out.println("Angle B: " + one.angleB());
		System.out.println("Angle C: " + one.angleC());
		
		System.out.println();

		System.out.println("CALCULATONS:");
		System.out.println("------------");
				
		System.out.println("Perimeter: " + one.perimeter());
		System.out.println("Area: " + one.area());
		System.out.println("Orthocenter: " + one.orthocenter());
		System.out.println("Centroid: " + one.centroid());
		System.out.println("Circumcenter: " + one.circumcenter());
	}
}
