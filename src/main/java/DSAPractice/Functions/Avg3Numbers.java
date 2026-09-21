package DSAPractice.Functions;

import java.util.Scanner;

public class Avg3Numbers {
    public static float CalculateAverage(float x,float y, float z){
        float average;
        average = (x+y+z)/3;
        return average;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float avg = CalculateAverage(a,b,c);

        System.out.println("Average of 3 numbers:" + avg);
        sc.close();
    }
}
