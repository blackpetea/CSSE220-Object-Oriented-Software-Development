package rotatingshapes;

import java.awt.Rectangle;
import java.awt.Shape;

public class RotatingSquare extends RotatingShape {

	public RotatingSquare(int startingX, int startingY) {
		super(startingX, startingY);
	}

	@Override
	public Shape getShape() {
		return new Rectangle(0, 0, WIDTH, WIDTH);
	}

	@Override
	public char getLetter() {
		return 's';
	}

	
}
