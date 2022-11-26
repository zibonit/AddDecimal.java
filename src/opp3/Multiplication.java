package opp3;

import opp2.Addition;

public class Multiplication extends Addition {
    void multiple(int a, int b) {
        int m = a*b;
        System.out.println(m);
    }

    public static void main(String[] args) {
        Multiplication m1 = new Multiplication ();
        m1.multiple(100, 100);

        //(10+10+10)*10
        int sum1 =m1.add(10,10,10);
        m1.multiple(sum1, 10);

        //En-Capsul-ation
        //Access Modifiers - 1. public 2.private 3. default 4. protected
        //public - accessible within the project
        //default - accessible within the package
        //protected - accessible within the package + Outside Package if inherited

    }
}
