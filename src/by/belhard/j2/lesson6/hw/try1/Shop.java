package by.belhard.j2.lesson6.hw.try1;

import by.belhard.j2.lesson6.hw.try1.goods.AbstractGood;
import by.belhard.j2.lesson6.hw.try1.goods.AnimalGood;
import by.belhard.j2.lesson6.hw.try1.goods.FoodGood;
import by.belhard.j2.lesson6.hw.try1.goods.PromGood;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private Map<String, AbstractGood> assortment = new HashMap<>();

    private Map<AbstractGood, Integer> basket = new HashMap<>();

    //
    public void addFoodGood(String title, double price) {

        this.addGood(new FoodGood(title, price));
    }

    public void addPromGood(String title, double price) {

        this.addGood(new PromGood(title, price));
    }

    public void addAnimalGood(String title, double price) {

        this.addGood(new AnimalGood(title, price));
    }

    public void addGood(AbstractGood good) {

        assortment.put(good.getTitle(), good);
    }

    //
    // для 1 товара
    public AbstractGood addToBasket(String good) {

        return this.addToBasket(good, 1);
    }

    // для quantity товаров
    public AbstractGood addToBasket(String good, int quantity) throws RuntimeException {

        AbstractGood validGood = assortment.get(good);

        if (validGood == null) {
            throw new RuntimeException("There is no such good in this shop");
            /*System.out.println("Нет такого товара");
            return;*/
        }


        Integer oldValue = basket.get(validGood) == null ? 0 : basket.get(validGood);

        this.basket.put(validGood, oldValue + quantity);

        return validGood;
    }

    //
    public String getBillAndBuy() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n=== Your bill ===\n");
        String s;
        int count = 0;
        double sum = 0;

        for (Map.Entry<AbstractGood, Integer> e : basket.entrySet()) {
            AbstractGood good = e.getKey();
            int quantity = e.getValue();
            double middlePrice = good.getPrice() * quantity;
            sum += middlePrice;
            s = String.format("%d) %-20s%5.2f x %-3d = %5.2f",
                    ++count, good.getTitle(), good.getPrice(), quantity, middlePrice);
            sb.append(s).append("\n");
        }
        sb.append("Total sum: \t").append(sum).append("\n\n");

        basket.clear();

        return sb.toString();
    }

    //
    // вывод ассортимента товаров по категориям
    public String getAssortment() {

        StringBuilder sb = new StringBuilder();

        sb.append("Assortment:\n");
        for (AbstractGood g : assortment.values()) {
            if (g instanceof FoodGood)
                sb.append(g).append("\n");
        }
        sb.append("---\n");
        for (AbstractGood g : assortment.values()) {
            if (g instanceof PromGood)
                sb.append(g).append("\n");
        }
        sb.append("---\n");
        for (AbstractGood g : assortment.values()) {
            if (g instanceof AnimalGood)
                sb.append(g).append("\n");
        }
        sb.append("---\n");

        return sb.toString();
    }

}
