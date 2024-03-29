package edu.wwp.apcs.pkg1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
public class SliderFrame extends JFrame
{
   
       private JPanel colorPanel;
       private JSlider redSlider;
       private JSlider greenSlider;
       private JSlider blueSlider;

       private static final int FRAME_WIDTH = 300;
       private static final int FRAME_HEIGHT = 400;
   
   
    public SliderFrame()
   {
      colorPanel = new JPanel();
      getContentPane().add(colorPanel, BorderLayout.CENTER);
      createControlPanel();
      setSampleColor();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

   public void createControlPanel()
   {
      class ColorListener implements ChangeListener
      {
         public void stateChanged(ChangeEvent event)
         {
            setSampleColor();
         }
      }
      ChangeListener listener = new ColorListener();

      redSlider = new JSlider(0, 255, 25);
      redSlider.addChangeListener(listener);

      greenSlider = new JSlider(0, 255, 100);
      greenSlider.addChangeListener(listener);

      blueSlider = new JSlider(0, 255, 225);
      blueSlider.addChangeListener(listener);

      JPanel controlPanel = new JPanel();
      controlPanel.setLayout(new GridLayout(3, 2));

      controlPanel.add(new JLabel("Red"));
      controlPanel.add(redSlider);

      controlPanel.add(new JLabel("Green"));
      controlPanel.add(greenSlider);

      controlPanel.add(new JLabel("Blue"));
      controlPanel.add(blueSlider);

      getContentPane().add(controlPanel, BorderLayout.SOUTH);
   }

   /**
      Reads the slider values and sets the panel to
      the selected color.
   */
   public void setSampleColor()
   {
      // Read slider values

      int red =  redSlider.getValue();
      int green =  greenSlider.getValue();
      int blue = blueSlider.getValue();

      // Set panel background to selected color

      colorPanel.setBackground(new Color(red, green, blue));
      colorPanel.repaint();
   }
   
   public static void main(String[] args)
   {  
      SliderFrame frame = new SliderFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
