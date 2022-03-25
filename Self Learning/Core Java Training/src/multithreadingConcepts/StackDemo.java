package multithreadingConcepts;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();

		// adding elements to the stack
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");

		System.out.println("Initial Stack");
		System.out.println(stack);

		System.out.println("Enter a string to Check");
		String usr_string = sc.next();

		// check if element exists in stack
		if (stack.search(usr_string) != -1) {
			System.out.println("Given string " + usr_string + " exists in the stack");
		} else {
			System.out.println("Given string " + usr_string + " does not exists in the stack");
		}
		System.out.println("Getting top element from thr stack: " + stack.peek());

		// removing elements fromstack
		stack.pop();
		stack.pop();
		System.out.println("Stack after popping two elements");
		System.out.println(stack);

		// popping out elements from stack until there is no elements
		while (!stack.empty()) {
			stack.pop();
			System.out.println("Stack after popping one element: " + stack);
		}
		sc.close();
	}
}
