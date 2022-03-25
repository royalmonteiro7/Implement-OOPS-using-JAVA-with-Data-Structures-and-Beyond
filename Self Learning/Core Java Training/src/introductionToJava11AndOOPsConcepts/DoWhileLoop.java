package introductionToJava11AndOOPsConcepts;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First no");
		s = sc.nextInt();
		do {
			System.out.println(s);
			s++;
		} while (s <= 5);
		sc.close();
	}

}
