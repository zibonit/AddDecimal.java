package opp4;

//import opp2.Addition;
import opp2.Addition;
import opp2.Subtraction;
import opp3.Multiplication;

public class Division{

    //static
    //final -- variable, method, and class
    //this -- constructor

    static int x ; //class variable

   static void division(double a, double b) {
        double d = a/b;
        System.out.println(d);
    }
    public static void main(String[] args) {

       division(100.00, 10.00);

        //(10.00+10.00+100)/10.00
        Addition a1 = new Addition();
        a1.add(10.00,10.00,100);

        //(100+100+100)(50.50-49.50)(10*10)/2
       //int sum1 = (a1.add(100,100,100));
       // System.out.println(sum1);
        //Addition s1= new Addition();
        //int sum2= (s1.add(100,100,100));
        //System.out.println(sum2);
        Multiplication m1= new Multiplication();
        //m1.multiple()



      // int




    }
}
