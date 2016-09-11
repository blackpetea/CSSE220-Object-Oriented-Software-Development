package chessPieces;

import java.awt.Graphics2D;

public abstract class ChessPiece {

	private boolean isWhite;
	
	public void setisWhite(boolean pro) {
		this.isWhite=pro;
	}

	public abstract boolean checkMove(int x, int y);

	public abstract void draw(Graphics2D graphics2, int x, int y, int squareSize);

	public boolean checkAttack(int dx, int dy, ChessPiece piece) {
		if (this.isWhite() == piece.isWhite()) {
			// don't attack your own pieces
			return false;
		}
		return checkMove(dx, dy);
	}

	public boolean isWhite() {
		return this.isWhite;
	}

	public boolean canJumpPieces() {
		return false;
	}
}
