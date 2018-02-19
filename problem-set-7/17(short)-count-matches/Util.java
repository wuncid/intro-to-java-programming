// Complete this method to return the number of zeros in the int array
// parameter "values"

public class Util
{
    /**
     * Counts the number of zeroes in the int array.
     * 
     * @return the number of zeroes in the array
     */
    public int getCount(int[] values)
    {
        int count = 0;
        
        for (int value : values)
        {
            // Count the number of zeros in values
            if (value == 0)
            {
                count++;
            }
        }
        
        return count;
    }
}

