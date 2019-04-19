package by.belhard.j2.lesson5.les;

import by.belhard.j2.lesson4.hw.try1.Car;

public class Main {

    public static void main(String[] args) {

        /*Worker worker = new Worker();

        worker.exampleMethod();

        Person person1 = new Person();

        person1.doWork();

        worker.doWork();*/

        /*Person person1 = new Teacher();
        Person person2 = new Worker();

        person1.setA(150);
        System.out.println(person1.getA());
        System.out.println(person2.getA());

        person1.doWork();
        person2.doWork();

        person1.doWork("Desk");
        person2.doWork("Hammer");*/

        Workable workable;
        workable = new Monkey();

        if (workable instanceof Worker) {
            ((Worker) workable).workersMethod();
        }

        workable.doWork();


    }

}
