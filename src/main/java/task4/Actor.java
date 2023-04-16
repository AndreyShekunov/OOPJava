package task4;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;   // по умолчанию false
    protected boolean isTakeOrder;   // по умолчанию false

    public abstract String getName();
}
