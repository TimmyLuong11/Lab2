import java.util.Arrays;

/**
 * Class to represent a zoo. Holds a list of animals that are present at the zoo.
 * Calculates statistics about these animals.
 * 
 * @author Stephen Thung
 * @version 2018-01-23
 */
public class Zoo
{
    /**
     * Array to keep track of all of the Zoo's animals.
     * 
     * The size of the array is the capacity of the zoo. This should match the value of the
     * member variable "capacity".
     * 
     * The number of animals in the zoo may be less than the capacity of the zoo. For example,
     * the zoo may be able to hold 5 animals at a given point (array size/capacity = 5), but only
     * contain 2 animals (numAnimals=2).
     * 
     * When an animal is added, it should be added in the first free index. I.e. if there are 2
     * animals in the array, when a third is inserted it should be inserted in index 2, as arrays
     * start from 0.
     * 
     * When an animal should be added but the zoo is full, the zoo must be expanded to increase
     * capacity.
     */
    private Animal[] animals;

    /**
     * The number of animals present in the zoo.
     */
    private int numAnimals;
    
    /**
     * The number of animals that the zoo can currently hold.
     * Should always be equal to the size of the animals array.
     */
    private int capacity;

    /**
     * Default Constructor
     * 
     * Initializes the zoo capacity (and array size) to an initial value
     * Sets the numAnimals to 0
     * 
     * @param initialCapacity The initial number of animals that the zoo can hold.
     */
    public Zoo(int intialCapacity) 
    {
        // TODO: complete this...
    	capacity =  intialCapacity;
    	animals = new Animal[intialCapacity];
    	numAnimals = 0;
    }

    /**
     * Doubles the capacity of the zoo (both the variable and the size of the array).
     * 
     * Remember: an array's size is immutable - it cannot be changed. Instead, to "increase" the size of the
     * animals array, you will need to create a new array with a larger size, copy over the data in the "animals"
     * array, and update the reference of the "animals" array to the new array.
     */
    private void expandZoo()
    {
        // TODO: complete this...
    	capacity = capacity * 2; 
    	Animal[] newAnimals = new Animal[capacity];
    	for (int index = 0; index < animals.length; ++index)
    	{ 
    		newAnimals[index] = animals[index];
    	}
    	animals = newAnimals;
    }
    
    /**
     * Add a single animal to the zoo. Adds the animal into the animals array and updates the number of animals.
     * Expands the animals array if there is not enough room to store a new animal (zoo capacity is exceeded).
     * 
     * @param ani The animal to be added to the zoo.
     */
    public void addAnimal(Animal ani)
    {
        // TODO: complete this...
    	int counter = 0; 
    	if(capacity == numAnimals)
    	{
    		this.expandZoo();
    	}
    	
    	for(int index = numAnimals; index < animals.length; ++index)
    	{
    		if(animals[index] == null && counter != 1 )
    		{
    			animals[index] = ani;
    			counter++;
    			numAnimals++;	
			}
		}
    }

    /**
     * Loop over all the Animals in the zoo to compute the total height.
     * 
     * @return The sum of height of animals in the zoo.
     */
    public double getTotalHeight() 
    {
        // TODO: complete this...
    	double height = 0;
    	for(int index = 0; index < animals.length; ++index)
    	{
    		height = height + animals[index].getHeight();
    	}
    	return height;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight.
     * 
     * @return Average weight (rounded down) of all animals in the zoo.
     */
    public int getAverageWeight()
    {
        // TODO: complete this...
    	int weight = 0;
    	int counter = 0;
    	for(int index = 0; index < animals.length; ++index)
    	{
    		weight = (int) (weight + animals[index].getWeight());
    		counter++;
    	}
    	return weight/counter;
    }
    
    /**
     * Loop over all the Animals in the zoo to compute the average weight over all animals that
     * match the given color.
     * 
     * (Be sure to divide by the number of animals that match the color, not the total number of animals)
     * 
     * @param color The average weight is computed for animals of this color.
     * @return Average weight (rounded down) of all animals of a certain color in the zoo.
     */
    public int getAverageWeight(String color)
    {
        // TODO: complete this...
    	int weight = 0;
    	int counter = 0;
    	for(int index = 0; index < animals.length; ++index)
    	{
    		if(animals[index].getColor().equals(color))
    		{
    			weight = (int) (weight + animals[index].getWeight());
        		counter++;
    		}
    	}
    	return weight/counter;
    }

    /**
     * Retrieve the array that constitutes the animals in the zoo.
     * 
     * @return The Animal array representing the zoo.
     */
    public Animal[] getAnimals()
    {
        return animals;
    }
    
    /**
     * Get the zoo's capacity.
     * 
     * @return The zoo's capacity.
     */
    public int getCapacity()
    {
    	return capacity;
    }

    /**
     * Print out formatted information about the animals in the zoo.
     * 
     * @return A string representing the animals in the zoo. Formatted as:
     * "These animals live in the zoo: \n" +
     * for each animal in the animals array (starting from index 0), the toString of the animal
     */
    public String toString() 
    {
        // TODO: complete this...
    	return String.format("These animals live in the zoo: \n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace("\n, ", "\n"));
    }
}
