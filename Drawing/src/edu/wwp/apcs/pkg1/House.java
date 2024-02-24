package edu.wwp.apcs.pkg1;
import apcslib.DrawingTool;

public class House 
{
	public static void main(String[] args) 
	{
		DrawingTool pencil = new DrawingTool();
		pencil.up();
		
		pencil.turnRight(90);
		pencil.backward(100);
		pencil.turnLeft(90);
		pencil.forward(50);
		pencil.turnRight(90);
		
		pencil.down();
		
		pencil.forward(200);
		pencil.turnRight(90);
		pencil.forward(100);
		pencil.turnRight(90);
		pencil.forward(200);
		pencil.turnRight(90);
		pencil.forward(100);
		
		pencil.up();
		
		pencil.backward(100);
		pencil.turnRight(90);
		pencil.forward(85);
		pencil.turnLeft(90);
		
		pencil.down();
		
		pencil.forward(30);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(30);
		
		pencil.up();
		
		pencil.turn(180);
		pencil.forward(50);
		pencil.turnLeft(90);
		pencil.forward(50);
		
		pencil.down();
		
		for(int i = 0; i < 4; i++)
		{
			pencil.forward(20);
			pencil.turnRight(90);
		}
		
		pencil.up();
		
		pencil.turn(180);
		pencil.forward(80);
		
		pencil.down();
		
		for(int i = 0; i < 4; i++)
		{
			pencil.forward(20);
			pencil.turnLeft(90);
		}
		
		pencil.up();
		
		pencil.turn(180);
		pencil.forward(135);
		pencil.turnRight(90);
		pencil.forward(50);
		
		pencil.down();
		
		pencil.turnRight(70);
		pencil.forward(105);
		pencil.turnRight(39.75);
		pencil.forward(105);
	}
}