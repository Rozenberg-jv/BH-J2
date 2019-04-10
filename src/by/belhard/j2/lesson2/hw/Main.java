package by.belhard.j2.lesson2.hw;

public class Main {
    public static void main(String[] args) {

        // task1
        /*int x = 5;

        x = x * 2;
        int result = 0;

        if (x < 20)
            result = -x;
        else if (x > 20)
            result = x;
        else
            result = 0;

        System.out.println(result);*/

        // task2
        /*for (int i = 1; i <= 15; i++)
            System.out.printf("%d) Это %d-я строка\n", i, i);

        System.out.println("the end");*/

        // task3
        /*int x = 5;

        for (int i = 0; i < x; i++) {
            System.out.print(x * i + " ");
        }*/

        // task4
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i==1 && j==1) {
                    System.out.print("     ");
                    continue;
                }
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
