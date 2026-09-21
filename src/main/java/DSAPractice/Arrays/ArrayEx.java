package DSAPractice.Arrays;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the element needs to be searched in an array");
        int x = sc.nextInt();

        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j]==x) {
                System.out.println("x found at:" + j);
            }
        }
    }
}
