package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first integer:");
        int number1 = input.nextInt();

        System.out.println("enter the second integer:");
        int number2 = input.nextInt();

        int num1 = number1 * number1 * number1;
        System.out.println(num1);

        int num2 = number2 * number2;
        System.out.println(num2);

        if (num1 % num2 == 0){
            System.out.println("num1 is a multiple of num2");
        }
        else{
            System.out.println("it is not a multiple");
        }
    }
}
