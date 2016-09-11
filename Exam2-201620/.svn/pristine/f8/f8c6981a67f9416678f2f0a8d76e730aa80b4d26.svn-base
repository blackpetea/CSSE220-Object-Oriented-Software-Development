package recursion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * Use the tests functions in this file to test the methods of the Recursion class.
 * You should not modify the tests in this file. This means that only one
 * test function is expected to fail, i.e., the test for the method you did not implement.
 * 
 * @author Amanda Stouder, Created on 12/22/2015
 * 
 *
 */
public class RecursionTest {
	
	@Test
	/**
	 * Unit tests for {@link Recursion.removeLowerCase}
	 */
	public void testRemoveLowerCase(){		
		assertEquals("BCDFGH", Recursion.removeLowerCase("aBCDeFGHi"));
		assertEquals("", Recursion.removeLowerCase(""));
		assertEquals("ABCDEFGHI", Recursion.removeLowerCase("ABCDEFGHI"));
		assertEquals("", Recursion.removeLowerCase("abcdefg"));
	}
	
	@Test
	/**
	 * Unit tests for {@link Recursion.allOdds}
	 */
	public void testAllOdds(){
		int[] testArray1 = {1, 9, 5, 7};
		int[] testArray2 = {1, 2, 5};
		assertTrue(Recursion.allOdds(testArray1));
		assertFalse(Recursion.allOdds(testArray2));
		assertTrue(Recursion.allOdds(new int[0]));
		
	}
	

	@Test
	/**
	 * Unit tests for {@link Recursion.convertToInteger}
	 */
	public void testConvertToNumber() {

		assertEquals(123, Recursion.convertToInteger("123"));//, 1));
		assertEquals(7518, Recursion.convertToInteger("7518"));//, 1));
		assertEquals(0, Recursion.convertToInteger(""));//, 1));
		
	}
	
	@Test
	/**
	 * Unit tests for {@link Recursion.calculateAverage}
	 */
	public void testCalculateAverage(){
		assertEquals(1.0, Recursion.calculateAverage(new double[] {1.0, 1.0, 1.0}), 0.0001);
		assertEquals(2.0, Recursion.calculateAverage(new double[] {1.0, 2.0, 3.0}), 0.0001);
		assertEquals(3.0, Recursion.calculateAverage(new double[] {2.0, 4.0}), 0.0001);
		assertEquals(3.5, Recursion.calculateAverage(new double[] {7.0, 0.0}), 0.0001);
		assertEquals(7.0, Recursion.calculateAverage(new double[] {7.0}), 0.0001);
		
	}
	private static ArrayList<Character> makeArrayList(char[] characters) {
		ArrayList<Character> toReturn = new ArrayList<Character>();
		for (char c : characters) {
			toReturn.add(c);
		}
		return toReturn;
	}

}

