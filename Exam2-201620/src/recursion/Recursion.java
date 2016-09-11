package recursion;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely
 * used library functions, for loops, or while loops.
 * 
 * You can use recursive helper functions if you choose, but most of these
 * problems do not require them.
 * 
 * YOU ONLY NEED TO SOLVE 3 OF THESE 4 RECURSION PROBLEMS.
 * 
 * Leave the problem you've decided not to solve blank, and leave a comment
 * saying you've decided to skip it.
 * 
 * @author Amanda Stouder, Created on 12/22/2015
 * 
 *
 */

public class Recursion {

	/**
	 * Removes lowerCase letters from the input string. Use the isLowerCase
	 * method on the Character class, like this: Character.isLowerCase(c);
	 * 
	 * NOTE: The input string will not be null.
	 * 
	 * For example:
	 * 
	 * Recursion.removeLowerCase("aBCDeFGHi") returns "BCDFGH"
	 * Recursion.removeLowerCase("") returns ""
	 * Recursion.removeLowerCase("ABCDEFGHI") returns "ABCDEFGHI"
	 * Recursion.removeLowerCase("abcdefg") returns ""
	 * 
	 * @param input
	 *            - The string to remove lowerCase letters from
	 * 
	 * @return the given string without lowercase letters
	 */
	public static String removeLowerCase(String input) {
		if (input.length() == 0) {
			return "";
		}
		char first = input.charAt(0);
		if (!Character.isLowerCase(first)) {
			return first + removeLowerCase(input.substring(1));
		}
		return removeLowerCase(input.substring(1));
	}

	/**
	 * Checks to see if the values in the range from startIndex to endIndex
	 * (inclusive for both) are odd numbers For example, {1, 3, 5} returns true
	 * but {2, 3, 1} returns false.
	 * 
	 * Examples: allOdds({1, 9, 5, 7}) returns true allOdds({1, 2, 5}) returns
	 * false allOdds({}) returns true
	 * 
	 * Note: You may need to add a helper method to this.
	 * 
	 * @param array
	 *            - the array to check
	 * @return true if only odd numbers, false otherwise
	 */

	public static boolean allhelper(int[] array, int order) {
		if (array.length == order) {
			return true;
		}
		int first = array[order];
		if (first % 2 == 1) {
			return allhelper(array, order + 1);
		}
		return false;
	}

	public static boolean allOdds(int[] array) {
		return allhelper(array, 0);
	}

	/**
	 * Recursively converts a String representation of an integer (such as
	 * "123") to an integer. You are NOT allowed to use any parse methods built
	 * into Java for this.
	 * 
	 * Examples: convertToInteger("123") returns 123 convertToInteger("7518")
	 * returns 7518 convertToInteger("") returns 0
	 * 
	 * 
	 * @param value
	 *            - The value to convert.
	 * @return - The value given as an int instead of a STring
	 */
	public static int convertToInteger(String value) {
		if (value.equals("")) {
			return 0;
		}
		char first = value.charAt(value.length() - 1);
		int firstNum = getNumber(first);
		return firstNum + convertToInteger(value.substring(0, value.length() - 1)) * 10;
	}

	/***
	 * Converts a character representing a single digit to an integer for that
	 * digit.
	 * 
	 * @param digit
	 *            - The digit to convert
	 * @return an integer representation of a
	 */
	private static int getNumber(char digit) {
		return digit - '0';
	}

	/**
	 * Calculates the average of the values given.
	 * 
	 * NOTE: The values array will not be empty.
	 * 
	 * For example:
	 * 
	 * calculateAverage(new double[] {1.0, 1.0, 1.0}); returns 1.0
	 * calculateAverage(new double[] {1.0, 2.0, 3.0}); returns 2.0
	 * calculateAverage(new double[] {2.0, 4.0}); returns 3.0
	 * calculateAverage(new double[] {7.0, 0.0}); returns 3.5
	 * calculateAverage(new double[] {7.0}); returns 7.0
	 *
	 * HINT: You'll need a helper method to complete this recursively.
	 *
	 * @param values
	 *            - The values to average
	 * @return The average of all values in the values array
	 */
	public static double calculateAverage(double[] values) {
		// Skip this problem
		return 0.0;
	}

}
