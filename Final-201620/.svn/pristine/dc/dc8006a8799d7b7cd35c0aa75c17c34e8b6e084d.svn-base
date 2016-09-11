import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecursionProblemsTest {

	@Test
	public void testAddStarsBetweenDuplicates(){
		assertEquals("", RecursionProblems.addStarsBetweenDuplicates(""));
		assertEquals("abc", RecursionProblems.addStarsBetweenDuplicates("abc"));
		assertEquals("hel*lo", RecursionProblems.addStarsBetweenDuplicates("hello"));
		assertEquals("a*ab*bc*cd*d", RecursionProblems.addStarsBetweenDuplicates("aabbccdd"));
        assertEquals("ab*bcd", RecursionProblems.addStarsBetweenDuplicates("abbcd"));
	}
	
	@Test
	public void testHasCharXTimes(){
		assertTrue(RecursionProblems.hasCharXTimes("abc", 'a', 1));
		assertFalse(RecursionProblems.hasCharXTimes("abca", 'a', 1));
		assertTrue(RecursionProblems.hasCharXTimes("abca", 'a', 2));
		assertFalse(RecursionProblems.hasCharXTimes("", 'a', 1));
		assertFalse(RecursionProblems.hasCharXTimes("abc", 'z', 1));
		assertTrue(RecursionProblems.hasCharXTimes("bbb", 'b', 3));
		assertTrue(RecursionProblems.hasCharXTimes("bb", 'b', 2));
		assertFalse(RecursionProblems.hasCharXTimes("bbb", 'b', 2));
	}

}