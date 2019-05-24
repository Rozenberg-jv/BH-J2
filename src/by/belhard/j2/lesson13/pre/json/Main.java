package by.belhard.j2.lesson13.pre.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;

import java.io.File;

public class Main {

	/**
	 * для того, чтобы пример заработал, необходимо подключить библиотеку Jackson.
	 * для этого - входим в настройки проекта (Ctrl+Alt+Shift+S), либо File > Project Structure
	 * в левой части выбираем строку Libraries
	 * в следующем окошке (втором слева) нажимаем на `+` и выбинаем `from Maven` (нужно подключение к интернету)
	 * в окне ввода пишем `com.fasterxml.jackson.core:jackson-databind:2.9.8` (без кавычек), ждем, пока найдет
	 * выставляем галочку `Download to`
	 * нажимаем `Ok`, библиотека скачана и добавлена в проект.
	 * Теперь можно импортировать классы и аннотации из этой библиотеки
	 */
	public static void main(String[] args) throws Exception {

		File file = new File("resources/city.json");

		ObjectMapper objectMapper = new ObjectMapper();

		ObjectReader objectReader = objectMapper.reader(City.class);

		City city = objectReader.readValue(file);

		System.out.println(city);
	}
}
