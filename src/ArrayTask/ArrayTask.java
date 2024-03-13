package ArrayTask;

import javax.lang.model.util.ElementScanner6;

public class ArrayTask {

    public int[] checkOddNumber(int[] array) {
        if(array.length%2==0) {
            int[] array1 = new int[array.length / 2];
            int count = 0;

            for (int index = 0; index < array.length; index++) {
                if (index % 2 == 0) {
                    array1[count++] = array[index];

                }
            }
            return array1;
        }
        else{  int[] array1 = new int[array.length / 2 + 1];
            int count = 0;

            for (int index = 0; index < array.length; index++) {
                if (index % 2 == 0) {
                    array1[count++] = array[index];

                }
            }
            return array1;}
    }

}
