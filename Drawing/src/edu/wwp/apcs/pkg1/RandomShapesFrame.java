package edu.wwp.apcs.pkg1;

//There are 2 java files in this posting
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 This frame contains a panel that displays rectangles in
 random order as specified by user.
*/
public class RandomShapesFrame extends JFrame
{  
 private static final int FRAME_WIDTH = 300;
 private static final int FRAME_HEIGHT = 300;

 private ShapeComponent circComponent;
 private double currentCount = 100.0;


public RandomShapesFrame()
 {
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
   
    // the component that draws the rectangle
    circComponent = new ShapeComponent();

    add(circComponent, BorderLayout.CENTER);

    createControlPanel();
 }
 
 /**
    Creates the control panel to change the number of rectangles.
 */    
 public void createControlPanel()
 {
    JPanel southPanel = new JPanel();
    southPanel.add(makeButton("More", 2));
    southPanel.add(makeButton("Fewer", .5));

    add(southPanel, BorderLayout.SOUTH);

    circComponent.setCircCount((int) currentCount);
 }
 /**
    Makes a button to change the number of rectangles.
    @param label the button label
    @param factor the factor to change
    @return the button to change the number of rectangles
 */
 public JButton makeButton(String label, final double factor)
 {
    JButton button = new JButton(label);
   
    class ButtonListener implements ActionListener
    {
       public void actionPerformed(ActionEvent event)
       {  
          currentCount = currentCount * factor;
          circComponent.setCircCount((int) currentCount);
       }        
    }

    ButtonListener listener = new ButtonListener();
    button.addActionListener(listener);  
    return button;    
 }      
public static void main(String[] args)
 {  
    JFrame frame = new RandomShapesFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("RECTANGLES");
    frame.setVisible(true);
 }

    /* we are using a double, not an int, so that the
       user can click the "Fewer" button to set the count
       < 1 and still click the "More" button to get
       counts > 1.
    */
}
