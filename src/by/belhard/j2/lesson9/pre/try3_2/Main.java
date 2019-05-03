package by.belhard.j2.lesson9.pre.try3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    // реализация сортировки вставкой элемента сразу на нужное место
    public static void main(String[] args) {

        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        try {
            int n = Integer.parseInt(rdr.readLine());

            for (int i = 0; i < n; i++) {
                String line = rdr.readLine();

                int index = 0;
                for (String s : list) {
                    if (s.replaceAll(" ", "").length() >= line.replaceAll(" ", "").length())
//                    if (s.length() >= line.length())
                        break;
                    index++;
                }

                list.add(index, line);
            }

            for (String s : list)
                System.out.println(s);

        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }
}
