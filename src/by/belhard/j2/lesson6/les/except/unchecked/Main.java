package by.belhard.j2.lesson6.les.except.unchecked;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UncheckedExceptionExample uncheckedExample = new UncheckedExceptionExample();
        try {
            try {
                System.out.println(uncheckedExample.divide(5, 0));
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception was caught");
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}