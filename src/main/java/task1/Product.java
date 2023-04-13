package task1;

public class Product {
    private String name;
    private int cost;

    Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name %s, cost %d", name, cost);
    }


}
