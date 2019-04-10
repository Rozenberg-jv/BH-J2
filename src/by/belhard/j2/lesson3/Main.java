package by.belhard.j2.lesson3;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[3][];
        array[0] = new String[3];
        array[1] = new String[2];
        array[2] = new String[1];



        for (String[] ar : array) {
            for (String s : ar) {
                s = "a";
                System.out.printf("%3s", s);
            }
            System.out.println();
        }


//        array[0] = "value1";
//        array[2] = "value3";
//        array[3] = "lala";

        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        /*for (String s : array) {
            System.out.println(s);
        }*/
    }
}
