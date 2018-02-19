//Translate the following pseudocode for randomly permuting the characters in
//a string into a method in the given Java class.

//Read a word.
//Repeat word.length() times
//Pick a random position i in the word, but not the last position.
//Pick a random position j > i in the word. (this is tricky)
//Swap the letters at positions j and i.
//Print the word.

//To swap the letters, construct substrings as follows:

//(image of swapping,PNG)

//Create and return the string:
//   first + word.substring(j, j + 1) + middle
//         + word.substring(i, i + 1) + last

//I recommend that you implement and test the swapping before implementing
//the loop. If something is wrong in the swap, it will be much more difficult
//to find it you have executed the swap many times. That is an example of
//step-wise refinement. Code a little, test, code a little more.

import java.util.Random;

/**
 * Word class with a word scramble method.
 */
public class Word
{
   private Random generator = new Random();

   /**
     * Contructs a Word.
     */
   public Word()
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
   }
   
   /**
    * Gets a version of this word with the leters scrambled
    * 
    * @param word the string to scramble
    * @return the scrabled string
    */
   public String scramble(String word)
   {
      int length = word.length();
      
      for (int n = 0; n < length; n++)
      {
          int i = generator.nextInt(length - 1); // first random index in the word
          int j = generator.nextInt(length - i - 1) + i + 1; // random index after i
          
          String first, middle, last;
          
          // if index i is 0, then the first part of the word is an empty string, else
          // all characters before the index i
          if (i == 0)
          {
              first = "";
          }
          else
          {
              first = word.substring(0, i);
          }
          
          // if the index j is right after i, then the middle part is an empty string, else
          // all characters between i and j
          if (i + 1 == j)
          {
              middle = "";
          }
          else
          {
              middle = word.substring(i + 1, j);
          }
          
          // if j is the last index, then there the last string is empty
          if (j == length - 1)
          {
              last = "";
          }
          else
          {
              last = word.substring(j + 1, length);
          }
          
          // swap two characters in the word
          word = first + word.substring(j, j + 1) + middle + word.substring(i, i + 1) + last;
      }
      
      return word;    
   }
}
