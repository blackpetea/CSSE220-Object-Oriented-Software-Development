package Note;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Note {

	private class ActionListenerTest implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//Get the componet that implement this listener,e.g. JButton
			e.getSource();
		}
	}
	
	private class MouseListenerTest implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			//Get point where clicked
			e.getPoint();
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {			
		}	
	}

	public static void main(String[] arg0) {
		// Compare two Strings, -1 for smaller, 0 for equal,1 for larger
		String objOne = "";
		String objTwo = "";
		objOne.compareTo(objTwo);
	}

}
