package DSAPractice.Strings;

import java.util.Scanner;

public class stringArrEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array");
        String[] names = new String[size];

        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        System.out.println("Output array");
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }


    }
}
