package by.belhard.j2.lesson6.les.except.checked;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		CheckedExceptionExample checkedExample = new CheckedExceptionExample();

		Map<String, Integer> stringIntegerMap;

		stringIntegerMap = checkedExample.readFile("qwedata.dt");


		System.out.println(stringIntegerMap);
		//		stringIntegerMap.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));

	}
}