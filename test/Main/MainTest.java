package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test // kell az annotáció
    public void rollTest() { // test mindíg void és nincs bemeneti paramérete
        int counter = 0;
        while (counter < 100) {
            int result1 = Main.roll("2d6");
            boolean between1;
            between1 = result1 >= 2 && result1 <= 12;
            assertTrue(between1);
            counter++;
        }
        counter = 0;
        while (counter < 100) {
            int result2 = Main.roll("2d12");
            boolean between2;
            between2 = result2 >= 2 && result2 <= 24;
            assertTrue(between2);
            counter++;
        }

        int result3 = Main.roll("5d9");
        assertEquals(0, result3);

        int result4 = Main.roll("Stuff");
        assertEquals(0,result4);
    }

    @Test
    public void rolld20Test(){
        int counter = 0;
        while (counter < 100) {
            int result2 = Main.rolld20();
            boolean between2;
            between2 = result2 >= 1 && result2 <= 20;
            assertTrue(between2);
            counter++;
        }
    }

}