package by.belhard.j2.lesson6.les.try1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "one and half");
        boolean contains = list.contains("two");
        list.set(3, "five");
        list.remove("two");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        String s = list.get(1);
        System.out.println(s);

        System.out.println(list);
        System.out.println(list.size() + " " + list.isEmpty());
        System.out.println("contains 'two' : " + contains);*/

        /*Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");
        set.add("three");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("two"))
                iterator.remove();
        }

        System.out.println(set);*/

        Map<String, Car> map = new HashMap<>();

        map.put("audi", new Car("audi"));
        map.put("opel", new Car("opel corsa"));
        map.put("zaz", new Car("mersedes"));

        Car audi = map.get("audi");
        Car vaz = map.get("vaz");

        System.out.println(map.get("zaz").hashCode());

        map.put("zaz", new Car("zaparozhets"));

        System.out.println(map.remove("opel", new Car("opel corsa")));
        System.out.println(audi);
        System.out.println(vaz);
        System.out.println(map.get("zaz").hashCode());
        System.out.println("opel = " + map.get("opel"));


    }
}
