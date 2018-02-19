//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:

//public double maxDifference() - Calculates the maximum difference between
//any two consecutive days.

//public double minDifference() - Calculates the minimum difference between
//any two consecutive days

//If Jan 7 temperature is 5 degrees and Jan 8 is -10 degrees, the difference
//between the two temperatures is 15. Not that a temperature drop is simply
//considered a 15 degree change. The difference is always the absolute value.
//Assume that the days are in order in the array, so data[0] is the first day,
//data[1] is the second day, and so on.

/**
 * A class that contains methods to get the minimum and maximum difference of
 * temperatures on any two consecutive days in a temperature array of doubles.
 */
public class TemperatureDifferenceCalculator
{
    private double[] data;

   /**
    * Constructs a TemperatureDifferenceCalculator with the given array
    * 
    * @param the array to process
    */
    public TemperatureDifferenceCalculator(double[] list)
    {
        data = list;
    }

   /**
    * Gets the maximum difference between any two consecutive values
    * 
    * @return the maximum difference
    */
    public double maxDifference()
    {
        double maxDiff = Math.abs(data[0] - data[1]);
        
        for (int i = 1; i < data.length - 1; i++)
        {
            if (Math.abs(data[i] - data[i + 1]) > maxDiff)
            {
                maxDiff = Math.abs(data[i] - data[i + 1]);
            }
        }
        
        return maxDiff;
    }
   
   /**
    * Gets the minimum difference between any two consecutive values
    * 
    * @return the minimum difference
    */
    public double minDifference()
    {
        double minDiff = Math.abs(data[0] - data[1]);
        
        for (int i = 1; i < data.length - 1; i++)
        {
            if (Math.abs(data[i] - data[i + 1]) < minDiff)
            {
                minDiff = Math.abs(data[i] - data[i + 1]);
            }
        }
        
        return minDiff;
    }
}