package edu.wwp.apcs.pkg1;
import apcslib.DrawingTool;
import apcslib.SketchPad;
import java.awt.Color;

public class Square 
{
	public static void main(String[] args) 
	{
		SketchPad poster = new SketchPad(600, 600);
		DrawingTool marker = new DrawingTool(poster);
		marker.setColor(Color.GREEN);
		marker.setWidth(15);
		for(int i = 0; i < 4; i++)
		{
			marker.forward(100);
			marker.turn(90);
		}
	}
}
