/**
 * A class for recursion problems.
 *  
 * Note that you should feel free to add new methods
 * (e.g. utility methods or recursive helper methods) 
 * if they will help you solve the problems.
 * 
 * @author TODO <YOUR_NAME_GOES_HERE>
 *
 */
public class Recursion {
	
	/**
	 * Reverses a string.
	 * 
	 * For example "abc" becomes "cba"
	 * 
	 * Please don't use string's reverse function - do it
	 * with recursion.
	 * 
	 * @param input
	 * @return the reversed string.
	 */
	public String reverseString(String input) {
		if (input.length()<2) {
			return input;
		}
		return input.charAt(input.length()-1)+reverseString(input.substring(0,input.length()-1));
	}
	
	/**
	 * 
	 * This function takes two strings, an original
	 * string and another string which has the same
	 * characters in the same order as in the original
	 * string, but with several characters removed.
	 * 
	 * The function returns the removed characters.
	 * 
	 * So for example:
	 * 
	 * "abcd" and "bd" yields "ac"
	 * "buffalossecretninjamessage" "buffalosninja" yields "secretmessage"
	 * 
	 * @param original
	 * @param missing
	 * @return String of the characters omitted from missing
	 */
	public String computeMissingCharacters(String original, String missing) {
		if (original.length()==0) {
			return "";
		}
		if (missing.length()==0) {
			return original;
		}
		
		if (original.charAt(0)==missing.charAt(0)) {
			return computeMissingCharacters(original.substring(1), missing.substring(1));
		} else {
			return ""+original.charAt(0)+computeMissingCharacters(original.substring(1), missing);
		}
	}
	
	/**
	 * 
	 * Returns true if input has an even number of x characters
	 *         false if input has an odd number of x characters
	 *         
	 * Examples:
	 * 
	 * "xHELLOx" yields true
	 * "xxfoox" yields false
	 * "hello" returns true
	 * "x" returns false
	 * 
	 * @param input
	 * @return true if input has an even number of x characters, false otherwise
	 */
	public int helper(String input) {
		if (input.length()<2) {
			return input.equals("x")? 1:0;
		}
		if (input.charAt(0)=='x') {
			return 1+helper(input.substring(1));
		}
		return helper(input.substring(1));
	}
	
	
	public boolean hasEvenNumberOfXs(String input) {
		return helper(input)%2==0;
	}
}
