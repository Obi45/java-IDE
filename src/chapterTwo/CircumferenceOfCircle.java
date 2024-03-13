package chapterTwo;

import java.util.Scanner;

public class CircumferenceOfCircle {
    private static final double  PI = 3.14159;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius:");
        double radius = input.nextDouble();

        double circumference = 2 * PI * radius;
        System.out.println("the circumference of the circle is :" + circumference);

    }
}
