package by.belhard.j2.lesson4.hw.try1;

public class Car {

	private String title;

	private double x;

	private double y;

	private double distance;

	public Car(String title, double x, double y, double distance) {

		this.title = title;
		this.x = x;
		this.y = y;
		this.distance = distance;
	}

	public Car(String title, double x, double y) {

		this.title = title;
		this.x = x;
		this.y = y;
		this.distance = 0;
	}

	public double move(double x, double y) {

		double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		this.distance += distance;
		this.x = x;
		this.y = y;

		return distance;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public double getX() {

		return x;
	}

	public double getY() {

		return y;
	}

	public double getDistance() {

		return distance;
	}

	@Override
	public String toString() {

		return "Car{" + "title='" + title + '\'' + ", x=" + x + ", y=" + y + ", distance=" + distance + '}';
	}
}
