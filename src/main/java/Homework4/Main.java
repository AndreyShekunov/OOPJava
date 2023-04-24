package Homework4;
/*
 Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от классов
 под каждый тип продукта, заменив единым классом - торговым автоматом
 */
public class Main {
    public static void main(String[] args) {

        HotDrinkMachine<Drink> drink = new HotDrinkMachine<>();

        HotDrinkMachine<HotDrink> hotDrink = new HotDrinkMachine<>();

        drink.setProduct(new Drink("Кока-кола", 200));
        drink.setProduct(new Drink("Пепси-кола", 200));

        hotDrink.setProduct(new HotDrink("Капучино", 300, 65));
        hotDrink.setProduct(new HotDrink("Американо", 200, 80));

        drink.finishProduct();
        hotDrink.finishProduct();

    }
}
