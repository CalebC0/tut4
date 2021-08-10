package something;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test
	public void testAdd() {
		Calc tester = new Calc();
		assertEquals(tester.add(2, 2), 4);
	}
}