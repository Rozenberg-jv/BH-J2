package by.belhard.j2.lesson13.pre.domparser1;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		String path = "resources/domparser1.xml";
		DomParser domParser = new DomParser(path);

		List<Person> persons = domParser.parse();

		for (Person person : persons) {
			System.out.println(person);
			System.out.println();
		}
	}
}
