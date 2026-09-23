package DSAPractice.Recursion;

import java.util.Scanner;

public class PowerStack {
    public static int getPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = getPower(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n to get x^n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = getPower(x,n);
        System.out.println(res);
        sc.close();
    }
}
