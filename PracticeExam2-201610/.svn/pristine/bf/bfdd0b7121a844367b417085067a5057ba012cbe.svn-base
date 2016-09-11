package adder;


//Import classes needed for appearance
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
* A simple calculator that only does addition and subtraction of integers.
* 
*  TODO
* @author Delvin Defoe and (YOUR_NAME_HERE). Created Oct 19, 2015.
*/

/* HINT 1:
 * If you have listener and you want to get the GUI object that
 * caused it, you can use code like this:
 * 
 * 	public void actionPerformed(ActionEvent e) {
 * 		JButton b = (JButton) e.getSource();
 *
 * HINT 2:
 * If you want to convert a string to an integer, do it like this:
 * int num = Integer.parseInt("1234");	
 *
 * HINT 3:
 * Example of a sequence of button presses and what should be displayed after each:
 * Press 	Display
 *       	0  (initial display before any buttons are pressed)
 *  2    	2
 *  3    	23
 *  +    	23
 *  5    	5
 *  6    	56
 *  +    	79
 *  0    	0
 *  0    	0
 *  1    	1
 *  8    	18
 *  C    	0
 *  3    	3
 *  -    	-3
 *  2    	2
 *  -    	-5
 *  
 */
public class AdderMain {
	
	/**
	 * Set up the AdderGUI to respond to button clicks.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int WIDTH = 300, HEIGHT = 450;
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle("Adder");

		// Create the text field that displays numbers.
		JTextField display = new JTextField("0", 20);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setFont(new Font("Helvetica", Font.BOLD, 24));

		// YOU CAN MODIFY ANY OF THIS CODE IN
		// STAGES 1, 2, or 3
		
		// Add a panel to hold the buttons
		ButtonPanel buttonPanel = new ButtonPanel();
		
		frame.add(display, BorderLayout.NORTH);
		frame.add(buttonPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}


