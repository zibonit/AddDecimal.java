package ExtraCredit;

import java.util.Scanner;



public class FindFactorials {
    public static void main(String[] args) {

        int n,fact=1;
        System.out.println("Enter any Number ");// x
        Scanner num=new Scanner(System.in);//
        n=num.nextInt();

       for (int i = 1; i <= n; i++)
           fact=fact*i;
       System.out.println("Factorials "+fact);


        }
    }

