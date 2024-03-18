package Chapterfour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalGallon = 0;
        int mileCounter = 0;

        System.out.println("enter the number of gallon or -1 to terminate:");
        int gallon = input.nextInt();
        int firstTrip = gallon / 1;

         while (gallon != -1){
           totalGallon = totalGallon + gallon;
           mileCounter = mileCounter + 1;

             System.out.println("enter the number gallon or -1 to terminate:");
             gallon = input.nextInt();
         }
        System.out.println("the first trip is :" + firstTrip);
         double totalTrip = (double) totalGallon / (double) mileCounter;
        System.out.println("the total trip of the journey is :" + totalTrip);
    }
}
