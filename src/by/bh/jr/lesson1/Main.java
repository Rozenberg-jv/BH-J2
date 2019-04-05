package by.bh.jr.lesson1;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Paul";
		person1.age = 30;

		Person person2 = new Person("Laura", 19);

		Person person3 = new Person("Anna", person1.age);

		System.out.println(person1.name + " " + person1.age);
		System.out.println(person2.name + " " + person2.age);
		System.out.println(person3.name + " " + person3.age);

		person1.eat("potato");
		person2.walk();
		person3.eat("pizza");
	}

}
