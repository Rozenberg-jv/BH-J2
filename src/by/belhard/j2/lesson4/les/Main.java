package by.belhard.j2.lesson4.les;

import by.belhard.j2.lesson4.les.entity.Country;
import by.belhard.j2.lesson4.les.entity.Person;
import by.belhard.j2.lesson4.les.entity.Sex;
import by.belhard.j2.lesson4.les.entity.Worker;

public class Main {


    public static void main(String[] args) {

        Person person1 = new Person("Pablo", 23, Sex.MALE);
        Person person2 = new Person("Anna", 20, Sex.FEMALE);

        person1.setCountry(new Country("Brazil", 123456));
        person2.setCountry(person1.getCountry());
        person1.toWork();
        person2.toWork();

//        System.out.println(Integer.toHexString(person1.getCountry().hashCode()));
//        System.out.println(Integer.toHexString(person2.getCountry().hashCode()));

        System.out.println(person1);
        System.out.println(person2);

        Worker worker1 = new Worker("Mustafa", 45, Sex.MALE);
        System.out.println(worker1.getClass());
    }
}
