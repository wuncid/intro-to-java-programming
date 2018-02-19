// This modifies the previous problem. Start with that solution as your base
// Complete the code to write nested loops that make the a pattern of brackets: a
// rows x colomuns figure of []
// For example if rows = 2 and columns = 5, the figure will look like this:
//[][][][][]
//[][][][][]

public class Drawings
{
    /**
     * Prints a rows by column array of blocks ([])
     * 
     * @param rows the number of rows of []
     * @param columns the number of columns of []
     */
    public void blockPrinter(int rows, int columns)
    {
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
