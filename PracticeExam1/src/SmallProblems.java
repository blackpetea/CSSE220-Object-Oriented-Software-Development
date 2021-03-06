import java.util.ArrayList;
import java.util.HashMap;


/**
 * Contains a set of small problems on various topics that were covered during the first 3 weeks of class.
 *
 * @author TODO <PUT_YOUR_NAME_HERE>.
 *         Created Sep 22, 2014.
 */
public class SmallProblems {
	
	
	/**
	 * 
	 * Returns a case insensitive count of how many times the letter 
	 * 'Y' (or 'y') appears in the string.
	 * 
	 * If the string has no characters, it should return 0.
	 * 
	 * Examples:
	 * "yes" returns 1
	 * "YesyCounts" returns 2
	 * "yYyYYy" returns 6
	 * "abc" returns 0
	 * "" returns 0
	 * 
	 * @param input string to count the 'y' characters
	 * @return count of number of y's
	 */
	public static int numberOfYs(String input) {
		int count=0;
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i)=='Y' ||input.charAt(i)=='y' ) {
				count++;
			}
		}
		return count;
	}
	

	/**
	 * 
	 * Returns the number of threes in the prime factorization of
	 * the given integer 
	 * 
	 * You can assume the number is positive or 0
	 * 
	 * Examples:
	 * 6 returns 1 
	 * 27 returns 3
	 * 54 returns 3 (PF is 3*3*3*2)
	 * 7 returns 0
	 * 3 returns 1
	 * 0 returns 0
	 * 
	 * @param number input number
	 * @return count of 3s in the number's prime factorization
	 */
	public static int countNumberOfThreesInPrimeFactorization(int number) {
		int count=0;
		int num=number;
		int rem=num%3;
		while (rem==0&&num>=3) {
			count=count+1;
			num=num/3;
			rem=num%3;
		}
		return count;
	}
	
	
	/**
	 * 
	 * Takes two arrays of arbitrary length.
	 * This function swaps the smallest integer of array1 with the
	 * largest of array2. It returns a new array containing the
	 * two integers that were swapped with the smallest first.
	 * 
	 * You can assume that neither array is empty, that is, both
	 * array1 and array2 have at least one integer. 
	 * You can also assume that each array contains unique values.
	 * 
	 * Examples:
	 * 
	 * {1,2,3} and {-1,-2,-3}:  Swaps 1 and -1 yielding 
	 * {-1,2,3} and {1,-2,-3} and returns {-1, 1}
	 * 
	 * {8,4,12,16} and {42,100,16}: Swaps 4 and 100 yielding 
	 * {8,100,12,16} and {42,4,16} and returns {4,100}
	 * 
	 * {50,40,30,100} and {90,452,45,50,80,85}: Swaps 30 and 452 yielding
	 * {50,40,452,100} and {90,30,45,50,80,85} and returns {30,452} 
	 * 
	 * {75,50} and {24,12,37,2}: Swaps 50 and 37 yielding
	 * {75,37} and {24,12,50,2} and returns {37,50}
	 * 
	 * @param array1, first array to swap smallest integer with:
	 * @param array2, second array to swap largest integer with array1
	 * @return an integer array of size two containing the integers that
	 * were swapped, while array1 and array2 have swapped 1 value each
	 */
	public static int[] swapExtremes(int[] array1, int[] array2) {
		int min1=array1[0];
		int max2=array2[0];
		int ind1=0;
		int ind2=0;
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]<min1) {
				min1=array1[i];
				ind1=i;
			}
		}
		
		for (int i=0;i<array2.length;i++) {
			if (array2[i]>max2) {
				max2=array2[i];
				ind2=i;
			}
		}
		
		array1[ind1]=max2;
		array2[ind2]=min1;
		
		if (max2<min1) {
			return new int[] {max2,min1};
		} else {
			return new int[] {min1,max2};
		}
	}
	
	/**
	 * Takes an ArrayList of integers.
	 * 
	 * Returns an ArrayList that for each integer in the original ArrayList, repeats 
	 * that integer the number of times equal to the integer's value.
	 * 
	 * Examples:
	 * [1,3] yields [1,3,3,3]
	 * [2,2,0,0] yields [2,2,2,2]  NOTE: 0 is omitted
	 * [] yields []
	 * [2,4,6,8] yields [2,2,4,4,4,4,6,6,6,6,6,6,8,8,8,8,8,8,8,8]
	 * 
	 * You can either MODIFY the ArrayList that is passed in
	 * OR construct a new ArrayList and return that.  Either
	 * is fine.
	 * 
	 * @param original - list of integers to be repeated
	 * @return ArrayList with values repeated
	 */
	public static ArrayList<Integer> repeatX(ArrayList<Integer> original) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		for (Integer time:original) {
			for (int i=0;i<time;i++) {
				res.add(time);
			}
		}
		return res;
	}
	

	/**
	 * 
	 * Takes an array of Strings where each element is a word.
	 * 
	 * The function returns the word that appears in the String array the 
	 * most number of times (case-insensitive).  If there is no word 
	 * that appears more than the others, return the first word in the 
	 * array.
	 * 
	 * Examples:
	 * {"Hello", "there"} returns  "hello"
	 * {"Hello", "Bob", "says", "hello"} returns "hello"
	 * 
	 * You may assume the array contains no punctuation, only words
	 * 
	 * @param array of String words
	 * @return a String that contains (in lower-case) the word that 
	 * appears the most in the input array
	 */
	public static String wordCountMost(String[] input) {
		int max=0;
		String crukey="";
		HashMap<String,Integer> res=new HashMap<String,Integer>();
		for (int i=0;i<input.length;i++) {
			if (!res.containsKey(input[i].toLowerCase())) {
				res.put(input[i].toLowerCase(),0);
			}
			int cur=res.get(input[i].toLowerCase())+1;
			res.put(input[i].toLowerCase(),cur);
		}
		
		for (String keys:res.keySet()) {
			if (res.get(keys)>max) {
				max=res.get(keys);
				crukey=keys;
			}
		}
		
		if (max==1) {
			return input[0].toLowerCase();
		}
		return crukey;
	}

}
