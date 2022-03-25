package introductionToJava11AndOOPsConcepts;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		int weight;
		System.out.println("Enter the Age: ");
		age = sc.nextInt();
		System.out.println("Enter the Weight: ");
		weight = sc.nextInt();
		if (age > 18) {
			if (weight > 50) {
				System.out.println("You have passed the eligibility test and you are eligible to donate blood");
			}
		}
		sc.close();
	}

}
