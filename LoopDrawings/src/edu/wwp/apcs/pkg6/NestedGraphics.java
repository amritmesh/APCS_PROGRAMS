package edu.wwp.apcs.pkg6;

import java.awt.Color;
import apcslib.DrawingTool;
import apcslib.SketchPad;

public class NestedGraphics 
{
	DrawingTool pen = new DrawingTool(new SketchPad(800, 800, 1000));

	public NestedGraphics()
	{
	}
	
	public static void main(String[] args)
	{
		NestedGraphics x = new NestedGraphics();
//		x.one();
//		x.two();
//		x.three();
//		x.four();
		x.five();
	}

	public void one() 
	{
		for(int i = 10; i <= 300; i += 20)
		{
			pen.drawOval(i, i);
		}
	}
	
	public void two() 
	{
		for(int i = 10; i <= 100; i += 20)
		{
			for(int j = 10; j <= 100; j += 20)
			{
				pen.up();
				pen.move(i, j);
				pen.down();
				pen.drawRect(10, 10);
			}
		}
	}
	
	public void three() 
	{
		for(int i = 400; i >= 40; i -= 40)
		{
			if(i % 80 == 0)
			{
				pen.setColor(Color.RED);
			}
			
			else
			{
				pen.setColor(Color.BLACK);
			}
			
			pen.fillRect(i, i);
		}
	}
	
	public void four()
	{
		for(int i = 1; i <= 96; i += 4)
		{
			for(int j = i; j < i + 4; j++)
			{
				pen.forward(2 * j);
				pen.turnRight(90);
			}
		}
	}
	
	public void five()
	{
		int d = 600;
		
		for(int i = 0; i <= 400; i += 20)
		{
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			Color random = new Color(r, g, b);
			pen.setColor(random);
			pen.up();
			pen.move(i, -i);
			pen.down();
			pen.fillOval(d, d);
			d -= 40;
		}
	}
}