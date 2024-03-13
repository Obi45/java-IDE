
import java.time.LocalDate;
import java.util.Scanner;


public class MenstruationCycle {
    LocalDate presentDate = LocalDate.now();

    public void getUserName() {
        System.out.println("enter user name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
    }
    public void getUserAge() {
        System.out.println("Enter users age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        int menstrualAge = 10;
         if (age < menstrualAge){
             System.out.println("sorry you are below 10");

             System.out.println("if you wish to continue enter yes");
             String response = input.nextLine();
             if (response.equals("yes")) {
                 System.out.println("""
                         you are welcome to our app, we are nice to have you here as you proceed
                         further you will learn more about menstrual issues. 
                         """);
             }else if (response.equals("No")){
                 System.out.println("Goodbye thank you for choosing us");
                 System.exit(0);
             }

         }
    }

    public void calculateMenstrualCycle() {
        System.out.println("When was the last flow of your menstrual flow:");
        Scanner input = new Scanner(System.in);
        int lastDayOfFlow = input.nextInt();
        int daysOfMonth = 31;
        boolean valid = true;

        while(true){
            if (lastDayOfFlow < 1){
                System.out.println("Enter a valid number");

                    System.out.println("Enter a valid date:");

                    System.out.println("what month did you experience your last flow");
                    int lastFlowMonth = input.nextInt();

                System.out.println("enter year of flow:");
                int yearOfFlow = input.nextInt();

                System.out.println("what is the average length of your menstrual cycle:");
                int menstrualCycleLength = input.nextInt();

                LocalDate dateOfMenstrualFlow = LocalDate.of(yearOfFlow, lastFlowMonth,lastDayOfFlow);
                LocalDate nextMenstrualFlow = dateOfMenstrualFlow.plusDays(menstrualCycleLength);
                System.out.println("your next menstrual will be:" + nextMenstrualFlow);

                }
            }
        }
    }





