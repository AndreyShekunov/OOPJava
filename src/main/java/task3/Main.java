package task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(4);
        cat.setInGoodMood(true);

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(4);
        dog.setBread("ovcharka");

        cat.tellAboutYourself();
        dog.tellAboutYourself();
    }
}
