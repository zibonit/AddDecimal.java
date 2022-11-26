package oop1;

public class MethodsDemo {
 // instance variable
    int x;
    int y;

    //return type method name()
    void add(){
        int sum =x+y;
        System.out.println(sum);
    }//end of add
    void add(int a, int b, int c){
        int sum = a+b+c; // local variable
        System.out.println(sum);
    }//end of add
    double add ( double a, double b, double c){
        double sum = a+b+c; // local variable
        return sum;
    }//end of add
    int sub(){
        int s = x-y;
        return s;
    }//end of sub


    public static void main(String[] args) {

        MethodsDemo md1 = new MethodsDemo();
        md1.x=15;
        md1.y=10;
        md1.add();
        System.out.println( md1.sub());
        int s1 = md1.sub();
        System.out.println(s1);
        md1.add(100, 100, 100);

        MethodsDemo md2 = new MethodsDemo();
        md2.x=150;
        md2.y=100;
        md2.add();



    }
}
