package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
	private int order;
	private ArrayList<JButton> myButtons;
	private JFrame myWindow;

	public ButtonListener(int ordernum, ArrayList<JButton> buttons, JFrame frame) {
		this.order = ordernum;
		this.myButtons = buttons;
		this.myWindow = frame;
	}

	public void checkWinning() {// function for check whether winning or not
		boolean flag1 = true;
		boolean flag2 = true;
		for (JButton temp : myButtons) {
			if (flag1) {
				if (!temp.getText().equals("X")) {
					flag1 = false;
				}
			}
			if (flag2) {
				if (!temp.getText().equals("O")) {
					flag2 = false;
				}
			}
		}
		if (flag1 == true || flag2 == true) {
			this.myWindow.setTitle("Winning!");
		}
	}

	public void changeText(JButton theButton) {// function for change X to O or
												// O to X
		if (theButton.getText().equals("O")) {
			theButton.setText("X");
		} else {
			theButton.setText("O");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this.order == 0) {
			this.changeText(this.myButtons.get(this.order));
			this.changeText(this.myButtons.get(this.order + 1));
		} else if (this.order == this.myButtons.size() - 1) {
			this.changeText(this.myButtons.get(this.order));
			this.changeText(this.myButtons.get(this.order - 1));
		} else {
			this.changeText(this.myButtons.get(this.order + 1));
			this.changeText(this.myButtons.get(this.order));
			this.changeText(this.myButtons.get(this.order - 1));
		}
		this.checkWinning();
	}

}
