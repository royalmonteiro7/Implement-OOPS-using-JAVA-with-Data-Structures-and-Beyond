package SortingAlgorithmsandFundamentalDataStructures;
//https://www.geeksforgeeks.org/quick-sort/
public class QuickSort {

	public static void sort(int[] numbers) {
		sort(numbers, 0, numbers.length - 1);
	}

	public static void sort(int[] numbers, int start, int end) {
		if (start < end) {
			// 1st method
			int p = partition(numbers, start, end);

			// 2nd method
			sort(numbers,start,p-1);
			sort(numbers,p+1,end);
		}
		// 1, 4, 6, 2, 9, 7, 4, 3
	}

	public static int partition(int[] numbers, int start, int end) {
		int pivot = numbers[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (numbers[j] < pivot) {
				i++;
				swap(numbers, i, j);
			}
		}
		swap(numbers, i + 1, end);
		return i + 1;
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 2, 9, 7, 4, 3 };
		sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
