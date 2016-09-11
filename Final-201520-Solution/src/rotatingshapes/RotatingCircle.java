package rotatingshapes;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class RotatingCircle extends RotatingShape {

	public RotatingCircle(int startingX, int startingY) {
		super(startingX, startingY);
	}

	@Override
	public Shape getShape() {
		return new Ellipse2D.Double(0, 0, WIDTH, WIDTH);
	}

	@Override
	public char getLetter() {
		return 'c';
	}

	
}
