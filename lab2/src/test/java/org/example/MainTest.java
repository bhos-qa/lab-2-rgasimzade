package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSayHello() {
        Main main = new Main();
        assertEquals("Hello, BHOS!", main.sayHello());
    }
}
