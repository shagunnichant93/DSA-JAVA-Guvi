package DSAPractice.Functions;

import java.util.Scanner;

public class GreaterNumber {

    public static void FindGreaterNumber(int a, int b){
        if(a>b){
            System.out.println(a + " is greater");
        }
        else if(b>a){
            System.out.println(b + " is greater");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        FindGreaterNumber(x,y);
        sc.close();
    }
}
