import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

//Feel free to modify this class or add any other classes you need

public class GravityComponent extends JComponent {
	private MyWorld mouse;
	private static final int WIDTH = 30;

	public GravityComponent(MyWorld mouse) {
		// you'll probability want to add to this
		// in Part 2

		this.mouse = mouse;
		addMouseListener(mouse);

		Runnable repaint = new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(10);
						repaint();
					}
				} catch (InterruptedException exception) {
				}
			}
		};
		new Thread(repaint).start();
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.red);

		Graphics2D g2 = (Graphics2D) g;
		if (this.mouse.getMyBall() != null) {
			for (Ball ball : this.mouse.getMyBall()) {
				g2.fill(ball.getShape());
			}
		}

		g.fillOval(40 - WIDTH / 2, 150 - WIDTH / 2, WIDTH, WIDTH);
		g.fillOval(250 - WIDTH / 2, 300 - WIDTH / 2, WIDTH, WIDTH);

	}

	public JPanel graPanel() {
		JPanel myPanel = new JPanel();
		JButton gStep = new JButton("Gravity STEP");
		gStep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Gravity STEP");
				mouse.graDrop();

			}

		});

		JButton gON = new JButton("Gravity ON");
		gON.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Gravity ON");
				mouse.setGravity(!mouse.isGravity());
				mouse.gravityStart();
			}

		});

		myPanel.add(gStep);
		myPanel.add(gON);
		return myPanel;
	}

}
