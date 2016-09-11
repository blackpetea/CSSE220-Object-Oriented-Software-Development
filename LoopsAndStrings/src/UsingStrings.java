/**
 * This class demonstrates using methods on String objects, plus implicit and
 * explicit parameters.
 * 
 * @author Curt Clifton. Created Sep 7, 2008.
 */
public class UsingStrings {

	/**
	 * This is the starting point for the example.
	 * 
	 * @param args
	 *            Command-line arguments, ignored here
	 */
	public static void main(String[] args) {
		String name = "Bob Forapples";
		String major = "Party Game Engineering";
		int age = 20;

		int nameLength = name.length();


		System.out.println("'"+ name + "' has " + nameLength + " characters" );

		/* TODO in class: print Bob's name, major and age. */
		System.out.println(name+" is "+age+" years old"+" and he is in "+major);

		/*
		 * TODO in class: Use the replace() method of String to replace "Party Game" with
		 * "Celebration Entertainment" in Bob's major.
		 */
		String major2=major.replace("Party Game", "Celebration Entertainment");

		/* TODO in class: print Bob's name, major, and age again. */
		System.out.println(name+" is "+age+" years old"+" and he is in "+major2);
		/*
		 * TODO in class: Change Bob's major again, this time to be in all uppercase. Use
		 * the toUpperCase() method of String.
		 */
		String major3=major2.replace("Celebration Entertainment", "computer");

		/* TODO in class: print Bob's name, major, and age again. */
		System.out.println(name+" is "+age+" years old"+" and he is in "+major3.toUpperCase());
	}
}
