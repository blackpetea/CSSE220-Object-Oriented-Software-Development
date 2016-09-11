import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMethodsPracticeTest {

	@Test
	public void testShout() {
		StringMethodsPractice testMe=new StringMethodsPractice();
		assertEquals("HELLO",testMe.shout("hello"));
	}

	@Test
	public void testWhisper() {
		StringMethodsPractice testMe=new StringMethodsPractice();
		assertEquals("hello",testMe.whisper("HELLO"));
	}

	@Test
	public void testHolleWerld() {
		StringMethodsPractice testMe=new StringMethodsPractice();
		assertEquals("hollewerld",testMe.holleWerld("helloworld"));
	}

}
