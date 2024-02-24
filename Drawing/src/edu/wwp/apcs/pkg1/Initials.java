package edu.wwp.apcs.pkg1;
import apcslib.DrawingTool;

public class Initials 
{
	public static void main(String[] args) 
	{
		DrawingTool pencil = new DrawingTool();
		
		pencil.up();
		
		pencil.turnLeft(90);
		pencil.forward(75);
		
		pencil.down();
		pencil.turnRight(120);
		pencil.move(60);
		pencil.turnRight(120);
		pencil.move(60);
		pencil.turn(180);
		pencil.move(30);
		pencil.turnLeft(60);
		pencil.move(30);
		
		pencil.up();
		pencil.turn(180);
		pencil.move(30);
		pencil.turnRight(80);
		pencil.move(30);
		pencil.turnLeft(90);
		pencil.move(25);
		
		pencil.down();
		pencil.turnLeft(80);
		pencil.move(53);
		pencil.turnRight(90);
		pencil.move(30);
		pencil.turnRight(90);
		pencil.move(30);
		pencil.turnRight(90);
		pencil.move(30);
		
		pencil.turn(180);
		pencil.turnRight(38);
		pencil.move(37.5);

	}
}
