package by.belhard.j2.lesson4.hw.try3;

public class Car {

    private String title;

    private Point point;

    private double dist;

    public Car(String title, Point point, double dist) {
        this.title = title;
        this.point = point;
        this.dist = dist;
    }

    public Car(String title, double x, double y) {
        this(title, new Point(x, y), 0);
    }

    public void moveTo(double x, double y) {

        Point newPoint = new Point(x, y);

        this.dist += this.point.distance(newPoint);

        this.point = newPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Point getPoint() {
        return point;
    }

    public double getDist() {
        return dist;
    }

    /*@Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", point=" + point +
                ", dist=" + dist +
                '}';
    }*/
}
