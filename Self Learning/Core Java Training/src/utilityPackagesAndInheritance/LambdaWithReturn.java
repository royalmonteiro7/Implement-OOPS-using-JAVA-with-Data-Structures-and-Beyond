package utilityPackagesAndInheritance;

interface aa {
	public int show(int a);
}

public class LambdaWithReturn {
	public static void main(String[] args) {
		// method //return
		aa statements = (int a) -> {
			return a;
		};
		System.out.println("Returns value from lambda expression " + statements.show(100));
	}
}
