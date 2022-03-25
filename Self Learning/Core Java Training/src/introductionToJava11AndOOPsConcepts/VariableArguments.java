package introductionToJava11AndOOPsConcepts;

public class VariableArguments {
	static void display(String... values) {
		System.out.println("Display method has been invoked");
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		display("my", "name", "is", "java");
	}
}
