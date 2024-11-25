package junittestreports;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Junitannotationsample {

	int x = 5, y = 10, z;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the classes");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test cases");
	}

	@Test
	public void Addition() {
		z = x + y;
		assertEquals(15, z);
		System.out.println("Addition Value= " + z);
	}

	@Test
	public void Multiplication() {
		z = x * y;
		assertEquals(50, z);
		System.out.println("Multiplication Value= " + z);
	}

	@Ignore
	public void IgnoreMessage() {
		String info = "JUnit Annotations";
		assertEquals(info, "JUnit Annotations");
		System.out.println("This is @Ignore annotations");
	}

	@AfterEach
	static void tearDown() throws Exception {
		System.out.println("After each test cases");
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		System.out.println("After all the classes");
	}
}
