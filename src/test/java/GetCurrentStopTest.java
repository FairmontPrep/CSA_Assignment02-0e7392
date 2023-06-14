import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetCurrentStopTest {
    
    @DisplayName("getCurrentStop Test 01")
    @Test
    void getCurrentStop_Test01 () {
        Bus bus = new Bus(2);
        int received = bus.getCurrentStop();
        assertEquals(1, received);
    }

    @DisplayName("getCurrentStop Test 02")
    @Test
    void getCurrentStop_Test02 () {
        Bus bus = new Bus(5);
        int received = bus.getCurrentStop();
        assertEquals(1, received);
    }

    @DisplayName("getCurrentStop Test 03")
    @Test
    void getCurrentStop_Test03 () {
        Bus bus = new Bus(8);
        int received = bus.getCurrentStop();
        assertEquals(1, received);
    }
}