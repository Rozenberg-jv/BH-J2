package by.belhard.j2.lesson6.hw.try1;

public class FoodGood extends AbstractGood {

	public FoodGood(String title, double price) {

		super(title, price);
	}

	@Override
	public String toString() {

		return "FoodGood " + super.toString();
	}
}
