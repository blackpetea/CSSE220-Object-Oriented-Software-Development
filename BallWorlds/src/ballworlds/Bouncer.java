package ballworlds;

import java.awt.Color;

public class Bouncer extends AbstractBouncer {
	private double radius;
	private Color color;

	public Bouncer(BallEnvironment world) {
		super(world);
		this.color = Color.green;
		this.radius = world.getSize().getWidth() / 20;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void updatePosition() {
		super.setCenterPoint(super.bouncing());
	}

	@Override
	public void updateSize() {
		// Size does not change 

	}

	@Override
	public void updateColor() {
		// Color does not change
	}

	@Override
	public double getDiameter() {
		return this.radius * 2;
	}

}
