import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyWorld implements MouseListener {
	private ArrayList<Ball> myBall;
	private boolean gravity;

	public MyWorld() {
		myBall = new ArrayList<Ball>();
		gravity = false;

	}

	public void gravityStart() {
		Runnable move = new Runnable() {
			@Override
			public void run() {
				try {
					while (isGravity()) {
						Thread.sleep(100);
						graDrop();
					}
				} catch (InterruptedException exception) {

				}
			}
		};
		new Thread(move).start();
	}

	public boolean isGravity() {
		return this.gravity;
	}

	public void setGravity(boolean gravity) {
		this.gravity = gravity;
	}

	public ArrayList<Ball> getMyBall() {
		return this.myBall;
	}

	public void graDrop() {
		if (this.myBall.size() != 0) {
			for (Ball ball : this.myBall) {
				ball.drop();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.myBall.add(new Ball(e.getPoint()));

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}