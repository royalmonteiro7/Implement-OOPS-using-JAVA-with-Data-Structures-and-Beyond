package introductionToJava11AndOOPsConcepts;

public class LogicalBitwiseOperator {
	public static void main(String[] args) {
		int m1 = 10;
		int m2 = 5;
		int m3 = 20;
		System.out.println(m1 < m2 && m1++ < m3);
		System.out.println(m1);
		System.out.println(m1 < m2 & m1++ < m3);
		System.out.println(m1);
	}
}
