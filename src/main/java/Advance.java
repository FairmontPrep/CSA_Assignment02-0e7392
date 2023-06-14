/* INSTRUCTIONS
 * The advance class is a child class of Ticket. If a ticket is ordered
 * in advance it will cost less than a walkup. Tickets purchased ten or
 * more days in advance cost 30, if puchased fewer than 10 days the cost 
 * is 40.
 * Complete the Advance constructor to set the tickets serialNumber and 
 * the number of days the ticket was purchased in advance.
 * Complete the getPrice() method to return the price of the ticket based
 * on how many days the ticket was purchased in advance.
 */

public class Advance extends Ticket {
    private int days;

    /* COMPLETE THIS CONSTRUCTOR
     * Initializes the parent private variable serialNumber and the local 
     * private variable days.
     * HINT: You will need to use super()
     */
    public Advance(int numOfDays) {
        // Insert code here

    }

    /* COMPLETE THIS METHOD
     * Returns the price of the ticket. 
     * If days >= 10 return 30
     * If days < 10 return 40
     */
    public double getPrice() {
        // Insert code here

        return 0.0;
    }
}