package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * Use the tests functions in this file to test the methods of the Recursion class.
 * You should not modify the tests in this file. This means that only one
 * test function is expected to fail, i.e., the test for the method you did not implement.
 * 
 * @author Delvin Defoe, created on Oct. 19, 2015.
 * 
 *
 */
public class RecursionTest {
	private int[] numbers;

	@Before
	public void setUp() throws Exception {
		int size = 10;
		numbers = new int[size];
		numbers[0] = -5;
		for(int i = 1; i < size; i++ ){
			numbers[i] = i * i - numbers[i - 1];
		}
	}

	@After
	public void tearDown() throws Exception {
		numbers = null;
	}
	
	@Test
	/**
	 * Unit tests for {@link Recursion.largestInRange}
	 */
	public void testLargestInRange(){
		assertEquals(-5, Recursion.largestInRange(numbers, 0, 0));
		assertEquals(20, Recursion.largestInRange(numbers, 5, 6));
		assertEquals(50, Recursion.largestInRange(numbers, 0, 9));
	}
	
	@Test
	/**
	 * Unit tests for {@link Recursion.isInAlphabeticOrder}
	 */
	public void testIsInAlphabeticOrder(){
		assertTrue(Recursion.isInAlphabeticOrder(""));
		assertTrue(Recursion.isInAlphabeticOrder("a"));
		assertTrue(Recursion.isInAlphabeticOrder("ab"));
		assertFalse(Recursion.isInAlphabeticOrder("ba"));
		assertTrue(Recursion.isInAlphabeticOrder("abz"));
		assertFalse(Recursion.isInAlphabeticOrder("babcdefg"));
		assertTrue(Recursion.isInAlphabeticOrder("ABCDEFGab"));
		assertFalse(Recursion.isInAlphabeticOrder("aBCDEFG"));
	}
	
	@Test
	/**
	 * Unit tests for {@link Recursion.countOfDoubles}
	 */
	public void testCountOfDoubles(){
		assertEquals(1, Recursion.countOfDoubles("dee", 'e', 0));
		assertEquals(0, Recursion.countOfDoubles("ede", 'e', 0));
		assertEquals(2, Recursion.countOfDoubles("booboo", 'o', 1));
		assertEquals(1, Recursion.countOfDoubles("booboo", 'o', 3));
		assertEquals(0, Recursion.countOfDoubles("boo", 'o', 3));
		assertEquals(3, Recursion.countOfDoubles("boooo", 'o', 1));
	}

	@Test
	/**
	 * Unit tests for {@link Recursion.occursExactlyTwiceIn}
	 */
	public void testOccursExactlyTwiceIn() {
		assertFalse(Recursion.occursExactlyTwiceIn(4, new int[] {4}));
		assertTrue(Recursion.occursExactlyTwiceIn(2, new int[] {2, 2}));
		assertTrue(Recursion.occursExactlyTwiceIn(1, new int[] {1, 4, 1}));
		assertFalse(Recursion.occursExactlyTwiceIn(5, new int[] {55, 2}));
		assertTrue(Recursion.occursExactlyTwiceIn(4, new int[] {4, 2, 3, 1, 4, 5, 6, 7}));
		assertFalse(Recursion.occursExactlyTwiceIn(7, new int[] {7, 7, 4, 7}));
	}

}
