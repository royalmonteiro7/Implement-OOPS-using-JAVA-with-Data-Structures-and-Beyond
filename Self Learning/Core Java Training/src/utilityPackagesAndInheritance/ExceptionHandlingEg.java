package utilityPackagesAndInheritance;

public class ExceptionHandlingEg {
	public static void main(String[] args) {
		System.out.println("Exception handling Program starts here.....");
		try {
			// uncommenting below will throw Arithmetic Exception
			// int num = 28;
			int[] arr = { 10, 20, 40, 50, 302, 34 };
			// uncommenting below will throw ArrayIndexOutOfBounds Exception
			// System.out.println(arr[10]);
			// String str = null;
			// uncommenting below will throw NullPointer Exception
			// System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero while diving the number...");
			System.out.println("Error: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("User is trying to access index location outside the array boundry");
			System.out.println("Error: " + e);
		} catch (NullPointerException e) {
			System.out.println("User is trying to perform operations on null value");
			System.out.println("Error: " + e);
		} finally {
			System.out.println("This block always excutes...");
		}
		System.out.println("Exception handling Program ends here.....");
	}
}
