import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MoveTest {

    @DisplayName("move Test 01")
    @Test
    void move_Test01 () {
        Bus bus = new Bus(2);
        for (int i = 0; i < 6; i++)
            bus.move();
        int received = bus.getCurrentStop();
        assertEquals(1, received);
    }

    @DisplayName("move Test 02")
    @Test
    void move_Test02 () {
        Bus bus = new Bus(2);
        for (int i = 0; i < 9; i++)
            bus.move();
        int received = bus.getCurrentStop();
        assertEquals(2, received);
    }

    @DisplayName("move Test 03")
    @Test
    void move_Test03 () {
        Bus bus = new Bus(6);
        for (int i = 0; i < 5; i++)
            bus.move();
        int received = bus.getCurrentStop();
        assertEquals(6, received);
    }
    
    @DisplayName("move Test 04")
    @Test
    void move_Test04 () {
        Bus bus = new Bus(8);
        for (int i = 0; i < 8; i++)
            bus.move();
        int received = bus.getCurrentStop();
        assertEquals(7, received);
    }

    @DisplayName("move Test 05")
    @Test
    void move_Test05 () {
        Bus bus = new Bus(5);
        for (int i = 0; i < 9; i++)
            bus.move();
        int received = bus.getCurrentStop();
        assertEquals(2, received);
    }
}
