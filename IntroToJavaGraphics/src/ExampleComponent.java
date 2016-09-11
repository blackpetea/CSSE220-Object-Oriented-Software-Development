import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class ExampleComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		Graphics2D g2=(Graphics2D) g;
//		int max=this.getHeight()-20;
//		for (int i=0;i<max/10;i++) {
//			if (this.getHeight()>this.getWidth()) {
//				max=this.getWidth()-20;
//			} else {
//				max=this.getHeight()-20;
//			}
//			g2.drawRect(10, 10, 10+10*i, 10+10*i);
//		}
//		
		Ellipse2D g2=(Ellipse2D) g;
		
	
	
	}

	public ExampleComponent() {
	}

	public static void main(String[] args) {

	}
}
