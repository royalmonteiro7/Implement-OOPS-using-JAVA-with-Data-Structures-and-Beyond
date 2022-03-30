package com.simplilearn.sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		insertionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
		sc.close();
	}

	public static void insertionSort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}

	}
}
