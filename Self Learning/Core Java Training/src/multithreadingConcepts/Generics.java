package multithreadingConcepts;

class Test<T> {// datatype==>any type
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}

public class Generics {
	public static void main(String[] args) {
		Test<Integer> obj = new Test<Integer>(15);
		System.out.println(obj.getObject());
		Test<String> obj1 = new Test<String>("This is a example for generics example");
		System.out.println(obj1.getObject());
	}

}
