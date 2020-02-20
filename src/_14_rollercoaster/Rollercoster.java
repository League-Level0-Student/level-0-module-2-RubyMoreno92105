package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoster {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("how tall are you"); 
	int height=Integer.parseInt(answer);
	if(height>48) {
		JOptionPane.showMessageDialog(null, "you may ride the Rollercoster");
		
		
		
	}

	
	
}

}
