package chapter2remaining;

public class TableOfSquare {

    public static void main(String[] args) {
        String number ="number";
        String square = "square";
        String cube = "cube";

        System.out.printf("%-7s%-8s%-8s%n", number, square, cube);
        System.out.printf("%-7d%-8d%-8d%n", 0 , 0, 0);
        System.out.printf("%-7d%-8d%-8d%n", 1 , 1, 1);
        System.out.printf("%-7d%-8d%-8d%n", 2 , 4, 8);
        System.out.printf("%-7d%-8d%-8d%n", 3 , 9, 27);
        System.out.printf("%-7d%-8d%-8d%n", 4 , 16, 64);
        System.out.printf("%-7d%-8d%-8d%n", 5 , 25, 125);

    }
}
