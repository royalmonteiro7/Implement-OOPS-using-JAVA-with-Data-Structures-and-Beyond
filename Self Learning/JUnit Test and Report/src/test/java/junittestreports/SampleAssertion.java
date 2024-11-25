package junittestreports;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SampleAssertion {
	@Test
	public void sampleAssertions() {
		int val1 = 5;
		int val2 = 6;
		String str1 = new String("welcome");
		String str2 = new String("welcome");
		String str3 = null;
		String str4 = "welcome";
		String str5 = "welcome";
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		assertEquals(str1, str2);
		assertTrue(val1 < val2);
		assertFalse(val1 > val2);
		assertNull(str3);
		assertNotNull(str1);
		assertSame(str4, str5);
		assertNotSame(str1, str3);
		assertArrayEquals(expectedArray, resultArray);
	}
}
