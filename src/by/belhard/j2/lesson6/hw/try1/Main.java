package by.belhard.j2.lesson6.hw.try1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Shop shop = new Shop();

    public static void main(String[] args) throws IOException {

        shop.addFoodGood("Khlebushek", 0.75);
        shop.addFoodGood("Butter", 2.51);
        shop.addFoodGood("Vodka", 6.17);
        shop.addPromGood("nails", 0.02);
        shop.addPromGood("Saw for metal", 7.00);
        shop.addAnimalGood("toy-ball", 0.50);
        shop.addAnimalGood("toy-bone", 0.65);
        shop.addAnimalGood("dog food", 12.30);

        System.out.println(shop.getAssortment());

        /*shop.addToBasket("Butter");
        shop.addToBasket("nails", 50);
        shop.addToBasket("Milk");
        shop.addToBasket("Vodka");
        shop.addToBasket("Vodka");
        shop.addToBasket("dog food", 2);
        shop.addToBasket("nails", 100);*/

        buildBasket();


//        System.out.println(shop.getBillAndBuy());
    }

    private static void buildBasket() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while (!(input = reader.readLine()).equalsIgnoreCase("buy")) {

            try {
                System.out.println(shop.addToBasket(input));
            } catch (RuntimeException e) {
                System.out.println("Нет такого товара у нас в магазине!!!1111");
            }

        }

        System.out.println(shop.getBillAndBuy());
    }

}
