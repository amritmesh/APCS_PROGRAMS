package edu.wwp.apcs.pkg1;

//This is the second program
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.util.Random;

public class ShapeComponent extends JComponent {
  private int rectCount;
  Color col = new Color(0, 0, 0);
  private Ellipse2D.Double box;
  private static final double CIRCLE_WIDTH = 20;
  private static final double CIRCLE_HEIGHT = 20;

  public void paintComponent(Graphics g) {

		
      super.paintComponent(g);
      
      Graphics2D g2 = (Graphics2D) g;
      // draw rectCount rectangles at random positions
      Random generator = new Random();
      for (int i = 0; i < rectCount; i++) {
          double x = getWidth() * generator.nextDouble();
          double y = getHeight() * generator.nextDouble();
          box = new Ellipse2D.Double(x, y, CIRCLE_WIDTH, CIRCLE_HEIGHT);
          g2.draw(box);
      }
  }
  /**
   * Sets the number of rectangles to be drawn and repaints the component.
   *
   * @param count
   *            the new number of rectangles
   */
  public void setCircCount(int count) {
      rectCount = count;
      repaint();
  }
}
