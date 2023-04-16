package Homework2;

public class Main {
    public static void main(String[] args) {
        doubleNumber num1 = new doubleNumber();
        doubleNumber num2 = new doubleNumber();

        num1.setValue(5);
        num2.setValue(3);

        System.out.println("num1 = " + num1.getValue());
        System.out.println("num2 = " + num2.getValue());

        num1.add(num2);
        num1.sub(num2);
        num1.multi(num2);
        num1.div(num2);
    }
}
