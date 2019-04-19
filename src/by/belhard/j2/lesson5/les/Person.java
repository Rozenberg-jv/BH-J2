package by.belhard.j2.lesson5.les;


public abstract class Person implements Workable {

    private int a = 10;

    /*@Override
    public abstract void doWork();*/

    public void doWork(String str) {
        System.out.println("Work with " + str);
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
