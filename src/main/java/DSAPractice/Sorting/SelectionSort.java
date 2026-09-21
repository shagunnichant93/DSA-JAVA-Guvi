package DSAPractice.Sorting;

import java.util.Scanner;

public class SelectionSort {
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

        for(int i=0;i<array.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<array.length;j++){
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.println("Sorted Array");
        printArray(array);
        sc.close();
    }
}
