package oop5;

public class Calc implements Calculator1, Calculator2{
    public static void main(String[] args) {

        Calc c1 = new Calc();
        c1.add(100,100);

    }

    @Override
    public void add(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }

    @Override
    public void add(double a, double b) {
        double sum = a+b;
        System.out.println(sum);

    }

    @Override
    public void sub(int a, int b) {
        int sum = a+b;
        System.out.println(sum);

    }

    @Override
    public void sub(double a, double b) {
        double sum =a+b;
        System.out.println(sum);

    }
}
