package edu.wwp.apcs.pkg6;

import java.awt.Color;
import apcslib.DrawingTool;
import apcslib.SketchPad;

public class OpticalIllusions 
{	
	public OpticalIllusions()
	{
	}

	public void grid()
	{	
		DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
		
		pen.setColor(Color.BLACK);
		pen.fillRect(500, 500);
		pen.setColor(Color.WHITE);
		
		for(int i = 200; i >= -200; i -= 40)
		{
			pen.up();
			pen.move(0, i);
			pen.down();
			pen.fillRect(400,  10);
		}
		
		for(int j = 200; j >= -200; j -= 40)
		{
			pen.up();
			pen.move(j, 0);
			pen.down();
			pen.fillRect(10,  400);
		}
	}
	
	public void zigzag()
	{		
		DrawingTool pen = new DrawingTool(new SketchPad(600, 480, 144));
		
		final int OFFSET = 12;
		final int BLOCKSIZE = 40;
		int r;
		int g;
		int b;
		
		int startX = -260;
		int startY = -15;
		
		int sign  = -1;
		int inset = 0;
		pen.setColor(Color.BLUE);
		
		for(int x = 0; x < 8; x++)
		{
			pen.up();
			pen.move(startX, startY - x * BLOCKSIZE);
			pen.setDirection(0);
		}
	}

	public static void main(String[] args)
	{
		OpticalIllusions x = new OpticalIllusions();
		x.grid();
		x.zigzag();
	}
}
