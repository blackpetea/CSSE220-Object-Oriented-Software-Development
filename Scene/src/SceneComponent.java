import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class SceneComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		Graphics2D graphics2 = (Graphics2D) graphics;
		this.drawScene(graphics2);
	}
	
	private void drawScene(Graphics2D graphics) {
		Sun dsun=new Sun();
		Face dface=new Face(450,350,30,Color.yellow,Color.black,Color.blue,Color.red);
		Rectangle2D sky=new Rectangle2D.Double(0,0,750,375);
		Rectangle2D grass=new Rectangle2D.Double(0,375,750,375);
		
		graphics.setColor(Color.blue);
		graphics.fill(sky);
		
		graphics.setColor(Color.green);
		graphics.fill(grass);
		
		dsun.drawOn(graphics);
		dface.drawOn(graphics);
	}

}
