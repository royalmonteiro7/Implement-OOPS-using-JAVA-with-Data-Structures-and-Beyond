package utilityPackagesAndInheritance;

class Animal {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog Eating");
	}

	void bark() {
		System.out.println("dog barking");
	}
}

public class UpAndDowncasting {
	public static void main(String[] args) {
		Animal a1 = new Dog(); //upcasting
		a1.eat();
//		a1.bark(); //not possible


		Dog a2=(Dog) a1; //downcasting
		a2.eat();
		a2.bark();
		
	}
}
