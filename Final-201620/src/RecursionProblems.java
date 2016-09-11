
public class RecursionProblems {

	/**
	 * Returns a string in which any duplicated characters are separated by *s.
	 * 
	 * For example:
	 * 
	 * addStarsBetweenDuplicates(""); -> "" addStarsBetweenDuplicates("abc"); ->
	 * "abc" addStarsBetweenDuplicates("hello"); -> "hel*lo"
	 * addStarsBetweenDuplicates("aabbccdd"); -> "a*ab*bc*cd*d"
	 * 
	 * @param str
	 *            - the input string
	 * @return string with duplicates separated by *
	 */

	public static String addStarsBetweenDuplicates(String str) {
		if (str.length() < 2) {
			return str;
		}
		char first = str.charAt(0);
		if (first == str.charAt(1)) {
			return first + "*" + addStarsBetweenDuplicates(str.substring(1));
		}
		return first + addStarsBetweenDuplicates(str.substring(1));
	}

	/**
	 * Given a String, determine whether it contains a specified char and
	 * expected number of times.
	 * 
	 * You may use a helper function to solve this problem if you wish.
	 * 
	 * For example: hasCharXTimes("abc", 'a', 1) results in true
	 * hasCharXTimes("abca", 'a', 1) results in false hasCharXTimes("abca", 'a',
	 * 2) results in true hasCharXTimes("", 'a', 1) results in false
	 * hasCharXTimes("abc", 'z', 1) results in false hasCharXTimes("bbb", 'b',
	 * 3) results in true hasCharXTimes("bb", 'b', 2) results in true
	 * hasCharXTimes("bbb", 'b', 2) results in false
	 * 
	 * @param data
	 *            - String to look through
	 * @param toMatch
	 *            - the value to match in the String
	 * @param expectedCount
	 *            - the expected count of the value to match
	 * @return true if the char was found the expected number of times
	 */
	public static boolean hasCharXTimes(String data, char toMatch, int expectedCount) {
		return helper(data, toMatch, 0) == expectedCount;
	}

	public static int helper(String data, char toMatch, int count) {
		if (data.length() == 0) {
			return count;
		}
		char first = data.charAt(0);
		if (first == toMatch) {
			return helper(data.substring(1), toMatch, count + 1);
		}
		return helper(data.substring(1), toMatch, count);
	}
}
