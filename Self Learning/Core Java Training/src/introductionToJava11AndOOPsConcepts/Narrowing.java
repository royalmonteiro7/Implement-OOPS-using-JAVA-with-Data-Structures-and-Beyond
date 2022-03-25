package introductionToJava11AndOOPsConcepts;

import java.util.Scanner;

public class Narrowing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int v = s.nextInt();
		char c = (char) v;
		System.out.println("Charater value of the given integer: " + c);
		s.close();
	}
}