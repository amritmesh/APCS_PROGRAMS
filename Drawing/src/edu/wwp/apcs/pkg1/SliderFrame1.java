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
public class SliderFrame1 extends JFrame
{
   
       private JPanel colorPanel;
       private JSlider redSlider;
     

       private static final int FRAME_WIDTH = 300;
       private static final int FRAME_HEIGHT = 400;
   
   
    public SliderFrame1()
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

      redSlider = new JSlider(0, 255, 255);
      redSlider.addChangeListener(listener);

   
      JPanel controlPanel = new JPanel();
      controlPanel.setLayout(new GridLayout(3, 2));

      controlPanel.add(new JLabel("Red"));
      controlPanel.add(redSlider);

     

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
   

      // Set panel background to selected color

      colorPanel.setBackground(new Color(red, 0, 0));
      colorPanel.repaint();
   }
   
   public static void main(String[] args)
   {  
      SliderFrame1 frame = new SliderFrame1();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
