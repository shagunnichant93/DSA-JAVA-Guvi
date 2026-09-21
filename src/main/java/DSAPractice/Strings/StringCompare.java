package DSAPractice.Strings;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names");
        String name1 = sc.next();
        String name2 = sc.next();

        //compare
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
