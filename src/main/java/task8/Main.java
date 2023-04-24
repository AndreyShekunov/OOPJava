package task8;

public class Main {

    public static void main(String[] args) {
        VendingMachine<Chips> chipsVendingMachine = new VendingMachine<>();
        VendingMachine<Chocolate> chocolateVendingMachine = new VendingMachine<>();
        VendingMachine<Cola> colaVendingMachine = new VendingMachine<>();

        chipsVendingMachine.addProduct(new Chips(200, "с луком"));
        chocolateVendingMachine.addProduct(new Chocolate(150, "с орехами"));
        colaVendingMachine.addProduct(new Cola(130, "ваниль"));

        System.out.println(chipsVendingMachine.getAll());
        System.out.println(chocolateVendingMachine.getAll());
        System.out.println(colaVendingMachine.getAll());
    }
}
