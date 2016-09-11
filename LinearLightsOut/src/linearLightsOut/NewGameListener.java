package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class NewGameListener implements ActionListener {
	private ArrayList<JButton> myButtons;

	public NewGameListener(ArrayList<JButton> theButtons) {
		this.myButtons = theButtons;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {// start a new game
		for (int i = 0; i < this.myButtons.size(); i++) {
			double ran = Math.random();
			if (ran > 0.5) {
				this.myButtons.get(i).setText("X");
			} else {
				this.myButtons.get(i).setText("O");
			}
		}
	}

}
