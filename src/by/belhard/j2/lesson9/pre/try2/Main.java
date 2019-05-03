package by.belhard.j2.lesson9.pre.try2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final String IN = "Точка лежит внутри окружности";
	private static final String OUT = "Точка лежит вне окружности";
	private static final String ON = "Точка лежит на окружности";

	public static void main(String[] args) {

		BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Введите координаты центра окружности и ее радиус [через пробел]");
			String[] inputLine = rdr.readLine().split(" ");
			int circleX = Integer.parseInt(inputLine[0]);
			int circleY = Integer.parseInt(inputLine[1]);
			int circleR = Integer.parseInt(inputLine[2]);
			if (circleR <= 0)
				throw new RuntimeException("Отрицательный радиус!");

			System.out.println("Введите координаты точки");
			inputLine = rdr.readLine().split(" ");
			int pointX = Integer.parseInt(inputLine[0]);
			int pointY = Integer.parseInt(inputLine[1]);

			double dif = circleR - Math.sqrt(Math.pow(circleX - pointX, 2) + Math.pow(circleY - pointY, 2));

			if (dif < 0) {
				System.out.println(OUT);
			} else if (dif == 0) {
				System.out.println(ON);
			} else
				System.out.println(IN);

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Проблемы с вводом");
		}
	}
}
