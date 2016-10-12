package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

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

	@Rule
  	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testOneNegativeNumber(){
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negatives not allowed: -1");
		Calculator.add("-1");
	}

	@Test
	public void testMultipleNegativeNumber(){
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negatives not allowed: -1,-5,-7");
		Calculator.add("-1,2,-5,4,-7");
	}

	@Test
	public void testNumbersOver1000(){
		assertEquals(5,Calculator.add("5,5000"));
	}

	@Test
	public void testNewDelimeterOneCharacter(){
		assertEquals(3,Calculator.add("//;\n1;2"));
	}

	@Test
	public void testNewDelimeterMultipleCharacters(){
		assertEquals(3,Calculator.add("//qwerty\n1qwerty2"));
	}

	@Test
	public void testNewDelimeterAndDefaultDelimeters(){
		assertEquals(20,Calculator.add("//:\n5,2,4:4\n5"));
	}
}
