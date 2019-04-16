package by.belhard.j2.lesson4.hw.try1;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("audi", 0, 0);

		System.out.println(car1);

		car1.move(6, 8);

		System.out.println(car1);

		car1.move(-6, -8);

		System.out.println(car1);
	}

}
