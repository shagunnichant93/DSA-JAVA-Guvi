package DSAPractice.Recursion;

import java.util.Scanner;

public class PrintNumbers2 {
    public static void PrintNum(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();//n=1

        PrintNum(n);
        sc.close();
    }
}
