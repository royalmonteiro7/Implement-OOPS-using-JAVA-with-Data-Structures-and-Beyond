package AlgorithmsandComplexities;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j && numbers[i] == numbers[j])
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		System.out.println(containsDuplicate.containsDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
		System.out.println(containsDuplicate.containsDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 5, 6 }));
	}
}
