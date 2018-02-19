// Complete this class. An array list of Strings called cities has been defined
// for you and populated. You are to print the elements, one to a line (please 
// use a for loop). Afterwards, print the element at index 2.

import java.util.ArrayList;

/**
 * A program that prints the elements of a string arraylist plus the element at index 2.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class GetAndLoopDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Seattle");

        // Use a loop to print the elements one to a line
        // Print the element at index 2
        for (String city : cities)
        {
            System.out.println(city);
        }
        System.out.print(cities.get(2));

    }
}