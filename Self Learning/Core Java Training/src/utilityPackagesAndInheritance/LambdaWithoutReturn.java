package utilityPackagesAndInheritance;

interface Display {
	public int show(int a);
}

public class LambdaWithoutReturn {
	public static void main(String[] args) {
		// method //return
		Display display = (int a) -> a;
		System.out.println("Returns value from lambda expression " + display.show(100));
	}
}
