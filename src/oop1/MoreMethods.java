package oop1;

public class MoreMethods extends MethodsDemo{
    void multiple(double a, double b) {
        double m = a * b;
        System.out.println(m);
    }

    void divide(int a, int b) {
        int d = a / b;
        System.out.println(d);
    }

    public static void main(String[] args) {
        MoreMethods mm1 = new MoreMethods();
        mm1.multiple(10.00, 10.00);

        // (100.75, 67.99+12.77) * 10.00
        // DRY Principle -- Do Not Repeat Yourself
        double sum1 = mm1.add(100.75,67.99,12.77);
        mm1.multiple(sum1, 10.00);

    }
}

