package chessPieces;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Queen extends ChessPiece {
	
	public Queen(boolean isWhite) {
		this.setisWhite(isWhite);
	}
	
	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return dx <= 8 && dy <= 8;
	}

	@Override
	public void draw(Graphics2D graphics2, int x, int y, int squareSize) {
		String fileName = "images\\queen" + "-";
		fileName += this.isWhite() ? "white" : "black";
		fileName += ".png";
		BufferedImage img;
		try {
			img = ImageIO.read(new File(fileName));
			graphics2.drawImage(img, x, y, squareSize, squareSize, null);
		} catch (IOException e) {}
	}
}
