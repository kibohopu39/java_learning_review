package basic_review;

import javax.swing.JOptionPane;

public class Kai_java_01 {
// create a panel for asking using
	
	public static void main(String[] args) {
		//import JOptionPane, and use its static methods
		//showInputDialog is a method of typing your content on your window
		String x = JOptionPane.showInputDialog("Input a number");
		String y = JOptionPane.showInputDialog("Input a number");
		
		//transform type
		int intX = Integer.parseInt(x);
		int intY = Integer.parseInt(y);
		int intR = intX + intY;
		JOptionPane.showMessageDialog(null, intX + "+" + intY+"=" +intR);
	}

}
