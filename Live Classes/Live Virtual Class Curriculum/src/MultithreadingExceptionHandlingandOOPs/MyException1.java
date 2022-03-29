package MultithreadingExceptionHandlingandOOPs;

public class MyException1 extends Exception {
	String str1;

	MyException1(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("MyException Occurred: " + str1);
	}
}
