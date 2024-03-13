package chapter2remaining;

import java.util.Scanner;

public class GrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the current world population:");
        double population = input.nextDouble();


        double annualRate = 0.011;

        double firstYear = 0.011 * population;
        System.out.println("the population for first year is :" + firstYear);

        double secondYear = 2 * 0.011 * population;
        System.out.println("the population for second year is :" + secondYear);

        double thirdYear = 3 * 0.011 * population;
        System.out.println("the population for third year is :" + thirdYear);

        double fourthYear = 4 * 0.011 * population;
        System.out.println("the population for fourth year is :" + fourthYear);

        double fifthYear = 5 * 0.011 * population;
        System.out.println("the population for the fifth year is :" + fifthYear);

    }

}
