package edu.wwp.apcs.pkg1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class CustomFractal extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomFractal()
	{
		setBounds(0, 0, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		int x1 = 50;
		int y1 = 50;
		
		int x2 = 550;
		int y2 = 50;
		
		int x3 = 50;
		int y3 = 550;
		
		int x4 = 550;
		int y4 = 550;
		
		draw(x1, y1, x2, y2, x3, y3, x4, y4, g, 8, Color.ORANGE);
	}
	
	public void draw(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, Graphics g, int iteration, Color col)
	{
		col = new Color(col.getRed() - 10, col.getGreen() - 25, col.getBlue() + 10);
		g.setColor(col);
		
		int[] xPoints = new int[] {x1, x2, x4, x3};
		int[] yPoints = new int[] {y1, y2, y4, y3};
		
		if (iteration == 1)
		{
			g.fillPolygon(xPoints, yPoints, 4);
		}
		
		else
		{
			int x5 = (x1 + x2) / 2;
			int y5 = (y1 + y2) / 2;
			
			int x6 = (x2 + x4) / 2;
			int y6 = (y2 + y4) / 2;
			
			int x7 = (x4 + x3) / 2;
			int y7 = (y4 + y3) / 2;
			
			int x8 = (x3 + x1) / 2;
			int y8 = (y3 + y1) / 2;
			
			g.fillPolygon(xPoints, yPoints, 4);
			
			draw(x5, y5, x6, y6, x8, y8, x7, y7, g, iteration - 1, col);
		}
	}
	
	public static void main(String[] args)
	{
		CustomFractal x = new CustomFractal();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
	}
}