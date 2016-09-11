package chessSupport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import chessPieces.AlbinProvider;
import chessPieces.StandardBoardProvider;


@SuppressWarnings("serial")
public class BoardLayoutSelector extends JPanel{

	private final ChessBoard board;

	public BoardLayoutSelector(ChessBoard board) {
		this.board = board;
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		buttons.add(new BoardButton(new StandardBoardProvider(), "Standard Board"));
		buttons.add(new BoardButton(new AlbinProvider(), "Albin Countergambit"));
		for (JButton b : buttons) {
			this.add(b);
		}
	}
	
	class BoardButton extends JButton implements ActionListener
	{
		private BoardLayoutProvider selector;
		
		public BoardButton(BoardLayoutProvider selector, String text) {
			this.selector = selector;
			this.setText(text);
			this.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent ev) {
			board.setBoard(selector);
		}
	}
	
}
