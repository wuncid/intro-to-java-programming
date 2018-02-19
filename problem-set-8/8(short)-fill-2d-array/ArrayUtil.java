// Complete the method to fill a 2D array of Strings with all X's ("X")
// Use nested loops
//
// Note that the method is static. It does not use the instance variables of
// the class. It gets all the information it needs as a parameter

public class ArrayUtil
{
    /**
     * Fills the given 2D array with X's ("X").
     * 
     * @param the array to fill
     */
    public static void fill2D(String[][] matrix)
    {
        // Fill a 2D array of Strings with all X's ("X")
        for (int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[0].length; column++)
            {
                matrix[row][column] = "X";
            }
        }
    }

}