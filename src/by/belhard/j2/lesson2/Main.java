package by.belhard.j2.lesson2;

public class Main {


    public static void main(String[] args) {

        int x = 23;

        // условный оператор
        if (x == 20) {
            x--;
        } else if (x == 21) {
            x++;
        } else {
            x /= 2;
        }

        // тернарный условный оператор
        int y = (x % 2 == 0) ? (x / 2) : (-x);

        System.out.println(x);
        System.out.println(y);

        // цикл while
        int i = 0;
        while (i < 5) {
            System.out.println(i++);
        }

        do {
            i--;
            System.out.println(i);
        } while (i >= -2);

        for (int j = 0; j <= 10; j += 2) {
            System.out.print(j + " ");
        }
    }
}
