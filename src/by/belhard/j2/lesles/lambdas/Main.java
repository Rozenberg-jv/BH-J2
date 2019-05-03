package by.belhard.j2.lesles.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Auto> list = new ArrayList<>();

        list.add(new Auto("opel", 3000));
        list.add(new Auto("opel", 1500));
        list.add(new Auto("opel", 2000));
        list.add(new Auto("audi", 6000));
        list.add(new Auto("audi", 1500));
        list.add(new Auto("opel", 6000));

        Comparator<Auto> comparatorAuto = (o1, o2) -> {
            int dDistance = o1.getDistance() - o2.getDistance();
            if (dDistance == 0)
                return o1.getName().compareTo(o2.getName());

            return dDistance;
        };

/*
        list.sort(comparatorAuto);*/


        list.forEach(System.out::println);

        List<Auto> collect = list.stream().filter(a -> a.getDistance() < 5000).sorted(comparatorAuto)
                .collect(Collectors.toList());

        System.out.println();
        collect.forEach(System.out::print);

    }
}
