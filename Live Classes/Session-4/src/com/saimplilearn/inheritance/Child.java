package com.saimplilearn.inheritance;

public class Child extends Parent {

	public Child() {
		 super();
		System.out.println("Child class Constructor");
	}


	public static void main(String[] args) {
		Parent c = new Child();
		System.out.println(c.str);
		c.print();
	}
}
