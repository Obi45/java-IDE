public class SumOfSeries {
    public static void main(String[] args){
        long sum = 0;
        for(long number = 1; number <= 100; number++){
            sum += number;
        }
        System.out.println(sum);
    }
}
