package chapterTwo;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer:");
        int num1 = input.nextInt();

        System.out.println("enter the second integer:");
        int num2 = input.nextInt();

        System.out.println("enter the third integer:");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("the sum is:" + sum);

        int average = sum % 3;
        System.out.println("the average is :" + average);

        int product = num1 * num2 * num3;
        System.out.println("the product of the number is :"+ product);


        if (num1 < num2 && num1 < num3){
            System.out.println("the minimum number is:"+num1);
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("the minimum number is:"+num2);
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("the minimum number is:"+num3);

        }
        if (num1 > num2 && num1 > num3){
            System.out.println("the maximum number is:"+num1);
        }
        if (num2 > num1 && num2 > num3){
            System.out.println("the maximum number is:"+num2);
        }
        if (num3 > num1 && num3 > num2){
            System.out.println("the maximum number is:"+num3);

        }
    }
}
