import java.awt.Dimension;

import javax.swing.JFrame;

public class SceneViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(new Dimension(750, 600));
		frame.setTitle("Scene!");

		frame.add(new SceneComponent());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}