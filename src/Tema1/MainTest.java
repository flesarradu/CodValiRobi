package Tema1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void kSpecial() {
        int[] kSpecial = {1,0,1,1,0,0};
        int[] notKSpecial = {1,1,0,0,1,0};
        assertTrue(Main.kSpecial(kSpecial, 6));
        assertFalse(Main.kSpecial(notKSpecial, 6));
    }
}