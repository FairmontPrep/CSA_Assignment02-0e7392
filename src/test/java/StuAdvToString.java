import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StuAdvToString {
    
    @DisplayName("toString Test 01")
    @Test
    void toString_Test01 () {
        StudentAdvance ticket = new StudentAdvance(1);
        String str = ticket.toString();
        boolean received = str.contains("student ID required") &&
                str.contains("Number: ") && str.contains("Price: ");
        assertTrue(received);
    }

    @DisplayName("toString Test 02")
    @Test
    void toString_Test02 () {
        StudentAdvance ticket = new StudentAdvance(5);
        String str = ticket.toString();
        boolean received = str.contains("student ID required") &&
                str.contains("Number: ") && str.contains("Price: ");
        assertTrue(received);
    }

    @DisplayName("toString Test 03")
    @Test
    void toString_Test03 () {
        StudentAdvance ticket = new StudentAdvance(9);
        String str = ticket.toString();
        boolean received = str.contains("student ID required") &&
                str.contains("Number: ") && str.contains("Price: ");
        assertTrue(received);
    }

    @DisplayName("toString Test 04")
    @Test
    void toString_Test04 () {
        StudentAdvance ticket = new StudentAdvance(10);
        String str = ticket.toString();
        boolean received = str.contains("student ID required") &&
                str.contains("Number: ") && str.contains("Price: ");
        assertTrue(received);
    }

    @DisplayName("toString Test 05")
    @Test
    void toString_Test05 () {
        StudentAdvance ticket = new StudentAdvance(15);
        String str = ticket.toString();
        boolean received = str.contains("student ID required") &&
                str.contains("Number: ") && str.contains("Price: ");
        assertTrue(received);
    }
}
