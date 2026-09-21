package DSAPractice;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
        int PosCount = 0;
        int NegCount = 0;
        int ZeroCount = 0;

        do {
            System.out.println("Enter numbers");

            int num = sc.nextInt();

            if(num>0){
                PosCount++;
            }
            else if(num<0){
                NegCount++;
            }
            else{
                ZeroCount++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println();
        }while (choice=='y'||choice=='Y');

        System.out.println("Count of Positive numbers: " + PosCount);
        System.out.println("Count of Negative numbers: " + NegCount);
        System.out.println("Count of Zeroes entered: " + ZeroCount);
        sc.close();
    }
}
