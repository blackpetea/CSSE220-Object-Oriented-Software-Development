import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class RectContainer {
	
	private int xl;
	private int yl;
	private int xr;
	private int yr;
	
	private int count;
	
	private int minixleft;
	private int miniyleft;
	private int maxxright;
	private int maxyright;

	public RectContainer() {
	}

	public void addRect(RedRect rectt) {
		xl=rectt.getXleft();
		yl=rectt.getYleft();
		xr=rectt.getXright();
		yr=rectt.getYright();
		
		if (count==0) {
			this.minixleft=this.xl;
			this.miniyleft=this.yl;
			this.maxxright=this.xr;
			this.maxyright=this.yr;
			count++;
			
		}
		
		if (this.xl<this.minixleft) {
			this.minixleft=this.xl;
		}
		if (this.yl<this.miniyleft) {
			this.miniyleft=this.yl;
		}
		if (this.xr>this.maxxright) {
			this.maxxright=this.xr;
		}
		if (this.yr>this.maxyright) {
			this.maxyright=this.yr;
		}
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.black);
		Rectangle2D.Double kuang=new Rectangle2D.Double(this.minixleft,this.miniyleft,maxxright-minixleft,maxyright-miniyleft);
		g2.draw(kuang);
	}
}
