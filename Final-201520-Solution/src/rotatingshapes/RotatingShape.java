package rotatingshapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public abstract class RotatingShape implements KeyListener {

	protected static final int WIDTH = 50;
	
	private int centerX;
	private int centerY;
	private Color color;
	private double rotation;
	private boolean paused;
	
	public RotatingShape(int startingX, int startingY) {
		this.centerX = startingX;
		this.centerY = startingY;
		Random r = new Random();
		this.color = new Color(r.nextFloat(), r.nextFloat(), r.nextFloat());
		paused = false;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.rotate(rotation);
		g.translate(centerX - WIDTH/2, centerY - WIDTH/2);
		g.fill(getShape());
		g.translate(-(centerX - WIDTH/2), -(centerY - WIDTH/2));
		g.rotate(-rotation);
	}
	
	public abstract Shape getShape();
	public abstract char getLetter();
	
	public void update() {
		if(!paused)
			rotation += .01;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		if(e.getKeyChar() == getLetter()) {
			paused = !paused;
		}
		
	}
}
