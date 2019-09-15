import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NTWTest {

	@Test
	public void testNumToWordsPositive() {
		assertEquals("Fifty Six Million Nine Hundred and Fourty Five Thousand Seven Hundred and Eighty One", NTW.NumToWords(56945781));
	}
	@Test
	public void testNumToWordsZero() {
		assertEquals("Zero", NTW.NumToWords(0));
	}
	@Test
	public void testNumToWordsNegative() {
		assertEquals("(minus) One", NTW.NumToWords(-1));
	}
	@Test
	public void testNumToWordsOutOfBounds() {
		assertEquals("Out of Range.. Please Enter a number in the range [ -999999999 to 999999999 ]. Thank You.", NTW.NumToWords(1999999999));
	}

}
