package Homework6.product;

public class Drink {
    protected String name;
    protected int value;

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

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
