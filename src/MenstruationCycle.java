import java.time.LocalDate;

public class MenstruationCycle {
    private String name;
    private int age;

    private LocalDate localDate;

    public MenstruationCycle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge() {
        if (age < 9) {
            return "not permitted";
        } else if (age < 60) {
            return "Access allowed";
        } else {
            return "Menopause Approached ";
        }
    }

    public String checkCycleLength(  ) {

        String cycleLength;
        cycleLength = date2 - date1;
        return cycleLength;
    }
    public String checkOvulationCycle(){
        String ovulationCycle = cycleLength / 2 ;
        return ovulationCycle ;
    }
    public int  checkFertileWindow(){
          return checkFertileWindow = cycleLength + 4 ;
    }
}

