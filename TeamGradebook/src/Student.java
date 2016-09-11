import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Double> grades = new ArrayList<Double>();

	public ArrayList<Double> getGrades() {//return the list of grades
		return this.grades;
	}

	public void setGrades(double result) {//add a grade into grades list
		this.grades.add(this.grades.size(), result);
	}

	/**
	 * makes a new student object
	 * 
	 * @param newName
	 *            the name of the student
	 */
	public Student(String newName) {//construct a student with a new name
		this.name = newName;
	}

	/**
	 * gets the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName() {//return the name of a student
		return this.name;
	}

	public double sumofGrade() {//return the total grade of the student
		double sum = 0;
		for (int i = 0; i < this.grades.size(); i++) {
			sum = sum + this.grades.get(i);
		}
		return sum;
	}
}
