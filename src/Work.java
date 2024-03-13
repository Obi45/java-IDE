public class Work {
    public String[] insert = new String[3];
    private boolean isEmpty;
    private int numberOfElement;

    public boolean isEmpty() {
        return numberOfElement == 0;

    }

    public void add(String name) {
       // insert[numberOfElement]=name;
        numberOfElement++;


    }

    public void remove(String name) {
        numberOfElement--;
    }


}



