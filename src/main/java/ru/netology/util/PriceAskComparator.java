package ru.netology.util;

import ru.netology.PurchaseItem;

import java.util.Comparator;

public class PriceAskComparator implements Comparator<PurchaseItem> {


    @Override
    public int compare(PurchaseItem o1, PurchaseItem o2) {
        //я хочу какую то логику и раз по возрастанию цены то так
        return o1.getItemPrice() - o2.getItemPrice();
    }
}
