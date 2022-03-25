package junittestreports;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class TestDemo {
	@Test
	public void instanceOfTest() {
		assertThat(new ArrayList(), instanceOf(List.class));
	}

	@Test
	public void assertTest() {
		assertTrue(true);
	}

}
