package Homework6.view;

import Homework6.controller.UserController;
import Homework6.product.Drink;
import Homework6.product.HotDrink;

/*
 Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от классов
 под каждый тип продукта, заменив единым классом - торговым автоматом

 - разбил по пакетам
 - добавил контроллер
 - майн работает только через контроллер
 - продукты вынесены в отдельный пакет, список продуктов можно расширять
 */
public class Main {
    public static void main(String[] args) {

        UserController user = new UserController();
        user.setProduct(new Drink("Кока-кола", 200));
        user.setProduct(new Drink("Пепси-кола", 200));

        user.setProduct(new HotDrink("Капучино", 300, 65));
        user.setProduct(new HotDrink("Американо", 200, 80));

        user.allProduct();

    }
}
