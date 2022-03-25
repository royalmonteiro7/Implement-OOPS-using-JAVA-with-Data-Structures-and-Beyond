package multithreadingConcepts;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("Java is a programming language", " ");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}
}
