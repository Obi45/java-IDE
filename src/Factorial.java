import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend,divisor;
        int remainder, hcf = 0;
        System.out.println("Enter the first number");
        dividend = input.nextInt();
        System.out.println("Enter the second number");
        divisor = input.nextInt();
        do{
            remainder = dividend % divisor;
            if(remainder == 0){
                hcf = divisor;
            }
            else {
                dividend = divisor;
                divisor = remainder;
            }
            }while (remainder !=0);
        System.out.println("HcF:"+ hcf);
        }
    }
    