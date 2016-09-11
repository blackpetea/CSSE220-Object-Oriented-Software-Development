package slides;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class demonstrates ActionListeners.
 * 
 * @author Curt Clifton. Created Oct 7, 2008.
 */
public class BreakfastMain {
	
	String myString;
	
	public void myStringchange() {
		myString="Hello World";
	}
	
	class MyClass implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {//inner class
			System.out.println(myString);
			
		}
		
	}


	/**
	 * Starts the program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		/*
		 * TODO: Use JOptionPane to get description of porridge flavor; update
		 * inner classes to use the String.
		 */
		JFrame frame = new JFrame();
		frame.setTitle("Breakfast for Goldilocks");
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		//example for external class
		JButton eatButton = new JButton("Eat Porridge");
		panel.add(eatButton);
		
		JButton anotherButton = new JButton("Another");
		panel.add(anotherButton,BorderLayout.NORTH);
		
		MyButtonListener hotListener = new MyButtonListener(anotherButton,"Ha!");
		eatButton.addActionListener(hotListener);
		
		//two button change text for each other
		MyButtonListener listener2 = new MyButtonListener(eatButton,"Hahahaha");
		anotherButton.addActionListener(listener2);
		
		//inner class sample
		BreakfastMain myMain=new BreakfastMain();
		
		final JButton anotherButton2 = new JButton("Another2");
		MyClass foo=myMain.new MyClass();
		anotherButton2.addActionListener(foo);
		panel.add(anotherButton2,BorderLayout.NORTH);
		
		//anonymous class
		JButton anotherButton3 = new JButton("Another3");
		anotherButton3.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("This ugly syntax works");
				anotherButton2.setText("This works too");	
			}
		}
				);
		panel.add(anotherButton3);

		/*
		 * CONSIDER: pack() sets the size of the frame based on what we've put
		 * in it:
		 */
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
