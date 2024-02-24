package edu.wwp.apcs.pkg1;
import java.awt.Color;
import apcslib.DrawingTool;
import apcslib.SketchPad;

public class Rose 
{
	public static void main(String[] args)
	{
		DrawingTool pen = new DrawingTool(new SketchPad(1024, 768));
		pen.setWidth(15);
		pen.setColor(Color.green);
		for (int i = 1; i <= 600; i += 1) 
		{
			pen.move(i);
			pen.turnRight(91);
			int g = (int) (Math.random() * 256);
			pen.setColor(new Color(0, g, 0));
		}

		pen.up();
		pen.home();
		pen.down();
		
		for (int i = 1; i <= 255; i += 1) 
		{
			pen.move(i);
			pen.turnRight(61);
			int r = (int) (Math.random() * 256);
			pen.setColor(new Color(r, 0, 0));
		}

		pen.up();
		pen.home();
		pen.down();
		
		for (int i = 1; i <= 200; i += 1)
		// tc.moveTo(150,150);
		{
			pen.move(i);
			pen.turnLeft(73);
			int r = (int) (Math.random() * 256);
			pen.setColor(new Color(r, 0, 0));
		}
	}
}
