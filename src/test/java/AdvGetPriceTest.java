import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdvGetPriceTest {
    
    @DisplayName("getPrice Test 01")
    @Test
    void getPrice_Test01 () {
        Advance ticket = new Advance(5);
        double received = ticket.getPrice();
        assertEquals(40.0, received);
    }
        
    @DisplayName("getPrice Test 02")
    @Test
    void getPrice_Test02 () {
        Advance ticket = new Advance(1);
        double received = ticket.getPrice();
        assertEquals(40.0, received);
    }
        
    @DisplayName("getPrice Test 03")
    @Test
    void getPrice_Test03 () {
        Advance ticket = new Advance(9);
        double received = ticket.getPrice();
        assertEquals(40.0, received);
    }
        
    @DisplayName("getPrice Test 04")
    @Test
    void getPrice_Test04 () {
        Advance ticket = new Advance(10);
        double received = ticket.getPrice();
        assertEquals(30.0, received);
    }
        
    @DisplayName("getPrice Test 05")
    @Test
    void getPrice_Test05 () {
        Advance ticket = new Advance(15);
        double received = ticket.getPrice();
        assertEquals(30.0, received);
    }
}
