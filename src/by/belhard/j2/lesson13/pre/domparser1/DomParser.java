package by.belhard.j2.lesson13.pre.domparser1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class DomParser {

    private final String path;

    private final Document document;

    public DomParser(String path) throws Exception {

        this.path = path;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        document = documentBuilder.parse(path);

    }

    public List<Person> parse() {

        List<Person> persons = new ArrayList<>();

        Element documentElement = document.getDocumentElement();
        NodeList childNodes = documentElement.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {

            Node node = childNodes.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                int id = Integer.parseInt(element.getAttribute("id"));

                if (element.getTagName().equals("person")) {
                    NodeList personTag = node.getChildNodes();
                    Element personElement = (Element) personTag;
                    String name;
                    int age;
                    String city;
                    String street;
                    String house;
                    String apartments;
                    List<String> phones = new ArrayList<>();
                    int weight;

                    name = personElement.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                    age = Integer.parseInt(personElement.getElementsByTagName("age").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    NodeList addressNode = personElement.getElementsByTagName("address").item(0).getChildNodes();
                    city = ((Element) addressNode).getElementsByTagName("city").item(0).getChildNodes().item(0).getNodeValue();
                    street = ((Element) addressNode).getElementsByTagName("street").item(0)
                            .getChildNodes().item(0).getNodeValue();
                    house = ((Element) addressNode).getElementsByTagName("house").item(0)
                            .getChildNodes().item(0).getNodeValue();
                    apartments = ((Element) addressNode).getElementsByTagName("apartments").item(0)
                            .getChildNodes().item(0).getNodeValue();

                    NodeList phonesNodes = personElement.getElementsByTagName("phones").item(0).getChildNodes();
                    Element phonesElement = (Element) phonesNodes;
                    for (int j = 0; j < phonesElement.getElementsByTagName("phone").getLength(); j++) {
                        String phone = phonesElement.getElementsByTagName("phone").item(j)
                                .getChildNodes().item(0).getNodeValue();
                        phones.add(phone);
                    }

                    weight = Integer.parseInt(personElement.getElementsByTagName("weight").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    Person newPerson = new Person(id, name, age, new Address(city, street, house, apartments), weight, phones);
                    persons.add(newPerson);
                } else if (element.getTagName().equals("baggage")) {
                    NodeList baggageTag = node.getChildNodes();
                    Element baggageElement = (Element) baggageTag;
                    int weight = Integer.parseInt(baggageElement.getElementsByTagName("weight").item(0)
                            .getChildNodes().item(0).getNodeValue());
                    addBaggageWeightToPerson(id, weight, persons);
                }
            }
        }

        return persons;
    }

    private void addBaggageWeightToPerson(int id, int weight, List<Person> persons) {
        for (Person person : persons) {
            if (person.getId() == id) {

                person.setWeight(person.getWeight() + weight);

                return;
            }
        }
    }

}
