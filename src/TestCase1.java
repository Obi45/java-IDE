public class TestCase1 {
    String guess = "the Lord is good";
    String guess2 = "He is worthy to be praised";
   public String guess1(){
       TestCase2 testCase2 = new TestCase2();
       return guess + guess2 + testCase2.guess2() + guess3();
   }
   public String guess3(){
       return "you";
   }
}
