package SortingAlgorithmsandFundamentalDataStructures;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String str = null;

		Optional<String> optional = Optional.ofNullable(str);

		System.out.println(optional.isPresent());

		//System.out.println(optional.get());

		System.out.println(optional.orElse("No value in the object"));
	}
}
