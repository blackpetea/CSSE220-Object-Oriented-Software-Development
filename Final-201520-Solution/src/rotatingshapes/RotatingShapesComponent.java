package rotatingshapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RotatingShapesComponent extends JComponent implements Runnable {

	private RotatingShape square1, square2, circle1, circle2;
	
	public RotatingShapesComponent(JFrame frame) {
		
		square1 = new RotatingSquare(0,0);
		square2 = new RotatingSquare(300,300);
		circle1 = new RotatingCircle(100,200);
		circle2 = new RotatingCircle(100,400);
		
		
		// HINT: If you want to add a keyboard listener, 
		// add it to the frame not this component
		frame.addKeyListener(square1);
		frame.addKeyListener(square2);
		frame.addKeyListener(circle1);
		frame.addKeyListener(circle2);
		
		Thread t = new Thread(this);
		t.start();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		square1.draw(g2);
		square2.draw(g2);
		circle1.draw(g2);
		circle2.draw(g2);
		
	}

	@Override
	public void run() {
		try {
			while(true) {
				square1.update();
				square2.update();
				circle1.update();
				circle2.update();
				repaint();
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

}
