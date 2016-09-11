import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
	    System.out.println("Key Pressed: " + e.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent e) {
	    char c = e.getKeyChar();
	    if (c=='a') {
	    	System.out.println("Key Pressed: " + c);
	    }
	}

	@Override
	public void keyTyped(KeyEvent e) {
	    char c = e.getKeyChar();
	    if (c=='a') {
	    	System.out.println("Key Pressed: " + c);
	    }
	}


}
