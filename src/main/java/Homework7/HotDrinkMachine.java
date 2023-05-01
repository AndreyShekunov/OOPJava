package Homework4;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine <T> implements VendingMachine {
    private T hotDrinkMachine;
    private List<T> finishProduct = new ArrayList<>();

    public T getHotDrinkMachine() {
        return hotDrinkMachine;
    }

    public void setHotDrinkMachine(T drinkMachine) {
        this.hotDrinkMachine = drinkMachine;
    }

    public void finishProduct() {
        System.out.println(finishProduct);
    }

    public void setProduct(T drinkMachine) {
        finishProduct.add(drinkMachine);
    }
}
