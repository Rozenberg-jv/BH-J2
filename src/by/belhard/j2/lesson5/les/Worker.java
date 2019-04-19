package by.belhard.j2.lesson5.les;

public class Worker extends Person {

    @Override
    public void doWork() {
        System.out.println("А, нет, уже умею, я же рабочий");
    }

    public void workersMethod() {
        System.out.println("workers method");
    }
}
