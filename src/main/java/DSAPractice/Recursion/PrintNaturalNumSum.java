package DSAPractice.Recursion;

import java.util.Scanner;

public class PrintNaturalNumSum {
    public static void PrintSum(int i, int n, int sum){
        if(i==n){
            sum +=i;
            System.out.println("Sum of " + n + " numbers: "+ sum);
            return;
        }
        sum +=i;
        PrintSum(i+1,n,sum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        PrintSum(1,n,0);
        sc.close();
    }
}
