package SortingAlgorithmsandFundamentalDataStructures;

public class BubbleSorting {
	public void sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

	public void sortImp1(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					swap(numbers, j, j + 1);
				}
			}
		}
	}

	public void sortImp2(int[] numbers) {
		int i = 0;
		boolean swapOcurred = true;
		while (swapOcurred) {
			swapOcurred = false;
			i++;
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					swap(numbers, j, j + 1);
					swapOcurred = true;
				}
			}
		}

	}

	private void swap(int[] numbers, int j, int k) {
		int temp = numbers[j];
		numbers[j] = numbers[k];
		numbers[k] = temp;
	}

	public static void main(String[] args) {
		BubbleSorting bubbleSorting = new BubbleSorting();
		int[] numbers = { 7, 6, 5, 4, 3, 2, 1 };
		// bubbleSorting.sort(numbers);
		bubbleSorting.sortImp1(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
