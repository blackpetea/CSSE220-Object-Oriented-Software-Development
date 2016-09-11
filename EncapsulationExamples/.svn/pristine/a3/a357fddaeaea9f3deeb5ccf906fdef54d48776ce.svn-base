package twovstwo;

import java.util.ArrayList;
import java.util.HashMap;

public class Match {
	private HashMap<ArrayList<Player>, ArrayList<Player>> records;

	public HashMap<ArrayList<Player>, ArrayList<Player>> getRecrods() {
		return this.records;
	}

	public Match() {
		this.records=new HashMap<ArrayList<Player>, ArrayList<Player>>();
	}

	public void add_Match(ArrayList<Player> teamnames, int winningteam) {
		//add match record
		this.records.put(teamnames, new ArrayList<Player>());
		
		if (winningteam == 1) {
			this.records.get(teamnames).add(teamnames.get(0));
			this.records.get(teamnames).add(teamnames.get(1));
			teamnames.get(0).setWintimes();
			teamnames.get(1).setWintimes();

		} else {
			this.records.get(teamnames).add(teamnames.get(2));
			this.records.get(teamnames).add(teamnames.get(3));
			teamnames.get(2).setWintimes();
			teamnames.get(3).setWintimes();

		}
	}

}
