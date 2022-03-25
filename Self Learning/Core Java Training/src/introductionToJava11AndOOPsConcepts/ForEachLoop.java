package introductionToJava11AndOOPsConcepts;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] a = { 13, 14, 15, 46 };
		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		System.out.println("Total: " + sum);
	}
}
