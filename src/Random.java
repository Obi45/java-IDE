 import java.security.SecureRandom;
public class Random {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int student = 0;
        for (int counter = 1; counter <= 40; counter++) {
            System.out.println(randomNumbers.nextInt(40) );

        }
    }
}
