package chapterTwo;

import java.util.Scanner;

public class DiameterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a radius:");
        double r = input.nextDouble();

        double diameter = 2 * r;
        System.out.println("the diameter of the circle is:" + diameter);


    }
}
