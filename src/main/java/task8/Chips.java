package task8;

public class Chips {
    private int weight;
    private String tastle;

    public Chips(int weight, String tastle) {
        this.weight = weight;
        this.tastle = tastle;
    }

    @Override
    public String toString() {
        return String.format("Чипсы весом %d, вкус '%s'", weight, tastle);
    }
}
