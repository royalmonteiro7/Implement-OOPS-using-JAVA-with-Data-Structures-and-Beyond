package junittestreports;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(JunitTest.class);
		for (Failure f : r.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(r.wasSuccessful());
	}
}
