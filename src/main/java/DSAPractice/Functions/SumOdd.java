package DSAPractice.Functions;

import java.util.Scanner;

public class SumOdd {
    public static int SumOfOddNumbers(int n){

        int sum = 0;

        for(int i=1;i<=n;i++){

            if(i%2!=0) {
                sum = sum + i;
            }
        }

        return  sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value");

        int n = sc.nextInt();

        int sumOfOdd = SumOfOddNumbers(n);

        System.out.println("Sum of odd numbers is " + sumOfOdd);
        sc.close();
    }
}
