package by.belhard.j2.lesson6.pre;

import java.util.Map;
import java.util.TreeMap;

public class Garage {

	private Map<String, Car> carPlaces = new TreeMap<>();

	public Garage(int carsOnLevel, int levels) {

		for (int c = 65; c < 65 + levels; c++) {
			for (int i = 1; i <= carsOnLevel; i++)
				carPlaces.put("" + (char) c + i, null);
		}

		carPlaces.entrySet().forEach(System.out::println);
	}
}
