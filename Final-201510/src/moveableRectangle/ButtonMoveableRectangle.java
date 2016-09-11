package moveableRectangle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ButtonMoveableRectangle extends MoveableRectangle implements ActionListener{
	
	public ButtonMoveableRectangle(Color color) {
		super(color);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton source=(JButton) arg0.getSource();
		if (source.getText().equals("UP")) {
			this.setxVelocity(0);
			this.setyVelocity(-1);
		} else if (source.getText().equals("DOWN")) {
			this.setxVelocity(0);
			this.setyVelocity(1);
		} else if (source.getText().equals("LEFT")) {
			this.setxVelocity(-1);
			this.setyVelocity(0);
		} else  if (source.getText().equals("RIGHT")) {
			this.setxVelocity(1);
			this.setyVelocity(0);
		} 
		
	}

}
