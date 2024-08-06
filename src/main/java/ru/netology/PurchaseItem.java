package ru.netology;

import jdk.jfr.DataAmount;
import lombok.Getter;
import lombok.Setter;


public class PurchaseItem {
    @Setter
    @DataAmount
    @Getter


    private int itemId;
    private int itemPrice;
    private int count;



    public PurchaseItem(int itemId, int itemPrice, int count) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.count = count;

    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getCount() {
        return count;
    }
}

