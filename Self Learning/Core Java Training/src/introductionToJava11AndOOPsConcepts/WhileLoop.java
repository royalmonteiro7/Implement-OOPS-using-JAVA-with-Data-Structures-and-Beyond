package introductionToJava11AndOOPsConcepts;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of values");
		i = sc.nextInt();
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}