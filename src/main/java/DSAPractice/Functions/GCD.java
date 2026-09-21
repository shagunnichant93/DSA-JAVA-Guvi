package DSAPractice.Functions;

import java.util.Scanner;

public class GCD {
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return Math.abs(a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

       int result = getGCD(a,b);
       System.out.println("GCD of two numbers is "+ result);
       sc.close();
    }
}
