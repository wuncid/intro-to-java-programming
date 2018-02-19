// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to create a Scanner object to read input from the user.

import java.util.Scanner;

public class InputWithDo
{
    /**
     * Gets a number between 1 and 10 (inclusive) from the user
     * 
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        int number = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter an integer >=1 and <=10: ");
            while(!scan.hasNextInt())
            {
                System.out.print("Invalid input, enter an integer: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while (number < 1 || number > 10);
        
        return number;
    }
}