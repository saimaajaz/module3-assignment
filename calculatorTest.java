package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	public void testadd() {
		assertEquals(30,calculator.add(10, 20));
	}
	@Test
	public void testsub() {
		assertEquals(30, calculator.sub(50, 30));
	}
	@Test
	public void testmul() {
		assertEquals(30, calculator.mul(6,5));
	}
	@Test
	public void testdiv() {
		assertEquals(6,calculator.div(30, 5));
	}
}
