package task4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("John");

        human.setMakeOrder();
        human.setTakeOrder();

        System.out.println(human.isMakeOrder());  // true
        System.out.println(human.isTakeOrder());  // true

        System.out.println(human.getName());      // John

    }

}
