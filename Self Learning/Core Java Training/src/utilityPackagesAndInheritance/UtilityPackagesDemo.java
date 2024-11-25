package utilityPackagesAndInheritance;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T ctask) {
		System.out.println("Working on the number " + ctask);
		System.out.println("Result after adding 5 to given number is: " + ((int) ctask + 5));
	}

}

public class UtilityPackagesDemo {
	public static void main(String[] args) {
		MyConsumer<Object> mycons = new MyConsumer<Object>();
		ArrayList<Object> myList = new ArrayList<>(5);
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		System.out.println(myList);

		myList.forEach(mycons);
	}
}
