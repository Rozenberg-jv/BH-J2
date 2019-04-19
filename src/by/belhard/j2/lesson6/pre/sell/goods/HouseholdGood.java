package by.belhard.j2.lesson6.pre.sell.goods;

public class HouseholdGood extends AbstractGood {

	private String instruction;

	public HouseholdGood(String title, double pricePerUnit, String instruction) {

		super(title, pricePerUnit);
		this.instruction = instruction;
	}

	public HouseholdGood(String title, double pricePerUnit, String unitName, String instruction) {

		super(title, pricePerUnit, unitName);
		this.instruction = instruction;
	}

	public String getInstruction() {

		return instruction;
	}

	public void setInstruction(String instruction) {

		this.instruction = instruction;
	}

	@Override
	public String toString() {

		return "HouseholdGood{" + "instruction='" + instruction + '\'' + "} " + super.toString();
	}
}
