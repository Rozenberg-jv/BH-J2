package by.belhard.j2.lesson4.pre;

public class Person {

	private String name;

	private int age;

	private Country country;

	private Sex sex;

	public Person(String name, int age, Sex sex) {

		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public Country getCountry() {

		return country;
	}

	public void setCountry(Country country) {

		this.country = country;
	}

	public Sex getSex() {

		return sex;
	}

	@Override
	public String toString() {

		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", country=" + country + ", sex=" + sex + '}';
	}
}
