import java.util.HashMap;

public class StudentAssignments {
	String name;
	HashMap<String,Double> assignments=new HashMap<String,Double> ();
	
	public StudentAssignments(String studentname) {
		this.name=studentname;
	}
	
	public StudentAssignments() {
		this.name="Studenty McStudenton";
	}
	
	public void addAssignment(String assname,double grade) {
		this.assignments.put(assname,grade);
	}
	
	public void printGradeReport() {
		String res="";
		for (String keys:this.assignments.keySet()) {
			res=res+" "+keys+" - "+this.assignments.get(keys);
		}
		System.out.println(this.name+res);
	}
}
