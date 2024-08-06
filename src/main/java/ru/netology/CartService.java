package ru.netology;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CartService {
        //внутри он у себя хранит наш список пурчайз айтомов
        private final List<PurchaseItem> items = new ArrayList<>();

        //упрощенный метод добавления
        public void add(PurchaseItem item) {
            items.add(item);
        }
        //метод который выдает отсортированный список, который сейчас
        //условно лежит в корзинке - по определенному критерию
        public List<PurchaseItem> sortedBy(Comparator<PurchaseItem> comparator) {
            //будем сортировать не исходные списки,а некоторые результаты
            // из айтомсов
            List<PurchaseItem> result = new LinkedList<>(items);
            //сюда передаем наш компаратор
            result.sort(comparator);
            return result;
        }

        //метод удаления Id
        /*public void removeByItemId(int itemId) {
           items.removeIf(new Predicate<PurchaseItem>() {
               @Override
               public boolean test(PurchaseItem purchaseItem) {
                   return false;
               }
           });
        } */
// можно этот метод сократить
    public void removeByItemId(int itemId) {
        items.removeIf(o -> o.getItemId() == itemId);
        /* фактически мы передаем это лямбда-выражение
        и коллекция сама будет применять его к каждому обьекту
        и для того, у кого будет true- будет его удалять
         */
    }
    public void changeCount(int itemId, int count) {
        throw new UnsupportedOperationException();
        /* обычно когда методы еще не реализованы - просто выкидывается исключение,
        которое мы прописали
         */
    }

    }


