package by.belhard.j2.lesson6.hw.try1;

public class Main {

	public static void main(String[] args) {

		Shop shop = new Shop();

		shop.addGood(new FoodGood("Khlebushek", 0.75));
		shop.addFoodGood("Butter", 2.51);
		shop.addFoodGood("Vodka", 6.17);

		shop.addPromGood("nails", 0.02);
		shop.addPromGood("Saw for metal", 7.00);

		shop.addAnimalGood("toy-ball", 0.50);
		shop.addGood(new AnimalGood("toy-bone", 0.65));
		shop.addAnimalGood("dog food", 12.30);

		System.out.println(shop.getAssortment());

		shop.addToBasket("Butter");
		shop.addToBasket("nails", 50);
		//		shop.addToBasket("Milk");
		shop.addToBasket("Vodka");
		shop.addToBasket("dog food", 2);

		System.out.println(shop.getBillAndBuy());
	}

}
