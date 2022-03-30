package com.simplilearn.sort;

////https://www.geeksforgeeks.org/quick-sort/
// Java program for implementation of QuickSort
public class QuickSort {

	public static void sort(int[] numbers) {
		sort(numbers, 0, numbers.length - 1);
	}

	public static void sort(int[] numbers, int start, int end) {
		if (start < end) {
			// 1st method
			int p = partition(numbers, start, end);

			// 2nd method
			sort(numbers, start, p - 1);
			sort(numbers, p + 1, end);
		}
		// 10, 80, 30, 90, 40, 50, 70
	}

	public static int partition(int[] numbers, int start, int end) {
		int pivot = numbers[end];
		int i = start - 1;
		for (int j = start; j < end; j++) { //if less than swap otherwise leave it
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
		int[] numbers = { 10, 80, 30, 90, 40, 50, 70 };
		sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
