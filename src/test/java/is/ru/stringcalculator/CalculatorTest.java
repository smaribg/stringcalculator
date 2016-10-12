package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0,Calculator.add(" "));
	}

	@Test
	public void testOneNumber(){
		assertEquals(4,Calculator.add("4"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3,Calculator.add("1,2"));
	}
}
