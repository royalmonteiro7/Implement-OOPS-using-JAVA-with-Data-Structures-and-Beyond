package utilityPackagesAndInheritance;

public class ExceptionHandling {
	public static void first() throws Exception {
		System.out.println("The exception in first() method");
		throw new Exception("thrown from first() method");
	}

	public static void second() throws Throwable {
		try {
			first();
		} catch (Exception e) {
			System.out.println("Inside second method");
			throw e;
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			second();
		} catch (Exception e) {
			System.out.println("This caught in main");
		}
	}
}
