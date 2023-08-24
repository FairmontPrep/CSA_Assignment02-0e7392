public abstract class Ticket {
    private int serialNumber;   // "unique" ticket id number

    public static void main(String[] args){}
    
    public Ticket() 
    {serialNumber = getNextSerialNumber();}

    // returns the price for this ticket
    public abstract double getPrice();

    // returns a string with information about the ticket
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    // returns a new pseudo-unique serial number using Math.random
    private static int getNextSerialNumber() 
    {return (int)Math.floor(Math.random() * (999 - 100 + 1) + 100);}
}
