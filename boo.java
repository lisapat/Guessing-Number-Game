import java.util.*;

import javax.swing.JOptionPane;

public class boo {
	
	public static void main(String[] args) {
		String input; // input is a string variable
		int cpucrazy;
		int convertstring; 
		
Random ran = new Random ();
cpucrazy = ran.nextInt(3);
int count = 1;
				
do {
	input = JOptionPane.showInputDialog("Guess a number between 0-3");
	convertstring = Integer.parseInt(input);
	
	if  (cpucrazy != convertstring)
		if (cpucrazy < convertstring) {
			count++;
		 JOptionPane.showMessageDialog(null, "Your guess is too high. Guess again?"); 
		 }
		 else { count++;
			 JOptionPane.showMessageDialog(null, "Your guess is too low. Guess again?"); }
	
	} while (convertstring != cpucrazy);
	     
  JOptionPane.showMessageDialog(null, "Correct!! You did it in "+ count +" tries!"); 
}
}




