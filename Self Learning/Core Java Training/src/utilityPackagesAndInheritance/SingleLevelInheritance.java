package utilityPackagesAndInheritance;

class parentclass {
	// declare an instance method
	public void methodA() {
		System.out.println("Parent class method is called");
	}
}

class childclass extends parentclass {
	public void methodB() {
		System.out.println("Child class method is called");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		childclass obj = new childclass();
		obj.methodA();
		obj.methodB();
	}

}
