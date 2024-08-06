package ru.netology;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //создаю свой карт-сервис
        CartService service = new CartService();
        //ложу в него несколько пурчайз айтомов этих
        service.add(new PurchaseItem(1, 450, 3));
        service.add(new PurchaseItem(6, 4500, 7));
        service.add(new PurchaseItem(3, 1500, 2));
        service.add(new PurchaseItem(9, 12500, 5));
        service.add(new PurchaseItem(5, 120, 12));


        System.out.println(service.sortedBy(Comparator.comparingInt(PurchaseItem::getItemPrice)));

    }
}