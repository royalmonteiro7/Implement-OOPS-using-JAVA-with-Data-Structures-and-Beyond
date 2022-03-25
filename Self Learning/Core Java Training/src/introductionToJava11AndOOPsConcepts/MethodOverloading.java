package introductionToJava11AndOOPsConcepts;

public class MethodOverloading {
	// changing the arguments
//	static int add(int x, int y) {
//		return x + y;
//	}
//
//	static int add(int x, int y, int z) {
//		return x + y + z;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(add(1, 2));
//		System.out.println(add(1, 2, 3));
//	}

	// changing the data type
	static int add(int x, int y) {
		return x + y;
	}

	static double add(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(add(21, 11));
		System.out.println(add(12.3, 22.6));
	}

}
