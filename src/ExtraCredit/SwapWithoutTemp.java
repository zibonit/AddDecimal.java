package ExtraCredit;


public class SwapWithoutTemp {
    public static void main(String[] args) {

        int x=100;
        int y=200;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
