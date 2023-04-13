package task1;

/*
* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
* содержащий в себе методы getProductByName и getProductByPrice
*/

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct("Coca-Cola", 100);
        vm.addProduct("Snikers", 50);
        System.out.println(vm.getProductByPrice(50).toString());
        System.out.println(vm.getProductByName("Coca-Cola").toString());
    }
}
