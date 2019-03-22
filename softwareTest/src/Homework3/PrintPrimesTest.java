package Homework3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintPrimesTest {
	public PrintPrimes prime = new PrintPrimes();

	@Test
	public void testPrintPrimes() {
		assertEquals("2 3 5 ", PrintPrimes.printPrimes(3));
	}

}
