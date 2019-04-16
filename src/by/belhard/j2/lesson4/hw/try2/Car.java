package by.belhard.j2.lesson4.hw.try2;

public class Car {

	private String title;

	private Point coordinates;

	private double distance;

	public Car(String title, Point coordinates) {

		this(title, coordinates, 0);
	}

	public Car(String title, double x, double y) {

		this(title, new Point(x, y));
	}

	public Car(String title, Point coordinates, double distance) {

		this.title = title;
		this.coordinates = coordinates;
		this.distance = distance;
	}

	public double move(Point point) {

		double distance = this.coordinates.calcDistance(point);
		this.distance += distance;
		this.coordinates = point;

		return distance;
	}

	public double move(double x, double y) {

		return move(new Point(x, y));
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public Point getCoordinates() {

		return coordinates;
	}

	public double getDistance() {

		return distance;
	}

	@Override
	public String toString() {

		return "Car{" + "title='" + title + '\'' + ", coordinates=" + coordinates + ", distance=" + String.format("%.3f", distance) + '}';
	}
}
