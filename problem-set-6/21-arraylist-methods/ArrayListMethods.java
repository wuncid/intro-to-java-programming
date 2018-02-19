//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

import java.util.ArrayList;

/**
 * A class that contains methods to manipulate an array list of strings.
 */
public class ArrayListMethods
{
    ArrayList<String> list;
    
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted.
     * 
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true; // assume that the array is sorted

        int i = 1;
        
        // go through the list until it appears that the list is not sorted or until the end of the list
        while (sorted && i < list.size())
        {
            // if out of two strings in the array, the one that comes before 
            // is lexiographically greater, then the list is not sorted
            if(list.get(i-1).compareTo(list.get(i)) > 0)
            {
                sorted = false;
            }
            else
            {
                i++;
            }
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger 
     * (the one that is lexiographically greater) of its two neighbors
     */
    public void replaceWithLargerNeighbor()
    {
        for (int i = 2; i < list.size(); i++)
        {   
            if(list.get(i-1).compareTo(list.get(i)) < 0)
            {
                list.set(i-1, list.get(i));
            }
        }
    }

    /**
     * Gets the number of duplicates in the list.
     * 
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // go through the elements by the index in the list
        for (int i = 0; i < list.size(); i++)
        {
            // compare all elements that come after the index i with i
            for (int j = i + 1; j < list.size(); j++)
            {
                String word = list.get(i);
                String anotherWord = list.get(j);
                
                if (word.equals(anotherWord))
                {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order.
     */
    public void xyzToFront()
    {
        int insertAt = 0; 

        for (int i = 0; i < list.size(); i++)
        {
            if ("xyzXYZ".contains(list.get(i).substring(0,1)))
            {
                list.add(insertAt, list.remove(i));
                // the insertion index is incremented to preserve the order
                // of the words that start with x, y or z
                insertAt++;
            }
        }
    }

    /**
     * Gets the string representation of this array list.
     * 
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}
