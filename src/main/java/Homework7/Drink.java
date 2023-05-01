package Homework4;

public class Drink {
    private String name;
    private int value;

    public Drink(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return value;
    }

    public void setVolume(int value) {
        this.value = value;
    }

    public String toString() {
        return String.format("Название: %s; Стоимость: %d", name, value);
    }
}
