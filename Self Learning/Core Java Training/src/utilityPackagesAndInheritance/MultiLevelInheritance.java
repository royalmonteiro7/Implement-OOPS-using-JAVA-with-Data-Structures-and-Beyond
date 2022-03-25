package utilityPackagesAndInheritance;

class Parentclass {
	public void methodX() {
		System.out.println("Parent class method is called");
	}
}

class childone extends Parentclass {
	public void methodY() {
		System.out.println("Child Y method");
	}
}

class childtwo extends childone {
	public void methodZ() {
		System.out.println("Child Z method");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		childtwo z = new childtwo();
		z.methodX();
		z.methodY();
		z.methodZ();
	}

}
