package by.belhard.j2.lesson6.pre.sell.services;

import by.belhard.j2.lesson6.pre.sell.Sellable;

public class AbstractService implements Sellable {

	private String title;

	private double pricePerHour;

	private double minimalBookingTime;

	public AbstractService(String title, double pricePerHour, double minimalBookingTime) {

		this.title = title;
		this.pricePerHour = pricePerHour;
		this.minimalBookingTime = minimalBookingTime;
	}

	public AbstractService(String title, double pricePerHour) {

		this(title, pricePerHour, 1);
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public double getPricePerHour() {

		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {

		this.pricePerHour = pricePerHour;
	}

	public double getMinimalBookingTime() {

		return minimalBookingTime;
	}

	public void setMinimalBookingTime(double minimalBookingTime) {

		this.minimalBookingTime = minimalBookingTime;
	}

	@Override
	public String toString() {

		return "AbstractService{" + "title='" + title + '\'' + ", pricePerHour=" + pricePerHour + ", minimalBookingTime=" + minimalBookingTime + '}';
	}
}
