/* INSTRUCTIONS
 * Populate this class with a constructor that takes an int parameter
 * and two methods called getCurrentStop() and move().
 * 
 * The bus moves back and forth along a single route, making stops along 
 * the way. The stops are numbered consecutively ranging from 1 to n. You 
 * may assume that the number of stops will always be greater than 1.
 * The bus starts at the first stop and is initially heading toward the 
 * last stop. When the bus reaches the first or last stop, it reverses 
 * direction.
 */

public class Bus {
    private int numStops;
    private int currentStop;
    private int currentDirection;

    /* COMPLETE THIS CONSTRUCTOR
     * Your constructor should initialize all of your private local
     * variables. n is the number of stops this bus has on its route.
     * The currentStop will always start at 1. The currentDirection 
     * will inform your move() method whether the bus stop number is 
     * increasing or decreasing.
     */
    public Bus (int n) {
        // Insert code here

    }

    /* COMPLETE THIS METHOD
     * getCurrentStop() will return the number of the current stop the
     * bus is at. This is known as a accessor method (AKA "getter").
     */
    public int getCurrentStop() {
        // Insert code here

        return 0;
    }

    /* COMPLETE THIS METHOD
     * move() will move the bus to the next stop by 1. When the bus reaches 
     * the first or the last stop, it reverses direction.
     */
    public void move() {
        // Insert code here

    }
}