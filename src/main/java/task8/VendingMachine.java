package task8;

import java.util.ArrayList;
import java.util.List;

/*
    Список методов:
    1. Добавить в список продуктов
    2. Получать продукты из списка
    3. Удалять продукты из списка
    Только один класс VendingMachine нельзя создавать наследников
*/
public class VendingMachine<T> {
    private List<T> products = new ArrayList<>();

    // метод добавления продукта в торговый автомат
    public void addProduct(T product){
        products.add(product);
    }

    // метод получения полного списка продуктов
    public List<T> getAll() {
        return products;
    }

}
