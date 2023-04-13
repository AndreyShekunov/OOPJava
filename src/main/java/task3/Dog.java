package task3;

public class Dog extends Animal{
    private String name;
    private int age;
    private String bread;

    @Override
    public void tellAboutYourself() {
        System.out.println("hello im a dog, my name is " + name + " my age is " + age +
                " my bread is " + bread);
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

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
