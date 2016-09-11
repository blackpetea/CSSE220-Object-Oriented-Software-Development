import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

public class TestThisClassTest {

	@Test
	public void testGetSlope() {
		assertEquals("1.000",TestThisClass.getSlope(new Point(2,2), new Point(1,1)));
		assertEquals("0.000",TestThisClass.getSlope(new Point(10,1), new Point(1,1)));
		assertEquals("Undefined",TestThisClass.getSlope(new Point(), new Point()));
		
	}

}
