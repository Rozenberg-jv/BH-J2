package by.belhard.j2.lesson6.les.try1;

import java.util.Objects;

public class Car {

    private String title;

    private double distance;

    public Car(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(title, car.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                '}';
    }
}
