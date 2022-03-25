package introductionToJava11AndOOPsConcepts;

public class StaticInstanceVariable {
	static int staticCounter;
	int instanceCounter;

	void Counter() {
		staticCounter++;
		instanceCounter++;
	}

	void display() {
		System.out.println("Satic Methods " + staticCounter);
		System.out.println("Instance Methods " + instanceCounter);
	}

	public static void main(String[] args) {
		StaticInstanceVariable r1 = new StaticInstanceVariable();
		StaticInstanceVariable r2 = new StaticInstanceVariable();
		StaticInstanceVariable r3 = new StaticInstanceVariable();
		r1.Counter();
		r1.display();
		r2.Counter();
		r2.display();
		r3.Counter();
		r3.display();
	}
}
