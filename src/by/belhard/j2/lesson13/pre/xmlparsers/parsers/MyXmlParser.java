package by.belhard.j2.lesson13.pre.xmlparsers.parsers;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface MyXmlParser {
    /**
     * @param path - путь к файлу xml с названием
     */
    void parse(String path) throws ParserConfigurationException, SAXException, IOException;
}
