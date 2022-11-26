package string;

public class StringDemo {
    public static void main(String[] args) {

        //primitive - byte(8), short(16), int(32), long(64), float(32), double, char, boolean
        //non primitive - String, Array

      //  float x= 12.35f;
       // double y = 12.78;

        String name = "CareerHack"; // declaring String with String Literals
        String city = new String("Astoria"); // declaring String as Object


        String text1 = "test";
        String text2 = new String("test");
        String text3 = new String("test");

        //== -- compares references
        //equals -- compares values

        if(text1.equals(text2))
            System.out.println("Both are same");
        else
            System.out.println("They are Different");

        if(text1==(text3))
            System.out.println("Both are same");
        else
            System.out.println("They are Different");

        name = "CareerHack Inc";

        int x = 10;
        x= 13;
        System.out.println(x);

        //String is immutable -- (StringBuffer/ StringBuilder -- make a string mutable)




    }
}
