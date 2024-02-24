package edu.wwp.apcs.pkg2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class EmployeeDialogBox 
{
	public static void main(String[] args) 
	{
		// Shows a message dialog box
		JOptionPane.showMessageDialog(new JFrame(), "Amrit Ramesh", "JOptionPaneExamples", JOptionPane.ERROR_MESSAGE);
		
		// changes the color of the input dialog box
		UIManager.put("OptionPane.background", Color.red);
		UIManager.put("Panel.background", Color.green);
		String name = JOptionPane.showInputDialog("What is the employee's name?");
		
		// input a String
		String salText = JOptionPane.showInputDialog("What is the employee's salary?");
		
		// convert balText to double;
		double salary = Double.parseDouble(salText);
		
		// Instantiate BAnkAccount
		Employee x = new Employee(name, salary);
		
		// Print object in dialog box
		JOptionPane.showMessageDialog(null, x);
	}
}
