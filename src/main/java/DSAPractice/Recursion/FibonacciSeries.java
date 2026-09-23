package DSAPractice.Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFib(int a,int b, int n){
        if(n == 0){
            return;
        }
        int nextTerm = a+b;
        System.out.println(nextTerm);
        printFib(b,nextTerm,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println(firstTerm);
        System.out.println(secondTerm);
        printFib(firstTerm,secondTerm,n-2);
    }
}
