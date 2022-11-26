package Assignment2;

public class AddOddNumbers {
    public static void main(String[] args) {

        int total_sum = 0;
        for(int number = 50; number <= 70; number++)
            if( (number % 2)==1)
                total_sum += number;
        System.out.println(total_sum);
        //int x = 50;
       // int y = 70;
       // for (int i = x; i < y; i++)
        //    if (i % 2 == 1) {
          //      System.out.println(i);
            //}


    }
}
