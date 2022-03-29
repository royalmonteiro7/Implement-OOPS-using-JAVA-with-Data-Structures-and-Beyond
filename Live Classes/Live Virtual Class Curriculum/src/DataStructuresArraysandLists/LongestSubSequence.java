package DataStructuresArraysandLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LongestSubSequence {

	public static void main(String[] args) {
		System.out.println("Enter the required size of the array :: ");
		Scanner s = new Scanner(System.in);

		try {
			int n = s.nextInt();
			try {
				if (n < 100) {
					int a[] = new int[n];
					System.out.println("Enter the elements of the array one by one ");
					for (int i = 0; i < n; i++) {
						a[i] = s.nextInt();
					}
					System.out.println("Contents of the array are: " + Arrays.toString(a));
					LongestSubSequence ob = new LongestSubSequence();
					ob.longestSubseq(a, n);
				} else {
					throw new Exception();
				}
			} catch (Exception ex) {
				System.out.println("Input must be greater than 0 and less than 100");
				main(new String[] { "" });
			}
		} catch (Exception ex) {
			System.out.println("Please give input as integer");
			main(new String[] { "" });
		}
	}

	public void longestSubseq(int[] array, int n) {
		ArrayList list = new ArrayList();
		ArrayList longestList = new ArrayList();
		int currentMax;
		int highestCount = 0;
		for (int i = 0; i < array.length; i++) {
			currentMax = Integer.MIN_VALUE;
			for (int j = i; j < array.length; j++) {
				if (array[j] > currentMax) {
					list.add(array[j]);
					currentMax = array[j];
				}
			}
			if (highestCount < list.size()) {
				highestCount = list.size();
				longestList = new ArrayList(list);
			}
			list.clear();
		}
		System.out.println();
		Iterator itr = longestList.iterator();
		System.out.println("The Longest subsequence");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Length of LIS: " + highestCount);
	}
}
