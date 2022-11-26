package arrays;

public class FindMaxValue {
    public static void main(String[] args) {

        int[] score = {90, 91, 93, 78, 86, 89, 77, 98, 90, 56};

        //length = 10
        //min index = 0
        //max index =length-1= 9
        int max = -1;

        for (int i=0; i<score.length; i++){
            if (max<score[i])
                max = score[i];

        }

        System.out.println(max);
    }
}
