package Assignment2;

public class DisplayEvenNumber {
    public static void main(String[] args) {
        int x = 125;
        int y = 100;

        for (int i = y; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
