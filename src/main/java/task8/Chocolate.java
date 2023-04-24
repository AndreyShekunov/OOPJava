package task8;

public class Chocolate {
    private int weight;
    private String tastle;

    public Chocolate(int weight, String tastle) {
        this.weight = weight;
        this.tastle = tastle;

    }
    @Override
    public String toString() {
        return String.format("Вес: %d, Вкус: %s", weight, tastle);
    }
}
