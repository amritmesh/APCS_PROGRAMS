import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Stack;
import javax.swing.JFrame;

public class Stars extends JFrame
{
	public Stars()
	{
		super("Stars");
		setSize(600,600);
		setVisible(true);
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.WHITE);
		Stack<Integer> xStack = new Stack<Integer>();
		Stack<Integer> yStack = new Stack<Integer>();
		Graphics2D g2d = (Graphics2D) g;
		
		for (int count = 0; count <= 20; count++)
		{			
			for (int count2 = 0; count2 <= 1600; count2++)
			{
				int x = (int)(Math.random() * 600);
				int y = (int)(Math.random() * 600);
				xStack.add(x);
				yStack.add(y);
				
				Ellipse2D.Double two = new Ellipse2D.Double(x, y, 5, 5);
				g2d.fill(two);
				
				try
				{
					Thread.currentThread().sleep(5);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			g.setColor(Color.BLACK);
			
			for (int count3 = 0; count3 <= 1600; count3++) 
			{
				int x = xStack.pop();
				int y = yStack.pop();
				
				Ellipse2D.Double two = new Ellipse2D.Double(x, y, 5, 5);
				g2d.fill(two);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Stars application = new Stars();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
