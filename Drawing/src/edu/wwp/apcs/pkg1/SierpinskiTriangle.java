package edu.wwp.apcs.pkg1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SierpinskiTriangle extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SierpinskiTriangle()
	{
		setBounds(0, 0, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		Color col = Color.PINK;
		g.setColor(col);
				
		int x1 = 50;
		int y1 = 50;
		
		int x2 = 550;
		int y2 = 50;
		
		int x3 = 300;
		int y3 = 550;
		
		draw(x1, y1, x2, y2, x3, y3, g, 4, col);
	}
	
	public void draw(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g, int iteration, Color col)
	{
		col = col.darker();
		
		int[] xPoints = new int[] {x1, x2, x3};
		int[] yPoints = new int[] {y1, y2, y3};
		
		if (iteration == 1)
		{
			g.drawPolygon(xPoints, yPoints, 3);
		}
		
		else
		{
			int x4 = (x1 + x2) / 2;
			int y4 = (y1 + y2) / 2;
			
			int x5 = (x2 + x3) / 2;
			int y5 = (y2 + y3) / 2;
			
			int x6 = (x1 + x3) / 2;
			int y6 = (y1 + y3) / 2;
			
			int x7 = (x6 + x4) / 2;
			int y7 = (y6 + y4) / 2;
			
			int x8 = (x4 + x5) / 2;
			int y8 = (y4 + y5) / 2;
			
			int x9 = (x5 + x6) / 2;
			int y9 = (y5 + y6) / 2;
			
			draw(x4, y4, x2, y2, x5, y5, g, iteration - 1, col);
			draw(x1, y1, x4, y4, x6, y6, g, iteration - 1, col);
			draw(x5, y5, x3, y3, x6, y6, g, iteration - 1, col);
			
			draw(x7, y7, x8, y8, x9, y9, g, iteration - 1, col);
		}
	}
	
	public static void main(String[] args)
	{
		SierpinskiTriangle x = new SierpinskiTriangle();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
	}
}