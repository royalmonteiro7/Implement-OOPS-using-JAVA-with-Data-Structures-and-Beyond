package utilityPackagesAndInheritance;

abstract class subjects {
	abstract void hello();
}

public class AbstractClasses extends subjects {
	@Override
	void hello() {
		System.out.println("This is java programming");

	}

	public static void main(String[] args) {
		AbstractClasses obj = new AbstractClasses();
		obj.hello();

	}

}
