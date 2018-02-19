// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
// Note that you want to keep the fractional part of the average

import java.util.ArrayList;

public class StringArrays
{
    /**
     * Finds the average length of the words in an array list of strings
     * 
     * @param   words   ArrayList of strings 
     * @return  average length of words in the words ArrayList
     */
    public double averageCountPerWord(ArrayList<String> words)
    {
        double average = 0.0;
        double count = 0.0; //defined as double so we do double division
        int totalLength = 0;

        // Find the total number of characters in all the words
        for (String word : words)
        {
            totalLength = totalLength + word.length();
            count++;
        }

        // Calculate the average
        if (count != 0)
        {
            average = totalLength / count;
        }

        return average;
    }
}
