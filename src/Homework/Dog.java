package Homework;

import java.io.Serializable;

public class Dog implements Serializable {

//	private static final long serialVersionUID = 1000000000L;

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
