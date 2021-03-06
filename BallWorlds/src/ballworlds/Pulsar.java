package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

import util.Random;

public class Pulsar extends Ball {

	private double radius;
	private Color color;
	private int rgb;
	private boolean flag;

	public Pulsar(BallEnvironment world) {
		super(world);

		// Set the radius of circle as 1/20 of frame width. 
		this.radius = world.getSize().getWidth() / 20;

		// Random choose the center of circle
		int x = Random.randRange(0, (int) world.getSize().getWidth());
		int y = Random.randRange(0, (int) world.getSize().getHeight());
		super.setCenterPoint(new Point2D.Double(x, y));

		// Set up the color of circle
		this.rgb = 0;
		this.color = Color.white;
		this.flag = true;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void updatePosition() {
		// The position will not change.

	}

	@Override
	public void updateSize() {
		// The size will not change.

	}

	@Override
	public void updateColor() {
		if (this.flag) {// Increase the value of RGB 1 each time
			this.rgb += 1;
			this.color = new Color(this.rgb, this.rgb, this.rgb);
			if (this.rgb == 255) {
				this.flag = false;
			}
		} else {// Decrease the value of RGB 1 each time
			this.rgb -= 1;
			this.color = new Color(this.rgb, this.rgb, this.rgb);
			if (this.rgb == 0) {
				this.flag = true;
			}
		}

	}

	@Override
	public double getDiameter() {
		return this.radius * 2;
	}

}
