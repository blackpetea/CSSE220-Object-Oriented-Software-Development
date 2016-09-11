import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class RedRect {

	private int xleft;
	private int yleft;
	private int xright;
	private int yright;
	private int width;
	private int height;
	private Rectangle2D.Double rect;
	
	public int getXleft() {
		return this.xleft;
	}

	public int getYleft() {
		return this.yleft;
	}

	public int getXright() {
		return this.xright;
	}

	public int getYright() {
		return this.yright;
	}

	public void setYright(int yright) {
		this.yright = yright;
	}
	
	
	
	public RedRect() {
		Random r=new Random();
		xleft=r.nextInt(400);
		yleft=r.nextInt(400);
		width=r.nextInt(400);
		height=r.nextInt(400);
		xright=xleft+width;
		yright=yleft+height;
		rect=new Rectangle2D.Double(xleft, yleft, width, height);
	}

	public RedRect(int xuleft,int yuleft,int xlright,int ylright) {
		xleft=xuleft;
		yleft=yuleft;
		xright=xlright;
		yright=ylright;
		width=xright-xleft;
		height=yright-yleft;
		rect=new Rectangle2D.Double(xleft, yleft, width, height);
		
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.fill(rect);
	}

}
