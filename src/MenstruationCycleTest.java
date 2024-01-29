import java.time.LocalDate;
import java.util.Scanner;

public class MenstruationCycleTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MenstruationCycle menstruationCycle = new MenstruationCycle("null", 0);
        LocalDate localDate = new LocalDate.of(year, month, day);

System.out.println("Enter the first date you period started:");
int date1 = input.nextInt();
localDate.setDate(date1);
System.out.println("Enter the first date when your new period Started: ");
int date2 = input.nextInt();
localDate.setDate(date2);


    }
}
