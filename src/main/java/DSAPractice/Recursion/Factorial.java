package DSAPractice.Recursion;

import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        int fact_nm1 = getFactorial(n-1);
        int fact_n = n * fact_nm1;
        return  fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int fact = getFactorial(n);

        System.out.println("Factorial of " + n+ " is " + fact);

        sc.close();

    }
}
