package edu.wwp.apcs.pkg1;

//Fig. 12.23: Shapes2.java
//Demonstrating a general path.
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Shapes23 extends JFrame {
// set window's title bar String, background color and dimensions
public Shapes23()
{
   super( "Stars" );
   getContentPane().setBackground( Color.WHITE );
   setSize( 400, 400 );
   setVisible( true );
}
// draw general paths
public void paint( Graphics g )
{
   super.paint( g );  // call superclass's paint method
   int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
   int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
   Graphics2D g2d = ( Graphics2D ) g;
   GeneralPath star = new GeneralPath();  // create GeneralPath object
   // set the initial coordinate of the General Path
   star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );
   // create the star--this does not draw the star
   for ( int count = 1; count < xPoints.length; count++ )
      star.lineTo( xPoints[ count ], yPoints[ count ] );
   star.closePath();  // close the shape
   g2d.fill( star );
   g2d.translate( 200, 200 );  // translate the origin to (200, 200)
   // rotate around origin and draw stars in random colors
   for ( int count = 1; count <= 20; count++ )
   {
      g2d.rotate( Math.PI / 10.0 );  // rotate coordinate system
      // set random drawing color
      g2d.setColor( new Color( ( int ) ( Math.random() * 256 ),
         ( int ) ( Math.random() * 256 ),              
         ( int ) ( Math.random() * 256 ) ) );
      g2d.fill( star );  // draw filled star
   }
} // end method paint

// execute application
public static void main( String args[] )
{
   Shapes23 application = new Shapes23();
   application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}

} // end class Shapes23

/**************************************************************************
* (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
* Prentice Hall. All Rights Reserved.                                    *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
