// Complete this class to do the following.
// 1. Define and create an ArrayList of Strings called animals
// 2. Add the string "ape"
// 3. Add the string "dog"
// 4. Add the string "horse"
// 5. print the arraylist

import java.util.Scanner;
import java.util.ArrayList;

/**
 * A program to test the arraylist .add method.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class AddTester
{
    public static void main(String[] args)
    {
        // Define and create an ArrayList of Strings called animals
        ArrayList<String> animals = new ArrayList<String>();

        // Add the strings "ape", "dog", "horse"
        animals.add("ape");
        animals.add("dog");
        animals.add("horse");

        System.out.println(animals);
        System.out.println("Expected: [ape, dog, horse]");
    }
}

