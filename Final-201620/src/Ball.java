import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Ball {
	private Point2D center;

	public Ball(Point2D point) {
		Point2D centerPoint = new Point2D.Double(point.getX() - 15, point.getY() - 15);
		this.center = centerPoint;
	}

	public void drop() {
		double newY = this.center.getY() + 5;
		this.center = new Point2D.Double(this.center.getX(), newY);
	}

	public Shape getShape() {
		return new Ellipse2D.Double(this.center.getX(), this.center.getY(), 30, 30);
	}

}
