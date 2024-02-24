package edu.wwp.apcs.pkg2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BankAccountDialogBox 
{
	public static void main(String[] args) 
	{
		// Shows a message dialog box
		JOptionPane.showMessageDialog(new JFrame(), "Amrit Ramesh", "JOptionPaneExamples", JOptionPane.ERROR_MESSAGE);
		
		// changes the color of the input dialog box
		UIManager.put("OptionPane.background", Color.red);
		UIManager.put("Panel.background", Color.green);
		String acct = JOptionPane.showInputDialog("What is the acct Number?");
		
		// input a String
		String balText = JOptionPane.showInputDialog("What is the balance?");
		
		// convert balText to double;
		double balance = Double.parseDouble(balText);
		
		// Instantiate BAnkAccount
		BankAccount x = new BankAccount(balance, acct);
		
		// Print object in dialog box
		JOptionPane.showMessageDialog(null, x);
	}
}