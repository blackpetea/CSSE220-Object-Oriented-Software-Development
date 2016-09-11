package adder;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	
	private Font buttonFont; 
	private ArrayList<JButton> buttonList;

	public ButtonPanel(){
	
		this.configure();
		this.buttonList = new ArrayList<JButton>();
		this.addButtons();
	}
	
	// YOU CAN ADD CODE ANYWHERE IN THIS FILE IN
	// STAGES 1, 2, or 3
	
	private void configure(){
		this.buttonFont = new Font("Helvetica", Font.BOLD, 48);
		this.setLayout(new GridLayout(4, 4, 5, 5));
	}
	
	private void addButtons(){
		// Create the top nine buttons (1-9) and add them to the panel.
		// label each button with a string representing the button's value.
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				JButton b = new JButton(7 - 3*row + col + "");
				b.setFont(this.buttonFont);
				this.buttonList.add(b);
				// TODO: Add the remaining code here to complete Stage 1
				this.add(b);
			}
		}
		
		// Create and add the bottom three buttons.
		String[] remainingButtonLabels = {"-", "0", "+"};
		for (String s : remainingButtonLabels) {
			JButton b = new JButton(s);
			b.setFont(this.buttonFont);
			this.buttonList.add(b);
			// TODO: if s equals "0" b is a button for Stage 1. The remaining code 
			// for Stage 1 should be added here to handle that.
			// if s != "0" then b is a button for Stage 3.  More code should be
			// added here to get Stage 3 to work properly.
			this.add(b);
		}
	}
}
