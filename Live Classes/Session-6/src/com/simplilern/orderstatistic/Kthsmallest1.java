package com.simplilern.orderstatistic;

public class Kthsmallest1 {

	public int sort(int[] numbers, int start, int end, int k) {
		if(k<=0 && k>numbers.length) {
		return 0;
		}
		
		int p = partition(numbers, start, end);
		if (p == k - 1) {
			return numbers[p];
		} else if (p < k - 1) {
			return sort(numbers, p + 1, end, k);
		}
		return sort(numbers, start, p - 1, k);
	}

	public int partition(int[] numbers, int start, int end) {
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

	public void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) throws Exception {
		Kthsmallest1 kthsmallest1 = new Kthsmallest1();
		int k = 6;
		int[] numbers = { 3, 4, 2, 5, 1 };

		System.out.println("Kth smallest element: " + kthsmallest1.sort(numbers, 0, numbers.length - 1, k));
	}

}
