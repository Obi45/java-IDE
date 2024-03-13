package chapter2remaining;

import java.util.Scanner;

public class NegativeValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int negative = 0;
     int positive = 0;
     int zero = 0;

     for(int i = 1; i <= 5; i++){
         System.out.println("enter five numbers:");
         int number = input.nextInt();

         if(number < 0){
             negative++;
             
         } else if (number > 0) {
             positive++;
         }
         else
             zero++;
     }
        System.out.printf("negative number: %d%n", negative);

        System.out.printf("positive number: %d%n", positive);

        System.out.printf("zero number: %d", zero);
    }
}