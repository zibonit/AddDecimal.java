package string;

public class ReverseString {
    public static void main(String[] args) {

        String str = "CareerHack"; // kcaHreeraC

        //length = 10
        //start = 0
        // end = 9 (length-1)
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.length());
        String reveres ="";

        for (int i = str.length()-1; i>=0; i--) {
            reveres = reveres + str.charAt(i);


        }//end for



        //for(int i = 9; i >= 0; i--) {
          //  System.out.println();
        }// end main
    } //  end class

