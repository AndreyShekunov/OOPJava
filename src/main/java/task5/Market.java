package task5;

/*
3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит
в списке список людей в очереди в различных статусах
 */

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();
    private Queue<Actor> actorsQueue = new ArrayDeque<Actor>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        Actor actor = actorsQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setMakeOrder();
        }
    }

    @Override
    public void giveOrders() {
        Actor actor = actorsQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setTakeOrder();
        }
    }

    @Override
    public void releaseFromQueue() {
        actorsQueue.poll();
    }
}