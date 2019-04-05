
package by.belhard.j2.lesson1;
@SuppressWarnings("all")
public class Person {

    String name;
    int age;

    Person() {
        name = "Default";
        age = 100;
    }

    Person(String name, int age) {
        this.name = name;
    }

    void walk() {
        System.out.println("I'm walking");
    }

    void eat() {
        System.out.println(name + " eating");
    }

}