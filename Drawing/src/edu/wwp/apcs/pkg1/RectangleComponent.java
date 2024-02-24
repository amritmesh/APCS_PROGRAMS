package edu.wwp.apcs.pkg1;

//This is the second program
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.util.Random;

public class RectangleComponent extends JComponent {
  private int rectCount;
  private Rectangle2D.Double box;
  private static final double BOX_WIDTH = 20;
  private static final double BOX_HEIGHT = 30;

  public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      // draw rectCount rectangles at random positions
      Random generator = new Random();
      for (int i = 0; i < rectCount; i++) {
          double x = getWidth() * generator.nextDouble();
          double y = getHeight() * generator.nextDouble();
          box = new Rectangle2D.Double(x, y, BOX_WIDTH, BOX_HEIGHT);
          g2.draw(box);
      }
  }
  /**
   * Sets the number of rectangles to be drawn and repaints the component.
   *
   * @param count
   *            the new number of rectangles
   */
  public void setRectCount(int count) {
      rectCount = count;
      repaint();
  }
}
