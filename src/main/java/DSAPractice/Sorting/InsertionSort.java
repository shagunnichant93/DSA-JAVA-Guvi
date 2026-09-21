package DSAPractice.Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter elements of array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0;i<array.length;i++){
            int current = array[i];
            int j=i-1;
            while(j>=0 && current<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.println("Sorted Array");
        printArray(array);
        sc.close();
    }
}
