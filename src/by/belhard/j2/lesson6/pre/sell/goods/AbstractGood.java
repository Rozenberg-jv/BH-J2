package by.belhard.j2.lesson6.pre.sell.goods;

import by.belhard.j2.lesson6.pre.sell.Sellable;

public abstract class AbstractGood implements Sellable {

	private String title;

	private double pricePerUnit;

	private String unitName;

	public AbstractGood(String title, double pricePerUnit) {

		this(title, pricePerUnit, "piece");
	}

	public AbstractGood(String title, double pricePerUnit, String unitName) {

		this.title = title;
		this.pricePerUnit = pricePerUnit;
		this.unitName = unitName;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public double getPricePerUnit() {

		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {

		this.pricePerUnit = pricePerUnit;
	}

	public String getUnitName() {

		return unitName;
	}

	public void setUnitName(String unitName) {

		this.unitName = unitName;
	}

	@Override
	public String toString() {

		return "AbstractGood{" + "title='" + title + '\'' + ", pricePerUnit=" + pricePerUnit + ", unitName='" + unitName + '\'' + '}';
	}
}
