package DSAPractice.Functions;

import java.util.Scanner;

public class PowerNumber {
    public static double PowerOfNumbers(double a, double b){
        return Math.pow(a,b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        double result = PowerOfNumbers(x,n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);

        sc.close();
    }
}
