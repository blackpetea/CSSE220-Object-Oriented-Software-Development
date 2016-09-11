import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Sun {
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final int NUMBER_OF_RAYS = 8;
	private static final double RAY_LENGTH_SCALE = 0.5;
	private static final double RAY_WIDTH_SCALE = 0.1;
	private static final double RAY_DISTANCE_FROM_SUN_SCALE = .2;
	private static final double DEFAULT_SUN_DIAMETER = 100.0;
	private static final double DEFAULT_SUN_X = 100.0;
	private static final double DEFAULT_SUN_Y = 100.0;
	private static final Color DEFAULT_SUN_COLOR = Color.YELLOW;

	private double x;
	private double y;
	private double circleDiameter;
	private double rayLength;
	private double rayWidth;
	private double rayDistanceFromSun;
	private Color color;

	private Ellipse2D.Double sunCircle;
	private Rectangle2D.Double sunRay;

	public Sun() {
		this.x = DEFAULT_SUN_X;
		this.y = DEFAULT_SUN_Y;
		this.circleDiameter = DEFAULT_SUN_DIAMETER;
		this.rayLength = RAY_LENGTH_SCALE * this.circleDiameter;
		this.rayWidth = RAY_WIDTH_SCALE * this.circleDiameter;
		this.rayDistanceFromSun = RAY_DISTANCE_FROM_SUN_SCALE * this.circleDiameter;
		this.color = DEFAULT_SUN_COLOR;
	}

	public Sun(double xd, double yd, double circleDiameter, Color color) {
		this.x = xd;
		this.y = yd;
		this.circleDiameter = circleDiameter;
		this.rayLength = RAY_LENGTH_SCALE * this.circleDiameter;
		this.rayWidth = RAY_WIDTH_SCALE * this.circleDiameter;
		this.rayDistanceFromSun = RAY_DISTANCE_FROM_SUN_SCALE * this.circleDiameter;
		this.color = color;
	}

	public Ellipse2D getSunCircle() {
		//return the sun circle
		return this.sunCircle;
	}

	public void setSunCircle() {
		//set the sun circle
		this.sunCircle = new Ellipse2D.Double(this.x, this.y, this.circleDiameter, this.circleDiameter);
	}

	public Rectangle2D getSunRay() {
		//return the sun ray
		return this.sunRay;
	}

	public void setSunRay() {
		//set the sun ray
		double xdd = -0.5 * this.rayWidth;
		double ydd = -0.5 * this.circleDiameter - this.rayDistanceFromSun - this.rayLength;
		this.sunRay = new Rectangle2D.Double(xdd, ydd, this.rayWidth, this.rayLength);
	}

	public void drawOn(Graphics2D graphics) {
		//draw a sun circle
		this.setSunCircle();
		double cenx = this.x + 0.5 * this.circleDiameter;
		double ceny = this.y + 0.5 * this.circleDiameter;

		graphics.setColor(this.BORDER_COLOR);
		graphics.draw(this.getSunCircle());

		graphics.setColor(this.color);
		graphics.fill(this.getSunCircle());

		this.setSunRay();
		Rectangle2D ray = this.getSunRay();
		
		//draw several sun rays
		for (int i = 0; i < this.NUMBER_OF_RAYS; i++) {
			graphics.setColor(this.BORDER_COLOR);

			graphics.translate(cenx, ceny);
			graphics.rotate(i * Math.toRadians(360 / this.NUMBER_OF_RAYS));

			graphics.draw(ray);
			graphics.setColor(this.color);
			graphics.fill(ray);

			graphics.rotate(-i * Math.toRadians(360 / this.NUMBER_OF_RAYS));
			graphics.translate(-cenx, -ceny);
		}
		graphics.setColor(Color.black);
	}

}
