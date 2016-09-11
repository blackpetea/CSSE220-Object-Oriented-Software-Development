import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestThisClassTest {

	@Test
	public void testRetestSample() {
		assertTrue(TestThisClass.retestSample(false, 3000));
		assertFalse(TestThisClass.retestSample(true, 3000));
		assertTrue(TestThisClass.retestSample(true, 5000));
	}

}
