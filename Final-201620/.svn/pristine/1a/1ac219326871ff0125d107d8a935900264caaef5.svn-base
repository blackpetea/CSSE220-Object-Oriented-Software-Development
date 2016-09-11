import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDArrayProblemTest {

	private void assertEqualsUtility(int[][] actual, int[][] expected){
		for(int r = 0; r < expected.length; r++){
			for(int c = 0; c < expected[r].length; c++){
				assertEquals(expected[r][c], actual[r][c]);
			}
		}
	}
	
	@Test
	public void testAddMatrices() {
		int[][] first = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}};
		int[][] second = first.clone();
		int[][] actual = TwoDArrayProblem.addMatrices(first, second);
		int[][] expected = {
				{2, 4, 6},
				{8,10, 12},
				{14,16,18}};
		assertEqualsUtility(actual, expected);
	}
	
	@Test
	public void testAddMatricesEmpty() {
		int[][] first = new int[0][0];
		int[][] second = new int[0][0];
		int[][] actual = TwoDArrayProblem.addMatrices(first, second);
		int[][] expected = new int[0][0];
		assertEqualsUtility(actual, expected);
	}
}
