package utilityPackagesAndInheritance;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityPackagesDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any sentence?");
		String userString = sc.nextLine();

		StringTokenizer st = new StringTokenizer(userString, " ");

		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processing Word: " + word);
			int vowelCount = 0;
			for (char c : word.toCharArray()) {
				c = Character.toLowerCase(c);
				// System.out.println(c);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				}
			}
			System.out.println("The word " + word + " has " + vowelCount + " vowels");
		}
		sc.close();
	}
}
