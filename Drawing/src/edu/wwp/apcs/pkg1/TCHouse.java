package edu.wwp.apcs.pkg1;
import apcslib.DrawingTool;

public class TCHouse
{
	public static void main(String[] args) 
	{
	    DrawingTool pencil = new DrawingTool();
	    pencil.up();
	    // position the house so it's centered
	    pencil.turnRight(90);
	    pencil.backward(100);
	    pencil.turnLeft(90);
	    pencil.forward(50);
	    pencil.turnRight(90);
	   
	    // draw the square
	    pencil.down();
	    pencil.forward(200);
	    pencil.turnRight(90);
	    pencil.forward(100);
	    pencil.turnRight(90);
	    pencil.forward(200);
	    pencil.turnRight(90);
	    pencil.forward(100);


	    // draw the roof
	    pencil.move(0, 100);
	    pencil.move(100, 50);


	    // move to draw a door centered
	    pencil.up();
	    pencil.move(15, -50);
	    pencil.setDirection(90);

	    // draw door
	    pencil.down();
	    pencil.forward(45);
	    pencil.turnLeft(90);
	    pencil.forward(30);
	    pencil.turnLeft(90);
	    pencil.forward(45);


	    // move to draw a window
	    pencil.up();
	    pencil.move(-65, 35);
	    pencil.setDirection(0);

	    // draw window
	    pencil.down();
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);


	    // move to draw a window
	    pencil.up();
	    pencil.move(35, 35);
	    pencil.setDirection(0);

	    // draw window
	    pencil.down();
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);
	    pencil.turnRight(90);
	    pencil.forward(30);
	}
}
