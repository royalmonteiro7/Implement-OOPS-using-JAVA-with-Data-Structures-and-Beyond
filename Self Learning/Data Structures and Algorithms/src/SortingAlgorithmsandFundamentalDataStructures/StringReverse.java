package SortingAlgorithmsandFundamentalDataStructures;

import java.util.Stack;

public class StringReverse {
	// Method to reverse a string in Java using a stack and StringBuilder
	public static String reverse(String str) {
		// base case: if the string is null or empty
		if (str == null || str.equals("")) {
			return str;
		}

		// create an empty stack of characters
		Stack<Character> stack = new Stack<Character>();

		// push every character of the given string into the stack
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
			//System.out.println(stack);
		}

		// pop characters from the stack and append them into StringBuilder
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
			//System.out.println(stack);
			//System.out.println(sb);
		}

		// convert `StringBuilder` to string and return
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Reverse me!";

		str = reverse(str); // string is immutable

		System.out.println("The reversed string is " + str);
	}
}


//