package List;

public class List {

    public int[] reversedList(int[] list) {
        int[] list1 = new int[list.length];
        int count = 0;
        for (int index = list.length - 1; index >= 0; index--) {
            list1[count] = list[index];
            count++;


        }

    return list1;
}

    public int[]  evenIndex(int[] list) {
        int[] list1 = new int[list.length];
        int index;
        for (index = 0; index <= list.length; index++) {
            if (index % 2 == 1) {
                list[index] = list1[index];
            }

            System.out.println(list1[index]);

        }
        return list1;
    }
}


