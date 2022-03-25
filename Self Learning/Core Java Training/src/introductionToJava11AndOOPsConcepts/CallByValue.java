package introductionToJava11AndOOPsConcepts;

public class CallByValue {
	int v = 500;

	void change(int v) {
		v += 100;
	}

	public static void main(String[] args) {
		CallByValue o = new CallByValue();
		System.out.println("Before making changes " + o.v);
		
		System.out.println("After making changes "+o.v);
	}
}
