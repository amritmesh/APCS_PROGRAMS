package edu.wwp.apcs.pkg1;
import java.awt.Color;

import apcslib.DrawingTool;
import apcslib.SketchPad; 

public class CustomPic 
{
	public static void main(String[] args) 
	{
		SketchPad poster = new SketchPad(600, 600);
		DrawingTool pencil = new DrawingTool(poster);
		pencil.up();
		pencil.move(0, 0);
		pencil.setColor(Color.GREEN);
		pencil.down();
		
		
		for(int i = 0; i < 25; i++)
		{
			pencil.drawCircle(i);
		}
		
		pencil.setColor(Color.BLUE);

		for(int i = 26; i < 50; i++)
		{
			pencil.drawCircle(i);
		}
		
		pencil.setColor(Color.RED);

		for(int i = 51; i < 75; i++)
		{
			pencil.drawCircle(i);
		}
		
		pencil.setColor(Color.YELLOW);

		for(int i = 76; i < 100; i++)
		{
			pencil.drawCircle(i);
		}
		
		pencil.setColor(Color.ORANGE);

		for(int i = 101; i < 125; i++)
		{
			pencil.drawCircle(i);
		}
		
		pencil.setColor(Color.PINK);

		for(int i = 126; i < 150; i++)
		{
			pencil.drawCircle(i);
		}
	}
}
