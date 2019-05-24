package by.belhard.j2.lesson13.pre.xmlparsers;

import by.belhard.j2.lesson13.pre.xmlparsers.parsers.MyDOMParser;
import by.belhard.j2.lesson13.pre.xmlparsers.parsers.MySAXParser;
import by.belhard.j2.lesson13.pre.xmlparsers.parsers.MyXmlParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

		String file = "resources/myxmldata.xml";

		MyXmlParser parser;

		parser = new MySAXParser();
		parser.parse(file);

		parser = new MyDOMParser();
		parser.parse(file);

	}
}
