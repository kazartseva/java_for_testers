package test;

import org.junit.Test;

import org.junit.Assert;
import main.java.Point;

public class PointTests {
	
	@Test
	public void testDistance () {
		Point p1 = new Point (2, 3);
		Point p2 = new Point (5, 7);
		Double d = 5.0;
		Assert.assertEquals(p1.distance(p2.x, p2.y), d, 0);
	}

}
