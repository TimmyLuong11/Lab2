/**
 * Class to represent an animal in a zoo. Animals have a color, name, weight, and height.
 * 
 * @author Stephen Thung
 * @version 2019-01-23
 */
public class Animal 
{
    /**
     * The color of the animal
     */
    private String color;
    
    /**
     * The name of the animal
     */
    private String name;

    /**
     * The weight of the animal in pounds
     */
    private double weight;

    /**
     * The height of the animal in inches
     */
    private double height;

    /**
     * The age of the animal
     */
   

    /**
     * Empty (Default) Constructor
     * 
     * Sets the weight to 0, height to 0, name to "noname", and color to "unknown"
     */
    public Animal()
    {
    	// TODO: complete this...
    	weight = 0;
    	height = 0;
    	name = "noname";
    	color = "unknown";
    }
    
    /**
     * Animal constructor setting all fields.
     * 
     * @param color The animal color.
     * @param name The animal's name.
     * @param weight The animal's weight in pounds.
     * @param height The animal's height in inches.
     */
    public Animal(String color, String name, double weight, double height)
    {
    	// TODO: complete this...
    	this.color = color;
    	this.name = name;
    	this.weight = weight;
    	this.height = height;
    }
   /**
    * -getColor()
    * -getName()
    * -getWeight()
    * -getHeight()
    */
    // TODO: add getters...
    public String getColor()
    {
    	return color;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public double getWeight()
    {
    	return weight;
    }
    public double getHeight()
    {
    	return height;
    }

    /**
     * When the user needs to print out info about an animal, present
     * the animal in order of color, name, weight, and height
     * 
     * @return The string representation of the Animal class, formatted as:
     *         "(name), a (color)-colored animal. (weight) pounds, (height) inches.\n"
     * Weight and height are formatted to one decimal place.
     */
    public String toString()
    {
        return String.format("%s, a %s-colored animal. %.1f pounds, %.1f inches\n", name, color, weight, height);
    }
}
