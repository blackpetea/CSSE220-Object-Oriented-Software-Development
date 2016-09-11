package slides;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * This class responds to button clicks.
 *
 * @author Curt Clifton.
 *         Created Oct 7, 2008.
 */
public class MyButtonListener implements ActionListener {
	private JButton anotherButton;
	private String text;

	public MyButtonListener(JButton otherButton,String text) {
		this.anotherButton=otherButton;
		this.text=text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ow! Too hot!");
		anotherButton.setText(this.text);
	}

}
