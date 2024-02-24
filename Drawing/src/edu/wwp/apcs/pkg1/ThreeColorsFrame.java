package edu.wwp.apcs.pkg1;

//Use this code to add 3 more buttons (including a random button)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
public class ThreeColorsFrame extends JFrame
{
     private JPanel colorPanel;

     private static final int FRAME_WIDTH = 600;
     private static final int FRAME_HEIGHT = 400;
 
  public ThreeColorsFrame()
 {
    colorPanel = new JPanel();
    getContentPane().add(colorPanel, BorderLayout.CENTER);
    createControlPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
 }

 public void createControlPanel()
 {
JButton redButton = makeButton("Red", Color.red);
JButton greenButton = makeButton("Green", Color.green);
JButton blueButton = makeButton("Blue", Color.blue);
JButton cyanbutton = makeButton("Cyan", Color.cyan);
JButton orangebutton = makeButton("Orange", Color.orange);
Random x = new Random();
Random y = new Random();
Random z = new Random();
JButton randombutton = makeButton("Random", new Color(x.nextFloat(), y.nextFloat(), z.nextFloat()));
JPanel southPanel = new JPanel();
southPanel.add(redButton);
southPanel.add(greenButton);
southPanel.add(blueButton);
southPanel.add(cyanbutton);
southPanel.add(orangebutton);
southPanel.add(randombutton);


add(southPanel, BorderLayout.SOUTH);

redButton.setSelected(true);
colorPanel.setBackground(Color.red);
 }

 /**
    Reads the slider values and sets the panel to
    the selected color.
 */
 public JButton makeButton(String label,  final Color color)
 {
JButton button = new JButton(label);

class ButtonListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent event) {
	  if (label != "Red" && label != "Green" && label != "Blue" && label != "Cyan" && label != "Orange")
	  {
		  Random x = new Random();
		  Random y = new Random();
		  Random z = new Random();
		  colorPanel.setBackground(new Color(x.nextFloat(), y.nextFloat(), z.nextFloat()));
	  }
	  else
	  {
		  colorPanel.setBackground(color);
	  }
}
}

ButtonListener listener = new ButtonListener();
button.addActionListener(listener);
return button;
 }
 
 public static void main(String[] args)
 {  
ThreeColorsFrame frame = new ThreeColorsFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
 }
}
