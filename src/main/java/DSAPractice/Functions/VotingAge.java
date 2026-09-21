package DSAPractice.Functions;

import java.util.Scanner;

public class VotingAge {
    public static void  VotingEligibity(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Age");

        int age = sc.nextInt();

        VotingEligibity(age);
        sc.close();
    }
}
