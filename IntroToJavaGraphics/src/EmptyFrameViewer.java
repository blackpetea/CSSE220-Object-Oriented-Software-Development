import javax.swing.JFrame;

/**
 * A very simple Java graphics program -- it just displays an empty frame
 * (window). From Chapter 2 of Big Java by Cay Horstmann.
 * 
 * @author Cay Horstmann, modified by David Mutchler. Created December 7, 2009.
 */
public class EmptyFrameViewer {

	/**
	 * Displays an empty frame.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int frameWidth = 1000;
		int frameHeight = 1000;

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ExampleComponent component=new ExampleComponent ();
		frame.add(component);
		
		

		frame.setVisible(true);
	}
}