// Complete the code to write nested loops that make the following pattern of brackets:
//[][][][]
//[][][][]
//[][][][]

public class Drawings
{
    /**
     * Prints a 3 by 4 array of blocks ([])
     */
    public void blockPrinter()
    {
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
