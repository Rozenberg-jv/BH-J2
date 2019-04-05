package by.bh.jr.lesson1;

public class Person {

	String name;

	int age;

	Person() {

		name = "Default-name";
		age = 100;
	}

	Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	void walk() {

		System.out.println(name + " is walking");
	}

	void eat(String dish) {

		System.out.println(name + " is eating " + dish);
	}

}
