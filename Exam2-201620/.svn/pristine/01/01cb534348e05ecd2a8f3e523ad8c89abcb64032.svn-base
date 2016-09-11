package ballStrikeCounter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Tracker {

	private int numBallss;
	private int numStrikess;

	public int getNumStrikess() {
		return this.numStrikess;
	}

	public void setNumStrikess(int numStrikess) {
		this.numStrikess = numStrikess;
	}

	public int getNumBallss() {
		return this.numBallss;
	}

	public void setNumBallss(int numBallss) {
		this.numBallss = numBallss;
	}

	protected static void updateLabel(JLabel label, int numBalls, int numStrikes) {
		label.setText("<html>Balls: " + numBalls + "<br />Strikes: " + numStrikes + "</HTML>");
	}

	public static void main(String[] args) {
		final Tracker tracker = new Tracker();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		final JLabel label = new JLabel();

		frame.add(label, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);

		JButton addBall = new JButton("Add Ball");
		ActionListener addBalls = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tracker.setNumBallss(tracker.getNumBallss() + 1);
				if (tracker.getNumBallss() == 4) {
					tracker.setNumBallss(0);
					tracker.setNumStrikess(0);
				}
				updateLabel(label, tracker.getNumBallss(), tracker.getNumStrikess());
			}
		};
		addBall.addActionListener(addBalls);

		JButton addStrike = new JButton("Add Strike");
		ActionListener addStrikes = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tracker.setNumStrikess(tracker.getNumStrikess() + 1);
				if (tracker.getNumStrikess() == 3) {
					tracker.setNumBallss(0);
					tracker.setNumStrikess(0);
				}
				updateLabel(label, tracker.getNumBallss(), tracker.getNumStrikess());
			}
		};
		addStrike.addActionListener(addStrikes);

		panel.add(addBall);
		panel.add(addStrike);
		updateLabel(label, 0, 0);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
