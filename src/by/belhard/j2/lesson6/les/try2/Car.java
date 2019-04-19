package by.belhard.j2.lesson6.les.try2;

public class Car {
    private String title;
    private int distance;

    public Car(String title, int distance) {
        this.title = title;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", distance=" + distance +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
