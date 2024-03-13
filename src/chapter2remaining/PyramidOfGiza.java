package chapter2remaining;

import java.util.Scanner;

public class PyramidOfGiza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numberOfStone = 2300000;
        double weightOfStone = 2268;
        int years = 25;

        int oneYear = 2300000 / 25;
        System.out.println("the number of stone to be use in one year:" + oneYear);

        int numberOfMonth = 2300000 / 300;
        System.out.println("the number of stone to be used in one month is:"+ numberOfMonth);

        int oneDay = 2300000 / 9000;
        System.out.println("the number of stone used in one day is :" + oneDay);







    }
}
