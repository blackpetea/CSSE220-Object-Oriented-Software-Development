package linearLightsOut;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author <TODO: YOUR NAME HERE>. Created Jan 18, 2010.
 */
public class LinearMain {
	private JButton myButtons;

	/**
	 * Starts here.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String nButtonsString = JOptionPane.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Linear Lights Out!");

		//one panel for "New Game" and "Quit", other for "X"s and "O"s
		JPanel myPanel = new JPanel();
		myFrame.add(myPanel);
		JPanel myPanel2 = new JPanel();
		myFrame.add(myPanel2, BorderLayout.SOUTH);

		// you'll want to think about how you want to manage the state of the
		// game
		// also you want to add some buttons and stuff

		// Produce Xs and Os
		ArrayList<JButton> myButtons = new ArrayList<JButton>();
		for (int i = 0; i < nButtons; i++) {
			JButton gameButton;
			double ran = Math.random();
			if (ran > 0.5) {
				gameButton = new JButton("X");
				myButtons.add(gameButton);
			} else {
				gameButton = new JButton("O");
				myButtons.add(gameButton);
			}
			myPanel.add(gameButton);
		}

		//add listener for Xs and Os
		for (int i = 0; i < myButtons.size(); i++) {
			ButtonListener gameListener = new ButtonListener(i, myButtons, myFrame);
			myButtons.get(i).addActionListener(gameListener);
		}

		// Construct "New Game" Button
		NewGameListener newGameLis = new NewGameListener(myButtons);
		JButton newGameButton = new JButton("New Game");
		newGameButton.addActionListener(newGameLis);
		myPanel2.add(newGameButton, BorderLayout.EAST);

		// Construct "Quit" Button
		QuitGameListener quitGameLis = new QuitGameListener(myFrame);
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(quitGameLis);
		myPanel2.add(quitButton, BorderLayout.WEST);

		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
