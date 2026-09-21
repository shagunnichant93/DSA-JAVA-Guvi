package DSAPractice.Functions;

import java.util.Scanner;

public class CircleCircumference {

    public static void Circumference(float r){
        final float Pi = 3.14F;

        float c = 2*Pi*r;

        String formattedCircumference = String.format("%.2f", c);

        System.out.println("Radius of circle:" + r);
        System.out.printf("Circumference of circle:" + formattedCircumference);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float radius = sc.nextFloat();

        Circumference(radius);
        sc.close();
    }
}
