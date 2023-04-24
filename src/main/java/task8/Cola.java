package task8;

public class Cola {
    private int weight;
    private String tastle;

    public Cola(int weight, String tastle) {
        this.weight = weight;
        this.tastle = tastle;
    }

    @Override
    public String toString() {
        return String.format("Вес: %d, Вкус: %s", weight, tastle);
    }
}
