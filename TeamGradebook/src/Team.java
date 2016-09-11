import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Student> teammembers;
	private ArrayList<Double> teamgrades = new ArrayList<Double>();
	private int gradetimes = 0;

	public Team(String teamName, ArrayList<Student> memberNames) {//construct a team with team name and member names
		this.name = teamName;
		this.teammembers = memberNames;
	}

	public String getTeamname() {//return the name of the team
		return this.name;
	}

	public ArrayList<Student> getTeammembers() {//return the list of names of the team members
		return this.teammembers;
	}

	public void setTeamGrade(double score) {//add grade to team and all the team members
		this.teamgrades.add(score);
		this.gradetimes++;
		for (int i = 0; i < this.teammembers.size(); i++) {
			this.teammembers.get(i).setGrades(score);
		}
	}

	public double totalteamGrade() {//return the total grade of the team
		if (this.teamgrades.size() == 0) {
			return 0;
		}
		double sum = 0;
		for (int i = 0; i < this.teamgrades.size(); i++) {
			sum = sum + this.teamgrades.get(i);
		}
		return sum;
	}

	public double averageTeamGrade() {//return the average grade of the team
		return this.totalteamGrade() / this.gradetimes;
	}
}
