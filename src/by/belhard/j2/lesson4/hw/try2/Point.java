package by.belhard.j2.lesson4.hw.try2;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public double calcDistance(Point another) {

		return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
	}

	public double getX() {

		return x;
	}

	public void setX(double x) {

		this.x = x;
	}

	public double getY() {

		return y;
	}

	public void setY(double y) {

		this.y = y;
	}

	@Override
	public String toString() {

		return "Point{" + "x=" + x + ", y=" + y + '}';
	}
}
