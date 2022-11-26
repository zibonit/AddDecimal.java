package opp2;

public class Subtraction extends Addition{

    void sub(int a, int b){
        int s = a-b;
        System.out.println(s);
    }
    void sub(double a,double b) {
        double s = a-b;
        System.out.println(s);
    }
    public double add(double a, double b, double c) {
        double sum = a + b + c+100.00;
        return sum;
    }

    public static void main(String[] args) {
        Subtraction s1 = new Subtraction();
        s1.sub(100, 10);

        // (100+100+100)-25
        int sum1= s1.add(100,100,100);
        s1.sub(sum1,25);
        //(100.67 + 100.56 + 100.45 -100.00)
        double sum2 = s1.add(100.67, 100.56, 100.45);
        s1.sub(sum2, 10.00);



    }
}
