package ballworlds;

import java.awt.Color;
import java.awt.geom.Point2D;

public class Mover extends Ball {
	private double x_cord;
	private double y_cord;
	private double x_velocity;
	private double y_velocity;
	private double radius;
	private Color color;

	public Mover(BallEnvironment world) {
		super(world);

		// Set center of circle at the center of frame 
		this.x_cord = world.getCenterPoint().getX();
		this.y_cord = world.getCenterPoint().getY();
		super.setCenterPoint(new Point2D.Double(this.x_cord, this.y_cord));

		// Set velocity randomly from-1 to 1
		this.x_velocity = super.randomVelocity();
		this.y_velocity = super.randomVelocity();

		this.color = Color.yellow;

		// Set the radius of circle as 1/20 of frame width.
		this.radius = world.getSize().getWidth() / 20;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void updatePosition() {
		// change the center of circle based on velocities in different axies
		this.x_cord += this.x_velocity;
		this.y_cord += this.y_velocity;
		super.setCenterPoint(new Point2D.Double(this.x_cord, this.y_cord));

	}

	@Override
	public void updateSize() {
		// No change for size

	}

	@Override
	public void updateColor() {
		// No change for color

	}

	@Override
	public double getDiameter() {
		return this.radius * 2;
	}

}
