package moveableRectangle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Component where drawing is done.  Also handles the threads.
 * 
 * You'll mostly make modifications to this class,
 * as well as develop some classes of your own.
 * 
 * @author hewner
 *
 */
@SuppressWarnings("serial")
public class MoveableRectangleComponent extends JComponent implements Runnable {

	private MoveableRectangle basicRect;
	
	// Hint: you'll use this for part one
	private MouseMoveableRectangle mouseRect;
	
	
	// Hint: you'll use this for part 2
	private ButtonMoveableRectangle buttonRect;
	
	// Hint: you MUST use this for part 3
	private MoveableRectangle[] rectangles;
	
	
	/**
	 * Makes the component and creates rectangles.
	 * 
	 * @param frame passed in so you can add buttons
	 */
	public MoveableRectangleComponent(JFrame frame) {
		
		basicRect = new MoveableRectangle(Color.GREEN);
		basicRect.setxVelocity(1);
		
		this.mouseRect=new MouseMoveableRectangle(Color.YELLOW);
		addMouseListener(this.mouseRect);
		
		this.buttonRect = new ButtonMoveableRectangle(Color.BLUE);
		JPanel myPanel=new JPanel();
		
		JButton upButton=new JButton("UP");
		upButton.addActionListener(this.buttonRect);
		myPanel.add(upButton);
		
		JButton downButton=new JButton("DOWN");
		downButton.addActionListener(this.buttonRect);
		myPanel.add(downButton);
		
		JButton leftButton=new JButton("LEFT");
		leftButton.addActionListener(this.buttonRect);
		myPanel.add(leftButton);
		
		JButton rightButton=new JButton("RIGHT");
		rightButton.addActionListener(this.buttonRect);
		myPanel.add(rightButton);
		
		frame.add(myPanel,BorderLayout.SOUTH);

		
		
		// some code to get your started for Part 3 
		rectangles = new MoveableRectangle[10];
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				MouseMoveableRectangle newRect=new MouseMoveableRectangle(Color.PINK);
				addMouseListener(newRect);
				this.rectangles[i]=newRect;
			} else {
				 ButtonMoveableRectangle newRect=new ButtonMoveableRectangle(Color.PINK);
				 upButton.addActionListener(newRect);
				 downButton.addActionListener(newRect);
				 leftButton.addActionListener(newRect);
				 rightButton.addActionListener(newRect);
				 this.rectangles[i]=newRect;
			}
		}
		
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		basicRect.drawOn(g2);
		mouseRect.drawOn(g2);
		this.buttonRect.drawOn(g2);
		for (MoveableRectangle rect:this.rectangles) {
			rect.drawOn(g2);
		}
		
	}

	@Override
	public void run() {
		while(true) {
			basicRect.updatePosition(this.getWidth(), this.getHeight());
			this.mouseRect.updatePosition(this.getWidth(), this.getHeight());
			this.buttonRect.updatePosition(this.getWidth(), this.getHeight());
			for (MoveableRectangle rect:this.rectangles) {
				rect.updatePosition(this.getWidth(), this.getHeight());
			}
			this.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// probably not the best error handling technique
				e.printStackTrace();
			}
		}
	}



}
