package introductionToJava11AndOOPsConcepts;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		if (no % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		s.close();
	}
}