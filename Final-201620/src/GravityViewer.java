import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

// Feel free to modify this class or add any other classes you need

public class GravityViewer {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 400;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 400;

	/**
	 * Starts the Go viewer.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final MyWorld world = new MyWorld();

		frame.setTitle("Final Question");
		final GravityComponent g = new GravityComponent(world);
		
		g.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.add(g);
		frame.add(g.graPanel(), BorderLayout.SOUTH);

		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
