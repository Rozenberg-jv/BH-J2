package by.belhard.j2.lesson6.hw.try1.goods;

public class PromGood extends AbstractGood {

	public PromGood(String title, double price) {

		super(title, price);
	}

	@Override
	public String toString() {

		return "PromGood " + super.toString();
	}
}
