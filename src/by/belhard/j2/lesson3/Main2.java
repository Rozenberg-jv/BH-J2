package by.belhard.j2.lesson3;

public class Main2 {

    private int a;

    private static String newMethod(int a, int b) {

        if (a == b)
            return "equal";

        System.out.printf("a=%d, b=%d\n", a, b);
        return String.valueOf(a - b);
    }

    public static void main(String[] args) {

        String result = newMethod(10, 10);

        System.out.println(result);
    }


}
