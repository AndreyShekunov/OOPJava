package Homework4;

public class HotDrink {
    private int temperature;
    private int value;
    private String name;

    public HotDrink(String name, int value, int temperature) {
        this.name = name;
        this.value = value;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public float getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Название: %s; Стоимость: %d; Температура: %d", name, value, temperature);
    }
}