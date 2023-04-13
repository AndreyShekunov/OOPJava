package Homework1;

import java.util.ArrayList;

/*
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
выдающий продукт соответствующий имени, объему и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
и воспроизвести логику заложенную в программе
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

public class Main {
    public static void main(String[] args) {

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        ArrayList<Object> Products = new ArrayList<>();
        HotDrink hotDrink = new HotDrink();

        hotDrink.setName("Кофе");
        hotDrink.setVolume(100);
        hotDrink.setTemperature(90);
        Products = hotDrinksMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotDrinksMachine.finishProduct(Products);

        hotDrink.setName("Чай");
        hotDrink.setVolume(200);
        hotDrink.setTemperature(100);
        Products = hotDrinksMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotDrinksMachine.finishProduct(Products);
    }
}
