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

	@Test
	public void testMultipleNumbersA(){
		assertEquals(6,Calculator.add("1,2,3"));
	}

	@Test
	public void testMultipleNumbersB(){
		assertEquals(150,Calculator.add("10,20,30,40,50"));
	}

	@Test
	public void testNewlineBetweenNumbersA(){
		assertEquals(3,Calculator.add("1\n2"));
	}

	@Test
	public void testNewlineBetweenNumbersB(){
		assertEquals(150,Calculator.add("10\n20,30\n40,50"));
	}
}
