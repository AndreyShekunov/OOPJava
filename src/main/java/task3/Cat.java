package task3;

public class Cat extends Animal{
    private String name;
    private int age;
    private boolean isInGoodMood;

    @Override
    public void tellAboutYourself() {
        System.out.println("hello im a cat, my name is " + name + " my age is " + age +
                " my mood is " + isInGoodMood);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isInGoodMood=" + isInGoodMood +
                '}';
    }
}
