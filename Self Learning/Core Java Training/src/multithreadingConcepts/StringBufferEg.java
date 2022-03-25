package multithreadingConcepts;

public class StringBufferEg {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Welcome");
		sb2.reverse();
		System.out.println(sb1.capacity());
		sb1.append("Hello");
		System.out.println(sb1.capacity());
		sb1.append("Java is my favourite language");
		System.out.println(sb1.capacity());
		System.out.println(sb2);
	}
}
