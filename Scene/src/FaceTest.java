import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

import junit.framework.AssertionFailedError;

public class FaceTest {

	@Test
	public void testFaceDrawing() {
		/*
		File temp = new File("src\\comparisonResult-face.png");
		if (temp.exists()) {
			temp.delete();
		}
		JFrame frame = new JFrame();

		TestComponent component = new TestComponent(482, 355);
		frame.pack();
		frame.validate();
		frame.setVisible(true);

		BufferedImage expected = null;
		try {
			expected = ImageIO.read(new File("src/expected-face.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedImage actual = getScreenShot(component);
		BufferedImage comparisonImage = new BufferedImage(expected.getWidth(), expected.getHeight(), 
				expected.getType());
		
		boolean failed = false;
		assertNotNull(expected);
		assertEquals(expected.getHeight(), actual.getHeight());
		assertEquals(expected.getWidth(), actual.getWidth());
		for (int i=0;i<expected.getWidth();i++) {
			for (int j=0;j<expected.getHeight();j++) {
				int rgb = expected.getRGB(i, j);
				comparisonImage.setRGB(i, j, rgb);
				if (rgb != actual.getRGB(i, j)) {
					comparisonImage.setRGB(i, j, Color.red.getRGB());
					failed = true;
				}
			}
		}
		if (failed) {
			try {
				ImageIO.write(comparisonImage, "png", new File("src\\comparisonResult-face.png"));
				System.out.println("Comparison failed, see src\\comparisonImage-face.png for more details. "
						+ "This can be found by refreshing the src folder in your code."
						+ "Red was not used in the test case, anything in red represents items that do not match.");
			} catch (IOException e) {
				System.out.println("Comparison image could not be saved.");
			}
			
		}
		assertFalse(failed);
		
		
	}
	public static BufferedImage getScreenShot(
		    Component component) {

		    BufferedImage image = new BufferedImage(
		      component.getWidth(),
		      component.getHeight(),
		      BufferedImage.TYPE_INT_RGB
		      );
		    // call the Component's paint method, using
		    // the Graphics object of the image.
		    component.paint( image.getGraphics() ); // alternately use .printAll(..)
		    return image;
		  }
	
	private class TestComponent extends JComponent {
		
		public TestComponent(int width, int height) {
			this.setSize(new Dimension(width, height));
			this.setMinimumSize(new Dimension(width, height));
		}
		
		public void paintComponent(Graphics g) {
			Graphics2D graphics2 = (Graphics2D)g;
			graphics2.setColor(Color.white);
			graphics2.fillRect(0, 0, this.getWidth(), this.getHeight());
			Face face = new Face();
			face.drawOn(graphics2);

			face = new Face(25, 25, 25, Color.yellow, Color.green, Color.blue,
					Color.black);
			face.drawOn(graphics2);

			face = new Face(125, 100, 25, Color.black, Color.blue, Color.yellow,
					Color.blue);
			face.drawOn(graphics2);

			face = new Face(200, 100, 50, Color.black, Color.yellow, Color.green,
					Color.blue);
			face.drawOn(graphics2);

			face = new Face(300, 100, 25, Color.black, Color.yellow, Color.blue,
					Color.green);
			face.drawOn(graphics2);
		}
	*/
	}

}
