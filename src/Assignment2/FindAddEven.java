package Assignment2;

public class FindAddEven {
    public static void main(String[] args) {
        int x=101;

        for (int i=0; i<=x; i++){
            if (x%2==1) {
                System.out.println("Odd Number");
                break;
            }
        }
        for (int i=0; i<=x; i++){
            if (x%2==0){
                System.out.println("Even Number");
                break;
            }
        }


    }
}