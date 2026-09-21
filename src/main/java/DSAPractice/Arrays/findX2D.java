package DSAPractice.Arrays;

import java.util.Scanner;

public class findX2D {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column size");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter elements in 2D array");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter element to be searched");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j] == x){
                    System.out.println("X is at index: (" +i+ "," +j + ")" );
                }
            }
            System.out.println();
        }
    }
}
