// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)

import java.util.ArrayList;

public class StringArrayUtil
{
    /**
     * Finds the shortest string in an array list of strings.
     * 
     * @param   words   ArrayList of strings 
     * @return  the shortest word in the words ArrayList (if there are many
     *          words with the same length, then returns the first one)
     */
    public String shortestString(ArrayList<String> words)
    {
        // Initialize the string to the hold the shortest string
        String shortest = words.get(0);

        // Find the shortest string
        for (String word : words)
        {
            if (word.length() < shortest.length())
            {
                shortest = word;
            }
        }

        return shortest;
    }
}
