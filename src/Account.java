public class Account {
    private int balance;

    public int getBalance(){return balance;}

    public void deposit (int depositAmount) {
        if(depositAmount > 0) balance += depositAmount;

    }

    public void withDraw(int amount) {
        if(balance > amount ){
            balance -= amount;
        }
    }
}

