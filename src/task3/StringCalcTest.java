package task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalcTest {
	
	StringCalc calc;
	
	@BeforeEach
	public void createFizzBuzz() {
		calc = new StringCalc();
	}

	@Test
	public void addUpToTwoNumbersTest() {
		assertEquals(calc.Add("1,2"), 3);
	}
	
	@Test
	public void useNewLineAsDelimiterTest() {
		assertEquals(calc.Add("1\n2,3"), 6);
	}
	
	@Test
	public void useDifferentDelimter() {
		assertEquals(calc.Add("//;\n1;2"), 3);
	}
	
	@Test
	public void numbersGreaterThan1000AreIgnored() {
		assertEquals(calc.Add("1001,2"), 2);
	}
	
	@Test
	public void usingMultiCharacterDelimter() {
		assertEquals(calc.Add("//[***]\n1***2***3"), 6);
	}

}
