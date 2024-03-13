package chapterTwo;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer:");
        int num1 = input.nextInt();

        System.out.println("enter the second integer:");
        int num2 = input.nextInt();

        System.out.println("enter the third integer:");
        int num3 = input.nextInt();

        int minimumval = num1;

        if (num2 < minimumval) {
            minimumval = num2;
        }
        if (num3 < minimumval) {
            minimumval = num3;
        }
        System.out.println("the smallest number is:" + minimumval);


        int maximumval = num1;

        if (num2 > maximumval) {
            maximumval = num2;
        }
        if (num3 > maximumval) {
            maximumval = num3;
        }
        System.out.println("the largest number is:" + maximumval);

    }
}
