package task5;

/*
2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
обновление состояния магазина
*/
public interface MarketBehaviour {

    void acceptToMarket(Actor actor);                    // приход в магазин покупателя
    void releaseFromMarket(Actor actors);          // уход из магазина покупателя
    void update();                                       // обновление состояния магазина
}
