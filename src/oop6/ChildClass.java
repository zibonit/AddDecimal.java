package oop6;

public class ChildClass extends AbstractClaasDemo{
    @Override
    void add(double a, double b) {

        double sum = a+b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        ChildClass cc1 = new ChildClass();
        cc1.add(100,100);

    }


}
