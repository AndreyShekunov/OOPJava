package Homework6.product;

/*
Добавил наследование от класса Drink
закомментил ненужные методы и параметры
 */

public class HotDrink extends Drink{
    private int temperature;
//    private int value;
//    private String name;

    public HotDrink(String name, int value, int temperature) {
        super(name, value);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

//    public float getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return String.format("Название: %s; Стоимость: %d; Температура: %d", name, value, temperature);
//    }
}