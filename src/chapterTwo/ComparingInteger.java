package chapterTwo;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer:");
        int number = input.nextInt();

        int numberSquare = number * number * number;
        System.out.println(numberSquare);

        if ( numberSquare > 100) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (numberSquare == 100){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if( numberSquare != 100){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if( numberSquare < 100){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

