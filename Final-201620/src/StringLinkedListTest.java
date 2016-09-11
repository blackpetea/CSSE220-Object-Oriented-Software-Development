import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringLinkedListTest {

	StringLinkedList list, list2, list3, empty, onlyOne, aToF;

	@Before
	public void setUp() throws Exception {

		list = new StringLinkedList();
		list.addFirst("d");
		list.addFirst("c");
		list.addFirst("b");
		list.addFirst("a");

		list2 = new StringLinkedList();
		list2.addFirst("b");
		list2.addFirst("c");
		list2.addFirst("b");
		list2.addFirst("a");

		list3 = new StringLinkedList();
		list3.addFirst("q");
		list3.addFirst("z");
		list3.addFirst("y");
		list3.addFirst("x");

		aToF = new StringLinkedList();
		aToF.addFirst("f");
		aToF.addFirst("e");
		aToF.addFirst("a");
		aToF.addFirst("c");
		aToF.addFirst("b");
		aToF.addFirst("a");

		empty = new StringLinkedList();

		onlyOne = new StringLinkedList();
		onlyOne.addFirst("y");
	}

	@Test
	public void testHasDuplicates() {
		assertEquals(false, list.hasDuplicates());
		assertEquals(true, list2.hasDuplicates());
		assertEquals(false, list3.hasDuplicates());
		assertEquals(false, empty.hasDuplicates());
		assertEquals(false, onlyOne.hasDuplicates());
	}

	@Test
	public void testjoinWithNextIfMatch() {
		list.joinWithNextIfMatch("b");
		assertEquals("d", list.removeLast());
		assertEquals("bc", list.removeLast());
		assertEquals("a", list.removeLast());
		assertEquals(null, list.removeLast());

		list2.joinWithNextIfMatch("b");
		assertEquals("b", list2.removeLast());
		assertEquals("bc", list2.removeLast());
		assertEquals("a", list2.removeLast());
		assertEquals(null, list2.removeLast());

		list3.joinWithNextIfMatch("x");
		assertEquals("q", list3.removeLast());
		assertEquals("z", list3.removeLast());
		assertEquals("xy", list3.removeLast());
		assertEquals(null, list3.removeLast());

		empty.joinWithNextIfMatch("b");
		assertEquals(null, empty.removeLast());

		onlyOne.joinWithNextIfMatch("y");
		assertEquals("y", onlyOne.removeLast());
		assertEquals(null, onlyOne.removeLast());

		aToF.joinWithNextIfMatch("a");
		assertEquals("f", aToF.removeLast());
		assertEquals("ae", aToF.removeLast());
		assertEquals("c", aToF.removeLast());
		assertEquals("ab", aToF.removeLast());
		assertEquals(null, aToF.removeLast());

	}

	@Test
	public void testTruncateList() {
		list.truncateList("b");
		assertEquals("b", list.removeLast());
		assertEquals("a", list.removeLast());
		assertEquals(null, list.removeLast());

		list2.truncateList("b");
		assertEquals("b", list2.removeLast());
		assertEquals("a", list2.removeLast());
		assertEquals(null, list2.removeLast());

		list3.truncateList("x");
		assertEquals("x", list3.removeLast());
		assertEquals(null, list3.removeLast());

		empty.truncateList("b");
		assertEquals(null, empty.removeLast());

		onlyOne.truncateList("y");
		assertEquals("y", onlyOne.removeLast());
		assertEquals(null, onlyOne.removeLast());

		aToF.truncateList("a");
		assertEquals("a", aToF.removeLast());
		assertEquals(null, aToF.removeLast());

	}

}
