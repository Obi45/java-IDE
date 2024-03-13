import java.time.LocalDate;
import java.util.Scanner;

public class MenstruationCycleTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name:");
        String name = input.nextLine();

        System.out.println("how old are you:");
        int age = input.nextInt();
        if(age < 9 ){
            System.out.println("sorry you are underage");
        }
        else if(age > 60){
            System.out.println("sorry you have attain your menopause stage");
        }
        MenstruationCycle menstruationCycle = new MenstruationCycle();
        menstruationCycle.calculateMenstrualCycle();




    }
}
