package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartServiceTest {


    @Test
    void changeCount() {
        CartService service = new CartService();
        Assertions.assertThrows(UnsupportedOperationException.class, () -> service.changeCount(1, 1));
    }
}