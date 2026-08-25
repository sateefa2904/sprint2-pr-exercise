package com.neueda.leap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testGreetWithDefaultName() {
        assertEquals("Hello World from Sprint 1", Main.greet());
    }

    @Test
    void testGreetWithCustomName() {
        assertEquals("Hello Soli from Sprint 1", Main.greet("Soli"));
    }
}
