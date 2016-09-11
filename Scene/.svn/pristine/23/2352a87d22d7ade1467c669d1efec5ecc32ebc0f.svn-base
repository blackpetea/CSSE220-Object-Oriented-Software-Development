import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SunComponent extends JComponent {
	private static final double LITTLE_SUN_SIZE = 30.0;
	private static final double LITTLE_SUN_SEPARATION = 100.0;
	private static final int NUM_LITTLE_SUNS = 5;
	private static final double LITTLE_SUNS_Y = 400.0;
	private static final Color LITTLE_SUN_COLOR = Color.RED;
	private static final double LITTLE_SUNS_X_OFFSET = 50;

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		Graphics2D graphics2 = (Graphics2D) graphics;

		this.drawSun(graphics2);
		this.drawSunTest2(graphics2);
		this.drawLittleSuns(graphics2);

	}

	private void drawSun(Graphics2D graphics) {
		Sun test = new Sun();
		test.drawOn(graphics);
	}

	private void drawSunTest2(Graphics2D g2) {
		// draws a rectangle around the default sun
		g2.drawRect(30, 30, 240, 240);

		// draws a rectangle around a new sun in a particular position
		Sun s = new Sun(550, 100, 50, Color.BLUE);
		s.drawOn(g2);
		g2.drawRect(515, 65, 120, 120);
	}

	private void drawLittleSuns(Graphics2D g2) {
		for (int i = 0; i < this.NUM_LITTLE_SUNS; i++) {
			double xdd = this.LITTLE_SUNS_X_OFFSET + i * this.LITTLE_SUN_SEPARATION;
			Sun s = new Sun(xdd, this.LITTLE_SUNS_Y, this.LITTLE_SUN_SIZE, this.LITTLE_SUN_COLOR);
			s.drawOn(g2);
		}

	}
}
