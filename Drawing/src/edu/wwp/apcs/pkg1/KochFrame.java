package edu.wwp.apcs.pkg1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

public class KochFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KochFrame()
	{
		setBounds(100, 100, 800, 900);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		int x1 = 100;
		int y1 = 300;
		
		int x2 = 700;
		int y2 = 300;
		
		draw(g, 10, x1, y1, x2, y2);
	}
	
	public void draw(Graphics g, int iteration, double x1, double y1, double x2, double y2)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		if (iteration == 1)
		{
			g2.draw(new Line2D.Double(x1, y1, x2, y2));
		}
		
		else
		{
			double dx = (x2 - x1) / 3;
			double dy = (y2 - y1) / 3;
			
			double x3 = x1 + dx;
			double y3 = y1 + dy;
			
			double x4 = x2 - dx;
			double y4 = y2 - dy;
			
			double angle = 60 * Math.PI / 180;
			
			double x5 = x3 + dx * Math.cos(angle) + dy * Math.sin(angle);
			double y5 = y3 + dy * Math.cos(angle) - dx * Math.sin(angle);
						
			draw(g2, iteration - 1, x1, y1, x3, y3);
			draw(g2, iteration - 1, x3, y3, x5, y5);
			draw(g2, iteration - 1, x5, y5, x4, y4);
			draw(g2, iteration - 1, x4, y4, x2, y2);
  		}
	}
	
	public static void main(String[] args)
	{
		KochFrame x = new KochFrame();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
	}
}