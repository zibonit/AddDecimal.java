package algo;

public class primNumber {
    public static void main(String[] args) {
        //3, 7, 11, 13, 17, 19, 23, 29
        // Number that can only divide its self and number 1

        int num = 3;
        boolean isPsrim = true;

        // 2--6
        // 23---start 2-- end =22 increment by 1

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPsrim = false;
                //System.out.println(i+" Not a prom number");


            }//end if
        }//end fpr
        if(isPsrim==true)
            System.out.println("Prime Number");
        else
            System.out.println("Not a prime number");
    }
}