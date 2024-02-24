package edu.wwp.apcs.pkg1;
import java.awt.Color;
import apcslib.DrawingTool;
import apcslib.SketchPad;

public class CurvedJ 
{
	public static void main (String [] args)
	{
	SketchPad poster = new SketchPad(600, 600);
	DrawingTool marker = new DrawingTool(poster);
	
	marker.setColor(Color.green);
	marker.setWidth(20);
	
	marker.turn(90);
	marker.forward(150);
	marker.up();
	
	marker.setDirection(0);
	marker.forward(75);
	marker.down();
	
	marker.setDirection(270);
	marker.forward(200);
	
	for(int i = 270; i >= 110; i--)
	{
		marker.setDirection(i);
		marker.forward(1);
	}
	}
}
