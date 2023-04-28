package Homework6.model;

import Homework6.product.Drink;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine <Drink> implements VendingMachine {
//    private T hotDrinkMachine;
    private List<Drink> allProduct = new ArrayList<>();


    @Override
    public void allProduct() {
        for (Drink drink : allProduct) {
            System.out.println(drink);
        }
    }

    @Override
    public void setProduct(Homework6.product.Drink product) {
        allProduct.add((Drink) product);
    }


}
