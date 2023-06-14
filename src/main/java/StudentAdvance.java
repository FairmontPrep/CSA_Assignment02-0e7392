/* INSTRUCTIONS
 * The StudentAdvance class is a child class of Advance. If a ticket is ordered 
 * in advance by a student it will cost half the price of a regular advance 
 * purchase. Tickets purchased ten or more days in advance cost 15, if purchased
 * fewer than 10 days the cost is 20.
 * Complete the StudentAdvance constructor to set the tickets serialNumber and 
 * the number of days the ticket was purchased in advance.
 * Complete the getPrice() method to return the price of the ticket.
 * Complete the toString() method to return a string that adds the notation that 
 * a student ID is required for this ticket.
 */
public class StudentAdvance extends Advance {
    
    /* COMPLETE THIS CONSTRUCTOR
     * This constructor takes the parameter days and will initialize
     * the parent variables serialNumber and days.
     * HINT: You will need to use super to do both.
     */
    public StudentAdvance(int numOfDays) {
        // Insert code here

    }

    /* COMPLETE THIS METHOD
     * Returns the price of the ticket.
     * HINT: You will need to use super.getPrice()
     */
    public double getPrice() {
        // Insert code here
        
        return 0.0;
    }

    /* COMPLETE THIS METHOD
     * Returns a string with the added notation: (student ID required)
     * Example call of toString():
     * Number: 184
     * Price: 20
     * (student ID required)
     * NOTE: If format is not exact you may lose points due to autograding. 
     * Ensure spelling, capitalization, and newline are identical.
     * HINT: You will need to use super.toString()
     */
    public String toString() {
        // Insert code here

        return "";
    }
}