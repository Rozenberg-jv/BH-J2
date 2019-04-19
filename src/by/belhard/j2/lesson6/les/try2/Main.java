package by.belhard.j2.lesson6.les.try2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 25; i > 0; i--)
            cars.add(new Car("car" + (26 - i), 500 * (i % 4 + 1)));
        cars.forEach(System.out::println);
        System.out.println();
        System.out.println();
        List<Car> more1600kmList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getDistance() > 1600)
                more1600kmList.add(car);
        }

        more1600kmList.forEach(System.out::println);
    }
}
