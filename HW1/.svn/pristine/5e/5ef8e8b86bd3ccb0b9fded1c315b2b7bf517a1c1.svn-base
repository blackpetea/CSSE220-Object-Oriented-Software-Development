
public class HW1 {

	/*
	 * TODO: Write a function from scratch down below here. The function should
	 * take 3 whole numbers (e.g. no fractions) and return true if exactly 2 of
	 * the three are even. For example:
	 * 
	 * twoEven(3,2,6) returns true because 2 and 6 are even twoEven(2,4,6)
	 * returns false because all three are even, not just 2 twoEven(3,99,100)
	 * returns false because only 100 is even
	 * 
	 * Hint: take a look at section 5.7 in your textbook for some more examples
	 * of boolean functions like AND and NOT. The rest of chapter 5 might be
	 * good too if you're a bit confused.
	 * 
	 * Be sure to add appropriate Javadoc comments for your function
	 */

	/*
	 * TODO: Either before or after your write your function, write a main that
	 * tests your function and shows it working.
	 * 
	 */
	public static void main(String[] args) {
		boolean actual1 = twoEven(5, 12, 4);
		System.out.println("Expected is true, Actual is " + actual1);
		boolean actual2 = twoEven(3, 3, 3);
		System.out.println("Expected is false, Actual is " + actual2);
		boolean actual3 = twoEven(4, 3, 3);
		System.out.println("Expected is false, Actual is " + actual3);
		boolean actual4 = twoEven(4, 4, 4);
		System.out.println("Expected is false, Actual is " + actual4);
	}

	public static boolean twoEven(int one, int two, int three) {
		boolean vone = one%2==0;
		boolean vtwo = two%2==0;
		boolean vthree = three%2==0;
		if(((!vone)&&(vtwo)&&(vthree))||((vone)&&(!vtwo)&&(vthree))||(vone)&&(vtwo)&&(!vthree)) {
			return true;
		}
		return false;
	}

}
