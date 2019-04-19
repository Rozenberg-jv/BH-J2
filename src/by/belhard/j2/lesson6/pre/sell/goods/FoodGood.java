package by.belhard.j2.lesson6.pre.sell.goods;

public class FoodGood extends AbstractGood {

	private FoodType type;

	public FoodGood(String title, double pricePerUnit, FoodType type) {

		super(title, pricePerUnit);

		this.type = type;
	}

	public FoodGood(String title, double pricePerUnit, String unitName, FoodType type) {

		super(title, pricePerUnit, unitName);

		this.type = type;
	}

	public FoodType getType() {

		return type;
	}

	public void setType(FoodType type) {

		this.type = type;
	}

	@Override
	public String toString() {

		return "FoodGood{" + "type=" + type + "} " + super.toString();
	}
}
