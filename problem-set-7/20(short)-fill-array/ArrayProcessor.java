// Complete the method to fill an int array with random integers between 0 and 100 (exclusive)

import java.util.Random;

public class ArrayProcessor
{
    private Random generator;

    //do not change the constructor
    public ArrayProcessor()
    {
        generator = new Random();
        generator.setSeed(1234); // do not change the seed
    }

    /**
     * Fills the array with random integers between 0 and 100 (exclusive)
     * 
     * @param values, the int[] that you need to fill with random integers
     */
    public void fill(int[] values)
    {
        // Fill the array, values, with random numbers between 0 and 100(exclusive)
        for (int i = 0; i < values.length; i++)
        {
            values[i] = generator.nextInt(100);
        }
    }
}
