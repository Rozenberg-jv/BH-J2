package by.belhard.j2.lesson13.pre.domparser1;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private int id;
	private String name;
	private int age;
	private Address address;
	private List<String> phones;
	private int weight;

	public Person(int id, String name, int age, Address address, int weight, List<String> phones) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.weight = weight;
		this.phones = new ArrayList<>();

		this.phones.addAll(phones);
	}

	@Override
	public String toString() {

		return "Person " + id + " [" + name + " /" + age + "/]\nweight: " + weight + "\naddress:\n" + address + "\n" + (!phones.isEmpty() ? "phones:\n" + phones :
				"no phones available");
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public Address getAddress() {

		return address;
	}

	public void setAddress(Address address) {

		this.address = address;
	}

	public List<String> getPhones() {

		return phones;
	}

	public void addPhones(String phone) {

		this.phones.add(phone);
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getWeight() {

		return weight;
	}

	public void setWeight(int weight) {

		this.weight = weight;
	}

}
