package Examples;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {

        //User using Scanner Class
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Never hardcode the input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}


