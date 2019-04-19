package by.belhard.j2.lesson5.les;

public interface Workable {

    double PI = 3.1415;

    void doWork();

    default void exampleDefaultM(){
        System.out.println("default method");
    }

}
