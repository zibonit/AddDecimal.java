package opp2;

public class Addition {

    //oop 1. inheritance 2. Polymorphism 3.Encapsulation 4. Abstration
    // Poly-morpism - 1 Method Overloading 2. Method Overriding

    // instance variable
    private int x;
    private int y;

    void add() {
        int sum= x+y; // sum -local variable
        System.out.println(sum);
    }
     double add(double a, double b){
        double sum = a+b;
        return sum;
    }
     public int add (int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public double add(double a, double b, double c) {
        double sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(100,100,100));
        System.out.println(a1.add(100.67, 100.89, 100.45));

    }
}
