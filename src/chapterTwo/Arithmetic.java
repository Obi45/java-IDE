package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer: ");
        int number = input.nextInt();

        System.out.println("enter the second integer:");
        int number2 = input.nextInt();

        int numberSquare = number * number;
        System.out.println("the square of number one is:" + numberSquare);

        int number2Square = number2 * number2;
        System.out.println("the square of number two is:"+ number2Square);

        int numberSum = number + number;
        System.out.println("the sum of number one is:"+ numberSum);

        int number2sum = number2 + number2;
        System.out.println("the sum of number two is:"+ number2sum);

        int diff = numberSquare - number2Square;
        System.out.println("the difference of square1 and square2 is:"+ diff);


    }
}
