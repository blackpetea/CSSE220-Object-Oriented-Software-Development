import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListenerDemo {

	public KeyListenerDemo() {
		// TODO Auto-generated constructor stub.
	}
	
  public static void main(String[] a) {
    JFrame frame = new JFrame("Popup JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField();
    textField.addKeyListener(new MyKeyListener());

    frame.add(textField);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
