package by.belhard.j2.lesson4.pre;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person("Pablo", 21, Sex.MALE);
		Person person2 = new Person("Anna", 19, Sex.FEMALE);
		person1.setCountry(new Country("Brazil", "123456"));
		person2.setCountry(person1.getCountry());

		System.out.println(person1);
		System.out.println(person2);
	}
}
