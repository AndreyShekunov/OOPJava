package task5;

public class Main {
/*
1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
принятие/отдача заказа
2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
обновление состояния магазина
3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит
в списке список людей в очереди в различных статусах
 */

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("John");

        human.setMakeOrder();
        human.setTakeOrder();

        System.out.println(human.isMakeOrder());  // true
        System.out.println(human.isTakeOrder());  // true

        System.out.println(human.getName());      // John

        Market market = new Market();
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.acceptToMarket(human);

    }
}
