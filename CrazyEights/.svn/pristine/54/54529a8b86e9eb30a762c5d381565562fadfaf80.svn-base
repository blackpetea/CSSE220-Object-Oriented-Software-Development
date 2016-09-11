import java.util.ArrayList;

public class Player {
	private int player_order;
	private ArrayList<String> cards;//the all cards that a player have

	public Player(int order) {
		this.cards = new ArrayList<>();
		this.player_order=order;
	}

	public ArrayList<String> getCards() {
		return this.cards;
	}

	public void addCard(String new_card) {
		this.cards.add(new_card);
	}
	
	public String cards_list() {
		String p_cards = this.cards.get(0);
		for (int i = 1; i < this.cards.size(); i++) {
			p_cards += " " + this.cards.get(i);
		}
		return p_cards;
	}
	
	public String playCard(String cardplayed) {
		if (this.cards.contains(cardplayed)) {
			for (int i=0;i<this.cards.size();i++) {
				if (this.cards.get(i).equals(cardplayed)) {
					this.cards.remove(i);
				}
			}
			return cardplayed;
		} else {
			return "Card was not valid for play. Please try again.\nPlayer " + (this.player_order+1)
					+ ", your turn.\nYour cards are " + this.cards_list() + "\nThe top discard is " + new CrazyEights().getTop_card(); 
		}
	}
}
