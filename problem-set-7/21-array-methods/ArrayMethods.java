// Complete the methods below. These methods manipulate Arrays of Strings

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 1" for some tips on 
// how to begin.

import java.util.Arrays;

/**
 * A class that contains methods to manipulate arrays of strings.
 */
public class ArrayMethods
{
    String[] list;
    
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * 
     * @return true if the array  is sorted, else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // Loop through the array and determine that each
        // successive element is larger than the one before it
        for (int i = 1; i < list.length; i++)
        {
            if (list[i].compareTo(list[i-1]) > 0)
            {
                sorted = false;
                break;
            }
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its two neighbors
     */
    public void replaceWithLargerNeighbor()
    {
        for (int i = 1; i < list.length - 1; i++)
        {
            // determines if the element before the i-th element is larger than 
            // the element after and if yes, replaces the element with the element before
            if (list[i-1].compareTo(list[i+1]) > 0)
            {
                list[i] = list[i-1];
            }
            // else replaces the i-th element with the element after
            else
            {
                list[i] = list[i+1];
            }
        }

    }

    /**
     * Gets the number of duplicates in the array.
     * 
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        
        for (int i = 0; i < list.length - 1; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[i].equals(list[j]))
                {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        
        for (int i = 0; i < list.length; i++)
        {
            if ("xyz".contains(list[i].substring(0, 1)))
            {
                String temp = list[i];
                
                for (int j = i; j > insertAt; j--)
                {
                    list[j] = list[j - 1];
                }
                
                list[insertAt] = temp;
                insertAt++;
            }
        }
    }

    /**
     * Gets the string representation of this array.
     * 
     * @return a string representation of the array
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}