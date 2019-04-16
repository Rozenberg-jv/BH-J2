package by.belhard.j2.lesson4.hw.try2;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("tesla", 10, 10);

		System.out.println(car1);

		car1.move(13, 14);
		car1.move(0, 0);
		car1.move(13, 100);

		System.out.println(car1);

		Car car2 = new Car("ZAZ", 0, 0);

		car2.move(car1.getCoordinates());

		System.out.println(car2);
	}

}
