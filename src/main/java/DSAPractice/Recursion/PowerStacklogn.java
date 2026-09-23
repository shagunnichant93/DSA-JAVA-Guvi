package DSAPractice.Recursion;

import java.util.Scanner;

public class PowerStacklogn {
    public static int getPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        //n is even
        if(n%2==0){
           return getPower(x,n/2) * getPower(x, n/2);
        }
        //n is odd
        else {
            return getPower(x,n/2) * getPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n to get x^n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = getPower(x, n);
        System.out.println(res);
        sc.close();
    }
}


