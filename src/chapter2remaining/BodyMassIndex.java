package chapter2remaining;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the weight in kilogram:");
        int weightInKilograms = input.nextInt();

        System.out.println("enter the height in meters:");
        int heightInMeters = input.nextInt();

        int BMI = weightInKilograms / heightInMeters * heightInMeters;
        System.out.println("the bmi test is :" + BMI);
    }
}
