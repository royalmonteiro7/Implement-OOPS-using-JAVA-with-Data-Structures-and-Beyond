package JavaDeepDiveBuildingBlocks;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		System.out.println("enter the operator:");
		char op = s.next().charAt(0);
		s.close();
		double output;
		switch (op) {
		case '+':
			output = num1 + num2;
			break;
		case '-':
			output = num1 - num2;
			break;
		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1 / num2;
			break;
		default:
			System.out.println("invalid operator");
			return;
		}
		System.out.println(num1 + "" + op + "" + num2 + "=" + output);
	}
}
