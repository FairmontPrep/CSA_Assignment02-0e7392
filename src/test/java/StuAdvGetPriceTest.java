import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StuAdvGetPriceTest {
    
    @DisplayName("getPrice Test 01")
    @Test
    void getPrice_Test01 () {
        StudentAdvance ticket = new StudentAdvance(5);
        double received = ticket.getPrice();
        assertEquals(20.0, received);
    }
        
    @DisplayName("getPrice Test 02")
    @Test
    void getPrice_Test02 () {
        StudentAdvance ticket = new StudentAdvance(1);
        double received = ticket.getPrice();
        assertEquals(20.0, received);
    }
        
    @DisplayName("getPrice Test 03")
    @Test
    void getPrice_Test03 () {
        StudentAdvance ticket = new StudentAdvance(9);
        double received = ticket.getPrice();
        assertEquals(20.0, received);
    }
        
    @DisplayName("getPrice Test 04")
    @Test
    void getPrice_Test04 () {
        StudentAdvance ticket = new StudentAdvance(10);
        double received = ticket.getPrice();
        assertEquals(15.0, received);
    }
        
    @DisplayName("getPrice Test 05")
    @Test
    void getPrice_Test05 () {
        StudentAdvance ticket = new StudentAdvance(15);
        double received = ticket.getPrice();
        assertEquals(15.0, received);
    }
}
