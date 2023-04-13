package Homework1;

import java.util.ArrayList;

public class HotDrinksMachine implements VendingMachine {


    @Override
    public void finishProduct(ArrayList<Object> product) {
        System.out.println(product);
    }

    public ArrayList<Object> getProduct(String name, int volume, int temperature) {
        ArrayList<Object> finishProd = new ArrayList<>();
        finishProd.add(name);
        finishProd.add(volume);
        finishProd.add(temperature);
        return finishProd;

    }

}
