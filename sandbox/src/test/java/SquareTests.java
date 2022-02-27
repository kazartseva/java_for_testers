package test.java;

//import org.junit.jupiter.api.Test;

//import junit.framework.Assert;
import org.junit.Assert;
import org. junit. Test;
import main.java.Square;

public class SquareTests {
	@Test
	public void testArea() {
		Square s = new Square(5);
		Assert.assertEquals(s.area(), 25.0, 0);
	}

}
