import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.JFrame;

public class StackDesignAnimation extends JFrame
{
	public StackDesignAnimation()
	{
		super("StackDesignAnimation");
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
//				g.setColor(new Color((int)(Math.random() * 0x1000000)));
				
				int x = (int)(Math.random() * 600);
				int y = (int)(Math.random() * 600);
				xStack.add(x);
				yStack.add(y);
				
				Line2D.Double two = new Line2D.Double(x, y, 300, 300);
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
				
				Line2D.Double two = new Line2D.Double(x, y, 300, 300);
				g2d.fill(two);
			}
		}
	}
	
	public static void main(String[] args)
	{
		StackDesignAnimation application = new StackDesignAnimation();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
