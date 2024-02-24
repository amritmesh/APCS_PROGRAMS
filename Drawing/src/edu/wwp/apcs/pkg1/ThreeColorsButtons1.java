package edu.wwp.apcs.pkg1;

//Use this code to add 3 more buttons (including a random button)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
public class ThreeColorsButtons1 extends JFrame
{
     private JPanel colorPanel;

     private static final int FRAME_WIDTH = 300;
     private static final int FRAME_HEIGHT = 400;
 
  public ThreeColorsButtons1()
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
JPanel southPanel = new JPanel();
southPanel.add(redButton);
southPanel.add(greenButton);
southPanel.add(blueButton);

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
colorPanel.setBackground(color);
}
}

ButtonListener listener = new ButtonListener();
button.addActionListener(listener);
return button;
 }
 
 public static void main(String[] args)
 {  
ThreeColorsButtons1 frame = new ThreeColorsButtons1();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
 }
}
