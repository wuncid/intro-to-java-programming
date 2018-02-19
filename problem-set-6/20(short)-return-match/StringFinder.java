// Complete the method in this class to return the first string that starts
// with the target. Return null if no string starts with the target letter.

import java.util.ArrayList;

public class StringFinder
{
    /**
     * Gets the first String that starts with the target letter.
     * 
     * @param   text    the array list to process
     * @param   target  the desired letter
     * @return  the first string starting with target or null if not found
     */
     public String getTarget(ArrayList<String> text, String target)
     {
         int i = 0;
         String startsWith = null;
         boolean found = false;
         
         // repeat loop until the first match or until the end of the arraylist
         while (!found && i < text.size())
         {
             if (text.get(i).substring(0, 1).equals(target))
             {
                 found = true;
             }
             else 
             {
                 i++;
             }
         }
         
         if (found)
         {
             startsWith = text.get(i);
         }
         
         return startsWith;
     }
}