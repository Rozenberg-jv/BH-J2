package by.belhard.j2.lesson8.les5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        double d1 = 5.000000000000000000001;
        double d2 = 4.000000000000000000001;

        System.out.println(d1 + d2);

        BigDecimal a = new BigDecimal("5.000000000000000000001");
        BigDecimal b = new BigDecimal("4.000000000000000000001");

        System.out.println(a.subtract(b));
    }
}
