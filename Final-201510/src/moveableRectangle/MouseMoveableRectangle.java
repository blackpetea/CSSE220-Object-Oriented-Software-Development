package moveableRectangle;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseMoveableRectangle extends MoveableRectangle implements MouseListener {
	private double mouseX;
	private double mouseY;
	
	public MouseMoveableRectangle(Color color) {
		super(color);
	}

	public MouseMoveableRectangle() {

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.mouseX=arg0.getPoint().getX();
		this.mouseY=arg0.getPoint().getY();
		this.setxVelocity((this.mouseX-this.getCenterX())/100);
		this.setyVelocity((this.mouseY-this.getCenterY())/100);

		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

}
