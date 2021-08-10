package something;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalc {
	private Calc tester = new Calc();
	@Test
	public void testAdd() {
		assertEquals(tester.add(2, 2), 4);
	}
	@Test
	public void testSubtract() {
		assertEquals(tester.subtract(3, 1), 2);
	}
}