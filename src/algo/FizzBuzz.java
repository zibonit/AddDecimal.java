package algo;

public class FizzBuzz {
    public static void main(String[] args) {

        // num%3==0--fizz
        //num%5==0 --Buzz
        //num%3 == && num%5==0 --FizzBuzz

        //9-- Fizz
        //10 - Buzz
        //15 -- FizzBuzz

        int num = 25;

        if(num%3==0 && num%5==0)
            System.out.println("FizzBuzz");
        else if(num%5==0)
            System.out.println("Buzz");
        else if(num%3==0)
            System.out.println("Fizz");
        else
            System.out.println(num);
    }
}
