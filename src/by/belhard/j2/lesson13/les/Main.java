package by.belhard.j2.lesson13.les;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread inputThread = new Thread(() -> {
            String input = "";

            BufferedReader rdr = new BufferedReader(
                    new InputStreamReader(System.in));

            try {
                while (!input.equals("e")) {
                    input = rdr.readLine();
                    System.out.println("\n" + input);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        inputThread.start();

        for (; ; ) {
            Thread.sleep(100);
            Thread.yield();
            System.out.print("#");
        }
    }
}
