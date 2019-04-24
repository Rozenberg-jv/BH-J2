package by.belhard.j2.lesson6.hw.try1;

import java.util.Objects;

public abstract class AbstractGood {

	private String title;

	private double price;

	public AbstractGood(String title, double price) {

		this.title = title;
		this.price = price;
	}

	public String getTitle() {

		return title;
	}

	public double getPrice() {

		return price;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof AbstractGood))
			return false;
		AbstractGood that = (AbstractGood) o;
		return title.equals(that.title);
	}

	@Override
	public int hashCode() {

		return Objects.hash(title);
	}

	@Override
	public String toString() {

		return "{" + "title='" + title + '\'' + ", price=" + price + '}';
	}
}
