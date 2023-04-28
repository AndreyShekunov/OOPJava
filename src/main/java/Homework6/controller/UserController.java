package Homework6.controller;

/*
Добавил класс UserController
 */

import Homework6.model.HotDrinkMachine;
import Homework6.product.Drink;

public class UserController {
    private HotDrinkMachine products = new HotDrinkMachine();

    public void setProduct(Drink drink) {
        products.setProduct(drink);
    }

    public void allProduct() {
        products.allProduct();
    }
}
