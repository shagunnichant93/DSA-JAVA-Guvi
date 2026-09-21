package DSAPractice.Strings;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        String[] array = new String[size];

        int totalLength = 0;
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totalLength += array[i].length();
        }

        System.out.println("Cumulative Length of strings: "+ totalLength);

    }
}
