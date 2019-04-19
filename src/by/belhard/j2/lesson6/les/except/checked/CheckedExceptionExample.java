package by.belhard.j2.lesson6.les.except.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CheckedExceptionExample {

    public Map<String, Integer> readFile(String path) {

        Map<String, Integer> result = new HashMap<>();

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.err.println("Bad file");
            return new HashMap<>();
        }

        String[] splittedLine;
        String key;
        int value;

        try {
            while (br.ready()) {
                splittedLine = br.readLine().split(" ");
                key = splittedLine[0];
                value = Integer.parseInt(splittedLine[1]);
                addToMap(result, key, value);
            }
        } catch (IOException e) {
            System.out.println("something goes wrong");
            return new HashMap<>();
        }

        return result;
    }

    private void addToMap(Map<String, Integer> map, String key, int value) {

        if (map.containsKey(key)) {
            map.put(key, map.get(key) + value);
        } else {
            map.put(key, value);
        }
    }

}
