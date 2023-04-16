package Homework2;

public class doubleNumber extends Number {

    public void setValue(double value) {

        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public void add(Number num2) {
        double res = this.value + num2.value;
        System.out.println(this.value + " + " + num2.value + " = " + res);
    }

    @Override
    public void sub(Number num2) {
        double res = this.value - num2.value;
        System.out.println(this.value + " - " + num2.value + " = " + res);
    }

    @Override
    public void multi(Number num2) {
        double res = this.value * num2.value;
        System.out.println(this.value + " * " + num2.value + " = " + res);
    }

    @Override
    public void div(Number num2) {
        if (this.value == 0 || num2.value == 0) {
            System.out.println(-1);
        } else {
            double res = this.value / num2.value;
            System.out.println(this.value + " / " + num2.value + " = " + res);
        }

    }

}
