package DSAPractice;
import  java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter diameter of circle: ");
        float diameter = sc.nextFloat();
        final float Pi = 3.14F;

        float radius = diameter / 2;

        float area = Pi * radius * radius;
        String formattedArea = String.format("%.2f", area);

        System.out.println("Radius of circle:" + radius);
        System.out.print("Area of circle:" + formattedArea);
        sc.close();
    }
}
