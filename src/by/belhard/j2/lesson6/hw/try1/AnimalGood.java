package by.belhard.j2.lesson6.hw.try1;

public class AnimalGood extends AbstractGood {

	public AnimalGood(String title, double price) {

		super(title, price);
	}

	@Override
	public String toString() {

		return "AnimalGood " + super.toString();
	}
}
