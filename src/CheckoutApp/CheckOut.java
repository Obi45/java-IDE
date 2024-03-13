package CheckoutApp;

import java.util.ArrayList;

public class CheckOut {
    private int itemsName;
    private int quantity;
    private double price;

    public CheckOut(int itemsName,int quantity, double price){
        this.itemsName = itemsName;
        this.quantity = quantity;
        this.price = price;

    }


    public int getItemsName() {
        return itemsName;
    }

    public void setItemsName(int itemsName) {
        this.itemsName = itemsName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

