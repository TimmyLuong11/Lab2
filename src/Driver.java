/**
 * Driver class that adds animals to a zoo and displays information about the zoo.
 * Used as a basic test of some of the code's functionality.
 * 
 * @author Stephen Thung
 * @version 2018-01-23
 */
public class Driver
{
    /**
     * The main method which does not utilize args.
     * Simply instantiates two Animal objects, adds
     * them to a zoo, and then prints out information about the zoo.
     * @param args String array taking command-line arguments
     */
    public static void main(String[] args) 
    {
        /*
         * You don't have to change any of this particular code however you may 
         * find it useful to play around with how the code works here.
         */
    	Animal a = new Animal("Green", "Perry", 350.0, 40.1);
    	Animal b = new Animal("Orange", "Tony", 200.5, 15.0);

        // Create a zoo and add animals to it:
        Zoo zoo = new Zoo(1);
        zoo.addAnimal(a); // Gorilla
        zoo.addAnimal(b); // Tiger

        // Print out info about the zoo:
        System.out.println(zoo);
    }
}
