package task5;

/*
1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
принятие/отдача заказа
*/

public interface QueueBehaviour {

    void takeInQueue(Actor actor);    // встать в очередь
    void takeOrders();                // принять заказ
    void giveOrders();                // отдать заказ
    void releaseFromQueue();          // уйти из очереди
}
