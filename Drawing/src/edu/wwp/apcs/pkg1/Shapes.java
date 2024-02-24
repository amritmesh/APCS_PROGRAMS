package edu.wwp.apcs.pkg1;

//Fig. 12.22: Shapes.java
//Demonstrating some Java2D shapes.
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

public class Shapes extends JFrame
{
// set window's title bar String and dimensions
public Shapes()
{
   super( "Drawing 2D shapes" );
   setSize( 800, 400 );
   setVisible( true );
}
// draw shapes with Java2D API
public void paint( Graphics g )
{
   super.paint( g );  // call superclass's paint method
   Graphics2D g2d = ( Graphics2D ) g;  // cast g to Graphics2D
   // draw 2D rounded rectangle with a buffered background
   BufferedImage buffImage = new BufferedImage( 10, 10,
                                 BufferedImage.TYPE_INT_RGB );
   Graphics2D gg = buffImage.createGraphics();  
   gg.setColor( Color.YELLOW ); // draw in yellow
   gg.fillRect( 0, 0, 10, 10 ); // draw a filled rectangle
   gg.setColor( Color.BLACK );  // draw in black
   gg.drawRect( 1, 1, 6, 6 );   // draw a rectangle
   gg.setColor( Color.BLUE );   // draw in blue
   gg.fillRect( 1, 1, 3, 3 );   // draw a filled rectangle
   gg.setColor( Color.RED );    // draw in red
   gg.fillRect( 4, 4, 3, 3 );   // draw a filled rectangle
   //paint buffImage onto the JFrame
   g2d.setPaint( new TexturePaint( buffImage, new Rectangle( 10, 10 )));  
   g2d.fill( new RoundRectangle2D.Double( 155, 30, 75, 100, 50, 150 ) );
   //g2d.fillRect(50,50,75,75);


   // draw 2D ellipse filled with a blue-yellow gradient
   g2d.setPaint( new GradientPaint( 5, 30, Color.BLUE, 35, 100,
                         Color.YELLOW, true ) );  
   g2d.fill( new Ellipse2D.Double( 65, 30, 65, 100 ) );
    


   // draw 2D rectangle in red
   g2d.setPaint( Color.RED );  
   float x[] = {9f,2f,5f};
   //BasicStroke(float width, int cap, int join, float miterlimit, float[] dash, float dash_phase)
   g2d.setStroke( new BasicStroke( 10f ,0,1,2f,x,0f) );
   g2d.draw( new Rectangle2D.Double( 480, 30, 65, 100 ) );
  
   g2d.setPaint( Color.BLUE );
  


    

   // draw 2D pie-shaped arc in white
   g2d.setPaint( Color.YELLOW );
   //g2d.setStroke( new BasicStroke( 6.0f ) );
   g2d.fill( new Arc2D.Double( 240, 30, 75, 100, 60, 300, Arc2D.PIE));
   g2d.setPaint( Color.BLACK);
  g2d.fill( new Arc2D.Double( 255, 45, 15, 15, 0, 180, Arc2D.OPEN));

  
  
  
  // draw 2D lines in green and yellow
   g2d.setPaint( Color.GREEN );
   g2d.draw( new Line2D.Double( 395, 30, 320, 150 ) );
   float dashes[] = { 35,5,10,5};
   g2d.setPaint( Color.YELLOW );    
   g2d.setStroke( new BasicStroke( 4, BasicStroke.JOIN_ROUND,
                                     BasicStroke.CAP_BUTT, 10, dashes, 0 ) );
   g2d.draw( new Line2D.Double( 320, 30, 395, 150 ) );

// end method paint

// execute application
  

}



public static void main( String args[] )
{
   Shapes application = new Shapes();
   application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}















} // end class Shapes
