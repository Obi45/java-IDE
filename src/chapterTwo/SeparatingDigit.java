package chapterTwo;

import java.util.Scanner;

public class SeparatingDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digit number:");
        int number = input.nextInt();

        int number1 = number / 10000;
        int number2 = number / 1000 % 10;
        int number3 =
    }
}
