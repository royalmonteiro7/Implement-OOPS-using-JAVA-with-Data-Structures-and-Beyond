package multithreadingConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		// adding elements to linked list
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("three");
		ll.add("four");
		ll.add("four");

		System.out.println("\nElements in linked list: " + ll);

		Iterator<String> it = ll.iterator();
		// printing elements from linked list
		System.out.println("\nPrinting each element from linked list");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// printing element in reverse order
		it = ll.descendingIterator();
		System.out.println("\nPrinting each element in reverse order from linked list");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// remove first element from linked list
		System.out.println("\nElements in linked list: " + ll);
		ll.removeFirst();
		System.out.println("After removing first element: " + ll);

		// remove last element from linked list
		System.out.println("\nElements in linked list: " + ll);
		ll.removeLast();
		System.out.println("After removing last element: " + ll);

		// remove first occurence of element from linked list
		System.out.println("\nElements in linked list: " + ll);
		ll.removeFirstOccurrence("four");
		System.out.println("Remove first occurence of element in linked list: " + ll);

		// remove last occurence of element from linked list
		System.out.println("\nElements in linked list: " + ll);
		ll.removeLastOccurrence("three");
		System.out.println("Remove last occurence of element in linked list: " + ll);
		
		//clearing the linked list
		ll.clear();
		System.out.println("\nElements in linked list: " + ll);
	}
}
